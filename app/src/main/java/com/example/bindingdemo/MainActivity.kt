package com.example.bindingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.bindingdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val student1 = student("2005659", "waLau")

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.myData = student1

        //binding.tvStudentId.text = student1.id
        //binding.tvStudentName.text = student1.name

        //val tv: TextView = findViewById(R.id.tv_student_id)
        //tv.text = student1.id
    }
}