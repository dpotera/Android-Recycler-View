package pl.potera.recyclerview.fragment

import android.os.Bundle
import android.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_movie_info.view.*
import pl.potera.recyclerview.R
import pl.potera.recyclerview.data.Movie

class MovieFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) = super.onCreate(savedInstanceState)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_movie_info, container, false)
        val movie = arguments?.getSerializable("movie") as? Movie
        if (movie != null) {
            view.movie_title.text = movie.title
            Picasso.with(view.context).load(movie.image).into(view.image)
            view.ratingBar.rating = movie.stars
            view.description.text = movie.description
        }
        return view
    }

    override fun onDetach() = super.onDetach()
}
