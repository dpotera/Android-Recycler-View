package pl.potera.recyclerview

import android.os.Bundle
import android.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_movie_info.view.*

class MovieFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_movie_info, container, false)

        val movie = arguments?.getSerializable("movie") as? Movie
        view.movie_title.text = movie?.title ?: ""
        Picasso.with(view.context).load(movie?.image).into(view.image)
        return view
    }

    override fun onDetach() {
        super.onDetach()
    }

}
