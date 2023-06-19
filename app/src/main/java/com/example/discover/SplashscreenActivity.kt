package com.example.discover

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashscreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            val intent=Intent(this,SignInActivity::class.java)
            startActivity(intent)
            finish()
        },3000)
    }
}