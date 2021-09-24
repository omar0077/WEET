package com.weet.weet.view.profile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import com.weet.weet.R

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_details)
    }

    fun sendMessage(view: View) {
        val intent = Intent(this, PersonalizeProfile::class.java).apply {
            putExtra(EXTRA_MESSAGE, "message")
        }
        startActivity(intent)
    }



}