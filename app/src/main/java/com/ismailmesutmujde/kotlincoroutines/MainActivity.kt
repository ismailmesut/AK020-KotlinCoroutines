package com.ismailmesutmujde.kotlincoroutines

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Coroutines
        // Light Weightness
        /*
        GlobalScope.launch {
            repeat(100000) {
                launch {
                    println("android")
                }
            }
        }
         */

    }
}