package com.weet.weet.view.getStarted

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.VideoView
import com.weet.weet.R




class GetStartedActivity : AppCompatActivity() {

    private lateinit var videoView: VideoView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_started)

        configureUI()

    }

    private fun configureUI() {
        videoView = findViewById<VideoView>(R.id.bgVideoView)
        val uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.bg_vid)
        videoView.setVideoURI(uri)
        videoView.start()
    }
}