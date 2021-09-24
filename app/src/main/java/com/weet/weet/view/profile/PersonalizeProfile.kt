package com.weet.weet.view.profile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.view.View
import com.weet.weet.R
import com.weet.weet.view.home.HomeActivity

class PersonalizeProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personalize_profile)
    }

    fun sendMessage(view: View) {
        val intent = Intent(this, HomeActivity::class.java).apply {
            putExtra(AlarmClock.EXTRA_MESSAGE, "message")
        }
        startActivity(intent)
    }
}