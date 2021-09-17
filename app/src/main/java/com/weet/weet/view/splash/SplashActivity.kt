package com.weet.weet.view.splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.weet.weet.R
import com.weet.weet.utils.ActivityRepo

class SplashActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityRepo.startGetStartedActivity(this)
        finish();
    }
}