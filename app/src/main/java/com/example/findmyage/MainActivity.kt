package com.example.findmyage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.findmyage.databinding.ActivityMainBinding
import java.util.Calendar


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
      /*
        binding.buGetAge.setOnClickListener {

        }
       */
    }
    fun BuClickEvent(view: View){
        val yearOfBirth=binding.etDOB.text.toString().toInt()
        val currentYear=Calendar.getInstance().get(Calendar.YEAR)
        val age=currentYear-yearOfBirth
        binding.tvShowAge.text="your age is "+age+" years"
    }
}