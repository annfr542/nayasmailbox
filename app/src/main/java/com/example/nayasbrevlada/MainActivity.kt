package com.example.nayasbrevlada

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button_hare = findViewById<ImageButton>(R.id.movie_hare)
        button_hare.setOnClickListener{
            val intent = Intent(this, Video::class.java)
            intent.putExtra("movie", 1)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
            finish();
        }
        val button_tand = findViewById<ImageButton>(R.id.movie_tooth)
        button_tand.setOnClickListener{
            val intent = Intent(this, Video::class.java)
            intent.putExtra("movie", 2)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
            finish();
        }
        val button_hund = findViewById<ImageButton>(R.id.movie_hund)
        button_hund.setOnClickListener{
            val intent = Intent(this, Video::class.java)
            intent.putExtra("movie", 3)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
            finish();
        }
        val button_traffic = findViewById<ImageButton>(R.id.movie_traffic)
        button_traffic.setOnClickListener{
            val intent = Intent(this, Video::class.java)
            intent.putExtra("movie", 4)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
            finish();
        }
    }
}