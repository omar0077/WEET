package com.weet.weet.view.getStarted

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.VideoView
import com.weet.weet.R
import com.weet.weet.utils.ActivityRepo


class GetStartedActivity : AppCompatActivity() {

    private lateinit var videoView: VideoView
    private lateinit var getStarted: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_started)


        configureUI()
        getStarted = findViewById<Button>(R.id.button)
        getStarted.setOnClickListener{
            ActivityRepo.startLogin(this)
        }
    }

    private fun configureUI() {
        videoView = findViewById<VideoView>(R.id.bgVideoView)
        val uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.bg_vid)
        videoView.setVideoURI(uri)
        videoView.start()



        videoView .setOnPreparedListener { mediaPlayer -> mediaPlayer.isLooping = true }
    }
}