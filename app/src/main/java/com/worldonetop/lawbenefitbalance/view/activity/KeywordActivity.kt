package com.worldonetop.lawbenefitbalance.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.worldonetop.lawbenefitbalance.databinding.ActivityKeywordBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class KeywordActivity : AppCompatActivity() {
    lateinit var binding: ActivityKeywordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKeywordBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}