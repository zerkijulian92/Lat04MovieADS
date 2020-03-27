package com.takatutustudio.lat04movie.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.takatutustudio.lat04movie.R
import com.takatutustudio.lat04movie.adapter.AllMovieAdapter
import com.takatutustudio.lat04movie.model.FilmModel

import kotlinx.android.synthetic.main.activity_all_movie.*
import kotlinx.android.synthetic.main.content_all_movie.*

class AllMovieActivity : AppCompatActivity() {

    private var datalist = ArrayList<FilmModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_all_movie)

        datalist = intent.getParcelableArrayListExtra("data")

        rv_movie_all.layoutManager = LinearLayoutManager(this)


        rv_movie_all.adapter =
            AllMovieAdapter(datalist) {
                val intent = Intent(this, DetailActivity::class.java)
                    .putExtra("data", it)
                startActivity(intent)
            }

    }

}
