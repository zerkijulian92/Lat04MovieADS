package com.takatutustudio.lat04movie

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var datalist = ArrayList<FilmModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv_movie.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        datalist.add(
            FilmModel(
                "",
                "",
                "",
                "",
                R.color.colorAccent,
                0,
                0.0f
            )
        )
        rv_movie.adapter = MovieAdapter(datalist){

        }
    }
}
