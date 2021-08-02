package com.example.nayasbrevlada

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlin.math.log

class Video : AppCompatActivity() {


    var mediaController: MediaController?= null;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)
        val movie = intent.getIntExtra("movie",0)



        var videoView = findViewById<VideoView>(R.id.videoView);
        if(mediaController == null){
            mediaController = MediaController(this);
            mediaController!!.setAnchorView(videoView);
        }
        videoView!!.setMediaController(mediaController)

        when (movie) {
            1 -> videoView.setVideoURI(Uri.parse("android.resource://" + packageName + "/" + R.raw.harrys_hare))
            2 -> videoView.setVideoURI(Uri.parse("android.resource://" + packageName + "/" + R.raw.tandborsten))
            3 -> videoView.setVideoURI(Uri.parse("android.resource://" + packageName + "/" + R.raw.flygarhunden))
            4 -> videoView.setVideoURI(Uri.parse("android.resource://" + packageName + "/" + R.raw.trafiklat))
            else -> { // Note the block

            }
        }

        videoView.requestFocus()
        videoView.start()
        videoView.setOnCompletionListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        var exit = findViewById<ImageButton>(R.id.imageButton)
        exit.setOnClickListener{

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }



    }
}