package pl.potera.recyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_movie.*

class MovieActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie)

        val movie = intent.extras.getSerializable("movie") as Movie
        Picasso.with(this).load(movie.image).into(image)
        movie_title.text = movie.title
    }
}
