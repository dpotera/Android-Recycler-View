package pl.potera.recyclerview

import android.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import pl.potera.recyclerview.data.Movie
import pl.potera.recyclerview.fragment.ActorsFragment
import pl.potera.recyclerview.fragment.PhotoTilesFragment

class MovieDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_details)
        val transaction = fragmentManager.beginTransaction()
        actorsTransaction(movieTransaction(transaction), transaction)
        transaction.commit()
    }

    private fun actorsTransaction(movie: Movie, transaction: FragmentTransaction) {
        val actorsFragment = ActorsFragment()
        val actorsBundle = Bundle()
        actorsBundle.putSerializable("actors", movie.actors)
        actorsFragment.arguments = actorsBundle
        transaction.replace(R.id.fragment2, actorsFragment)
    }

    private fun movieTransaction(transaction: FragmentTransaction): Movie {
        val movie = intent.extras.getSerializable("movie") as Movie
        val photoTilesFragment = PhotoTilesFragment()
        val photoBundle = Bundle()
        photoBundle.putSerializable("photos", movie.photos)
        photoTilesFragment.arguments = photoBundle
        transaction.add(R.id.fragment, photoTilesFragment)
        return movie
    }
}
