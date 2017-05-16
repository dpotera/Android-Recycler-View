package pl.potera.recyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import pl.potera.recyclerview.data.PhotoTiles
import pl.potera.recyclerview.fragment.PhotoTilesFragment

class MovieDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_details)

        val photos = intent.extras.getSerializable("photos") as PhotoTiles

        val fragment = PhotoTilesFragment()
        val bundle = Bundle()
        bundle.putSerializable("photos", photos)
        fragment.arguments = bundle
        val transaction = fragmentManager.beginTransaction()
        transaction.add(R.id.fragment, fragment)
        transaction.commit()
    }
}
