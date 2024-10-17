package com.example.todoapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.todoapp.R.layout.activity_main

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main)

        if(savedInstanceState == null){

            val my_Fragment = MainFragment()

            supportFragmentManager.beginTransaction()

                .add(R.id.fragment_container,my_Fragment)
                .commit()
        }

    }
}
