package com.worldonetop.lawbenefitbalance.di

import android.content.Context
import com.tickaroo.tikxml.TikXml
import com.tickaroo.tikxml.retrofit.TikXmlConverterFactory
import com.worldonetop.lawbenefitbalance.R
import com.worldonetop.lawbenefitbalance.data.remote.CongressService
import com.worldonetop.lawbenefitbalance.data.remote.NewsService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import java.io.InputStream
import java.security.KeyStore
import java.security.cert.Certificate
import java.security.cert.CertificateFactory
import javax.inject.Singleton
import javax.net.ssl.SSLContext
import javax.net.ssl.TrustManagerFactory
import javax.net.ssl.X509TrustManager

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule{
    private val congressServiceURL = "https://apis.data.go.kr/9710000/"
    private val newsServiceURL = "https://apis.data.go.kr/9710000/"

    @Singleton
    @Provides
    fun provideCongressService(@ApplicationContext context: Context): CongressService {
        return Retrofit.Builder()
            .baseUrl(congressServiceURL)
            .client(provideOkHttpClient(context.resources.openRawResource(R.raw.xml_crt)))
            .addConverterFactory(TikXmlConverterFactory.create(TikXml.Builder().exceptionOnUnreadXml(false).build()))
            .build()
            .create(CongressService::class.java)
    }
    @Singleton
    @Provides
    fun provideNewsService(@ApplicationContext context: Context): NewsService {
        return Retrofit.Builder()
            .baseUrl(newsServiceURL)
            .client(provideOkHttpClient(context.resources.openRawResource(R.raw.news_crt)))
            .addConverterFactory(TikXmlConverterFactory.create(TikXml.Builder().exceptionOnUnreadXml(false).build() ))
            .build()
            .create(NewsService::class.java)
    }

    private fun provideOkHttpClient(caInput: InputStream): OkHttpClient {
        lateinit var tmf: TrustManagerFactory
        lateinit var sslContext: SSLContext
        val cf: CertificateFactory
        val ca: Certificate

        try {
            cf = CertificateFactory.getInstance("X.509")

//            caInput = context.resources.openRawResource(R.raw.xml)

            ca = cf.generateCertificate(caInput)

            // Create a KeyStore containing our trusted CAs
            val keyStoreType = KeyStore.getDefaultType()
            val keyStore = KeyStore.getInstance(keyStoreType).apply{
                load(null, null)
                setCertificateEntry("ca", ca)
            }

            // Create a TrustManager that trusts the CAs in our KeyStore
            val tmfAlgorithm = TrustManagerFactory.getDefaultAlgorithm()
            tmf = TrustManagerFactory.getInstance(tmfAlgorithm)
            tmf.init(keyStore)

            // Create an SSLContext that uses our TrustManager
            sslContext = SSLContext.getInstance("TLS")
            sslContext.init(null, tmf.trustManagers, java.security.SecureRandom())

            caInput.close()
        } catch (e: Exception) {
            e.printStackTrace()
        }

        val logger = HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BASIC
        }

        return OkHttpClient.Builder()
            .addInterceptor(logger)
            .run {
                addInterceptor(HttpLoggingInterceptor().apply {
                    level = HttpLoggingInterceptor.Level.BODY
                })
                sslSocketFactory(
                    sslContext.socketFactory,
                    tmf.trustManagers[0] as X509TrustManager
                )
                build()
            }
    }
}