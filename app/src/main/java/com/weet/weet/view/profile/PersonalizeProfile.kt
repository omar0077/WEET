package com.weet.weet.view.profile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.view.View
import android.view.WindowManager
import com.weet.weet.R
import com.weet.weet.view.home.HomeActivity

class PersonalizeProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)

        setContentView(R.layout.activity_personalize_profile)
    }

    fun sendMessage(view: View) {
        val intent = Intent(this, OptionTagsActivity::class.java).apply {
            putExtra(AlarmClock.EXTRA_MESSAGE, "message")
        }
        startActivity(intent)
    }
}