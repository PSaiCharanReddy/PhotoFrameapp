package com.microsoft.photoframeapp

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.microsoft.photoframeapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var currentImage=0
    lateinit var binding:ActivityMainBinding
    lateinit var image: ImageView
    val names= arrayOf("Mr Reddy","MR Reddy Logo","Pinkish Wallpaper","Owner Of Mr Reddy Group")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        var prev=binding.imgprevious
        val next=binding.imgnext
        prev.setOnClickListener(){
            val currentImageToString="pic$currentImage"
            val idcurrentImageToString=this.resources.getIdentifier(currentImageToString,"id",packageName)
        image=findViewById(idcurrentImageToString)
            image.alpha=0f

            currentImage=(4+currentImage-1)%4;
            val currentImageToShow="pic$currentImage"
            binding.name.text=names[currentImage]
            val idcurrentImageToShowInt=this.resources.getIdentifier(currentImageToShow,"id",packageName)
            image=findViewById(idcurrentImageToShowInt)
            image.alpha=1f

        }
        next.setOnClickListener(){
            val currentImageToString="pic$currentImage"
            val idcurrentImageToString=this.resources.getIdentifier(currentImageToString,"id",packageName)
            image=findViewById(idcurrentImageToString)
            image.alpha=0f

            currentImage=(4+currentImage+1)%4;

            binding.name.text=names[currentImage]
            val currentImageToShow="pic$currentImage"
            val idcurrentImageToShowInt=this.resources.getIdentifier(currentImageToShow,"id",packageName)
            image=findViewById(idcurrentImageToShowInt)
            image.alpha=1f

        }
    }
}