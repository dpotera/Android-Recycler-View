package pl.potera.recyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.LinearLayoutManager
import android.view.View

import java.util.ArrayList

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.movie_list_row.view.*
import org.jetbrains.anko.intentFor
import pl.potera.recyclerview.data.Actor
import pl.potera.recyclerview.data.Movie
import pl.potera.recyclerview.data.MovieGenerator
import pl.potera.recyclerview.data.PhotoTiles

class MainActivity : AppCompatActivity() {
    private val movieList = ArrayList<Movie>()
    private var mAdapter: MoviesAdapter = MoviesAdapter(movieList)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mLayoutManager = LinearLayoutManager(applicationContext)
        recycler_view.layoutManager = mLayoutManager
        recycler_view.itemAnimator = DefaultItemAnimator()
        recycler_view.addItemDecoration(DividerItemDecoration(this, LinearLayoutManager.VERTICAL))
        recycler_view.adapter = mAdapter

        recycler_view.addOnItemTouchListener(RecyclerTouchListener(applicationContext,
                recycler_view, object : ClickListener {
            override fun onClick(view: View, position: Int) {
                startActivity(intentFor<MovieActivity>("movie" to movieList[position]))
            }

            override fun onLongClick(view: View, position: Int) {
                val movie = movieList[position]
                view.seen.setImageDrawable(getDrawable(
                        if (movie.seen) R.drawable.eye else R.drawable.eye_green))
                movie.seen = !movie.seen
            }
        }))

        prepareMovieData()
    }

    private fun prepareMovieData() {
        movieList.addAll( MovieGenerator.generateMovieList())
        mAdapter.notifyDataSetChanged()
    }

    interface ClickListener {
        fun onClick(view: View, position: Int)

        fun onLongClick(view: View, position: Int)
    }


}