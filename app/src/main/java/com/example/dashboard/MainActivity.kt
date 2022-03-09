package com.example.dashboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.dashboard.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.cv_work.setOnClickListener{
            Toast.makeText(applicationContext,"Work", Toast.LENGTH_SHORT).show()
        }

        binding.cv_education.setOnClickListener{
            Toast.makeText(applicationContext,"Education", Toast.LENGTH_SHORT).show()
        }

        binding.cv_fitness.setOnClickListener{
            Toast.makeText(applicationContext,"Fitness", Toast.LENGTH_SHORT).show()
        }

        binding.cv_gaming.setOnClickListener{
            Toast.makeText(applicationContext,"Gaming", Toast.LENGTH_SHORT).show()
        }

        binding.cv_medical.setOnClickListener{
            Toast.makeText(applicationContext,"Medical", Toast.LENGTH_SHORT).show()
        }

        binding.cv_setting.setOnClickListener{
            Toast.makeText(applicationContext,"Settings", Toast.LENGTH_SHORT).show()
        }

        binding.cv_start_up.setOnClickListener{
            Toast.makeText(applicationContext,"Start Up", Toast.LENGTH_SHORT).show()
        }

        binding.cv_travel.setOnClickListener{
            Toast.makeText(applicationContext,"Travel", Toast.LENGTH_SHORT).show()
        }
    }
}