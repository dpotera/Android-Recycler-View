package pl.potera.recyclerview

import android.os.Bundle
import android.support.v4.app.FragmentActivity

class MovieActivity : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie)
        val movie = intent.extras.getSerializable("movie") as Movie

        val fragment = MovieFragment()
        val bundle = Bundle()
        bundle.putSerializable("movie", movie)
        fragment.arguments = bundle
        val transaction = fragmentManager.beginTransaction()
        transaction.add(R.id.fragment, fragment)
        transaction.commit()
    }
}
