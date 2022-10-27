package com.worldonetop.lawbenefitbalance.data.remote

import com.tickaroo.tikxml.retrofit.TikXmlConverterFactory
import com.worldonetop.lawbenefitbalance.BuildConfig
import com.worldonetop.lawbenefitbalance.data.model.NewsWrapper0
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface NewsService {
    @GET("{type}/")
    suspend fun getNews(
        @Path("type") typeCode: String,
        @Query("pIndex") pageNo: Int = 1,
        @Query("pSize") numOfRows: Int = 10,
        @Query("COMP_MAIN_TITLE") title: String,
        @Query("COMP_CONTENT") content: String,
        @Query("Type") type: String = "xml",
        @Query("KEY") serviceKey: String = BuildConfig.News_KEY
    ): NewsWrapper0
    //1,10,"국회","국회"
    // https://open.assembly.go.kr/portal/openapi/nzdppcljavkxnylqs/?pIndex=1&pSize=10&COMP_MAIN_TITLE=%EA%B5%AD%ED%9A%8C&COMP_CONTENT=&Type=xml&KEY=f7d342d87a4b43458123c958d1853512

}