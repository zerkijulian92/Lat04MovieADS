package com.takatutustudio.lat04movie

import android.content.Intent
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
                "01",
                "Ad Astra",
                "The near future, a time when both hope and hardships drive humanity to look to the stars and beyond. While a mysterious phenomenon menaces to destroy life on planet Earth, astronaut Roy McBride undertakes a mission dan dimana itu ada semua. is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing.",
                "Drama",
                R.drawable.ic_ad_astra,
                R.raw.video_astra_tr,
                0.0f
            )
        )

        datalist.add(
            FilmModel(
                "02",
                "Avengers:Endgame",
                "After the devastating events of Avengers: Infinity War, the universe is in ruins due to the efforts of the Mad Titan, Thanos. With the help of remaining allies, the Avengers must assemble once more in order to undo",
                "Action",
                R.drawable.ic_avengers,
                R.raw.video_avengers_tr,
                0.0f
            )
        )

        datalist.add(
            FilmModel(
                "03",
                "Sonic the Hedgehog",
                "Based on the global blockbuster videogame franchise from Sega, Sonic the Hedgehog tells the story of the world’s speediest hedgehog as he embraces his new home on Earth. In this live-action adventure comedy, Sonic",
                "Action",
                R.drawable.ic_poster_sonic,
                R.raw.video_sonic,
                0.0f
            )
        )

        datalist.add(
            FilmModel(
                "04",
                "Bloodshot (2020)",
                "After he and his wife are murdered, marine Ray Garrison is resurrected by a team of scientists. Enhanced with nanotechnology, he becomes a superhuman, biotech killing machine—'Bloodshot'. As Ray first trains with fellow super-soldiers, he cannot recall anything from his former life. But when his memories flood back and he remembers the man that killed both him and his wife, he breaks out of the facility to get revenge, only to discover that there's more to the conspiracy than he thought.",
                "Action",
                R.drawable.ic_bloodshot,
                R.raw.video_bloodshot_tr,
                0.0f
            )
        )

        datalist.add(
            FilmModel(
                "05",
                "Birds of Prey",
                "After her breakup with the Joker, Harley Quinn joins forces with singer Black Canary, assassin Huntress, and police detective Renee Montoya to help a young girl named Cassandra, who had a hit placed on her after she stole a rare diamond from crime lord Roman Sionis.",
                "Comedy",
                R.drawable.ic_birds_of_prey,
                R.raw.video_birdsprey_tr,
                0.0f
            )
        )

        datalist.add(
            FilmModel(
                "06",
                "The Invisible Man (2020)",
                "When Cecilia's abusive ex takes his own life and leaves her his fortune, she suspects his death was a hoax. As a series of coincidences turn lethal, Cecilia works to prove that she is being hunted by someone nobody can see.",
                "Horror",
                R.drawable.ic_the_invisible_man,
                R.raw.video_theinvisibleman_tr,
                0.0f
            )
        )

        datalist.add(
            FilmModel(
                "07",
                "A Rainy Day in New York (2019)",
                "Two young people arrive in New York to spend a weekend, but once they arrive they're met with bad weather and a series of adventures.",
                "Comedy",
                R.drawable.ic_poster_a_rainy_day_in_new_york,
                R.raw.video_a_rainy_day,
                0.0f
            )
        )

        rv_movie.adapter = MovieAdapter(datalist){

            // Menampilkan Data ke Page Detail (Melempar data Ke DetailActivity)
            val intent = Intent(this, DetailActivity::class.java)
                .putExtra("data", it)
            startActivity(intent)

        }
    }
}
