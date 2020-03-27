package com.takatutustudio.lat04movie.activity

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import com.takatutustudio.lat04movie.R
import com.takatutustudio.lat04movie.model.FilmModel
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // Menangkap Value dari MainActivity
        val data = intent.getParcelableExtra<FilmModel>("data")

        // Inisialisasi (Menampilkan data sesuai id)
        tv_judulfilm.text = data.judul
        tv_genre.text     = data.genre
        tv_desc.text      = data.desc

        // Controller Video
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        videoView.setMediaController(mediaController)

        // Menampilkan video
        videoView.setVideoURI(Uri.parse("android.resource://"+packageName +"/"+data.trailer))
        videoView.start()

       // Fungsi btn_Back
        btn_back.setOnClickListener {
           onBackPressed()
       }
    }
}
