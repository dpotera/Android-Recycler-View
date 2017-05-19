package pl.potera.recyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import pl.potera.recyclerview.data.Movie
import pl.potera.recyclerview.data.PhotoTiles
import pl.potera.recyclerview.fragment.ActorsFragment
import pl.potera.recyclerview.fragment.PhotoTilesFragment

class MovieDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_details)

        val movie = intent.extras.getSerializable("movie") as Movie

        val fragment = PhotoTilesFragment()
        val bundle = Bundle()
        bundle.putSerializable("photos", movie.photos)
        fragment.arguments = bundle
        var transaction = fragmentManager.beginTransaction()
        transaction.add(R.id.fragment, fragment)
//        transaction.commit()

//        transaction = fragmentManager.beginTransaction()
        val actorsFragment = ActorsFragment()
        val actorsBundle = Bundle()
        actorsBundle.putSerializable("actors", movie.actors)
        actorsFragment.arguments = actorsBundle
        transaction.replace(R.id.fragment2, actorsFragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}
