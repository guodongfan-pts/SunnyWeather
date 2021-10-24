package com.sunnyweather.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sunnyweather.android.databinding.ActivityMainBinding
import com.sunnyweather.android.logic.network.PlaceService
import com.sunnyweather.android.logic.network.ServiceCreator

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.getAppData.setOnClickListener {
            val server = ServiceCreator.create(PlaceService::class.java)
        }
    }
}