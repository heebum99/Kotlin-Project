package com.example.lovetest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//activity는 fragment를 담아주는 틀 역할

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}