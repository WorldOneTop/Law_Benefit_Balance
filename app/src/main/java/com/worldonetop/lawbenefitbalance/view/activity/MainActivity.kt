package com.worldonetop.lawbenefitbalance.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.ViewDataBinding
import com.worldonetop.lawbenefitbalance.R
import com.worldonetop.lawbenefitbalance.base.BaseActivity
import com.worldonetop.lawbenefitbalance.data.local.AppDatabase
import com.worldonetop.lawbenefitbalance.data.model.NewsType
import com.worldonetop.lawbenefitbalance.data.remote.CongressService
import com.worldonetop.lawbenefitbalance.data.remote.NewsService
import com.worldonetop.lawbenefitbalance.databinding.ActivityMainBinding
import com.worldonetop.lawbenefitbalance.util.StringConverter
import com.worldonetop.lawbenefitbalance.view.fragment.HomeFragment
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {
    @Inject lateinit var newsService: NewsService
    @Inject lateinit var congressService: CongressService
    @Inject lateinit var db: AppDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        val fragment = HomeFragment()
        fragmentTransaction.add(R.id.fragment, fragment)
        fragmentTransaction.commit()
    }

    override fun initView() {
//        val c =CongressService.create()
        CoroutineScope(Dispatchers.IO).launch {
            Log.d("asd detaile",congressService.getDetailAgenda(1,10,"02",2005110000006,2006011000250,2022090062437).toString())
            Log.d("asd search",congressService.searchBill(1,10,"재활용").toString())
            Log.d("asd agenda",congressService.getLastConference().toString())
            val a = newsService.getNews(NewsType.types[0],1,10,"국회","")
            Log.d("asd news",StringConverter.html(a.row.toString()))

            withContext(Dispatchers.Main){
                binding.test.text = StringConverter.html(a.row.toString())
            }

        }
    }

    override fun initListener() {

    }
}