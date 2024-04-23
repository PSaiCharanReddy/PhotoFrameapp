package com.microsoft.photoframeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.microsoft.photoframeapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var currentImage=0
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        var prev=binding.imgprevious
        val next=binding.imgnext
        prev.setOnClickListener(){
            val current="pic$currentImage"
        }
    }
}