package com.takatutustudio.lat04movie.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.takatutustudio.lat04movie.model.FilmModel
import com.takatutustudio.lat04movie.R

class AllMovieAdapter (private var data: List<FilmModel>,
                       private val listener:(FilmModel) -> Unit)
    : RecyclerView.Adapter<AllMovieAdapter.MovieViewHolder>() {

    lateinit var ContextAdapter : Context

    // onCreateViewHolder
    // -> Inisialisasi untuk view layout item_movie_horizontal
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        ContextAdapter     = parent.context

        val inflatedView : View = layoutInflater.inflate(R.layout.item_movie_vertical, parent, false)
        return MovieViewHolder(
            inflatedView
        )
    }

    // size data yang dilakukan untuk perulanggan
    override fun getItemCount(): Int = data.size

    // onBindViewHolder
    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        // Menghubugkan dan memanggil class binItem
        holder.binItem(data[position], listener, ContextAdapter, position)
    }

    // Inisialisasi data FilmModel
    // MovieViewHolder
    // -> Mengabungkan class MovieViewHolder dengan MovieAdapter ini
    class MovieViewHolder(view : View) : RecyclerView.ViewHolder(view){
        private val ivPoster:ImageView = view.findViewById(R.id.iv_poster)
        private val tvTitle:TextView   = view.findViewById(R.id.tv_title)
        private val tvDesc:TextView    = view.findViewById(R.id.tv_desc)
        private val rbMovie:RatingBar  = view.findViewById(R.id.ratingBar)

        // Menampilkan data yang ada di FilmModel
        fun binItem(data: FilmModel, listener: (FilmModel) -> Unit, context: Context, position:Int) {
            tvTitle.text = data.judul
            tvDesc.text = data.desc

            Glide.with(context)
                .load(data.poster)
                .into(ivPoster)

            rbMovie.rating = data.rating

            itemView.setOnClickListener {
                listener(data)
            }
        }
    }
}