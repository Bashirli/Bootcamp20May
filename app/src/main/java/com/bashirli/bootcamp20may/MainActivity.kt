package com.bashirli.bootcamp20may

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bashirli.bootcamp20may.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}