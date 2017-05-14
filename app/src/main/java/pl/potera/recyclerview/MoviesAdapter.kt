package pl.potera.recyclerview

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.movie_list_row.view.*

class MoviesAdapter(private val moviesList: List<Movie>) : RecyclerView.Adapter<MoviesAdapter.MyViewHolder>() {

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var title: TextView = view.title
        var year: TextView = view.year
        var genre: TextView = view.genre
        var image: ImageView = view.icon
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.movie_list_row, parent, false)

        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val movie = moviesList[position]
        holder.title.text = movie.title
        holder.genre.text = movie.genre
        holder.year.text = movie.year
        Picasso.with(holder.image.context).load(movie.icon).into(holder.image)
    }

    override fun getItemCount(): Int {
        return moviesList.size
    }
}
