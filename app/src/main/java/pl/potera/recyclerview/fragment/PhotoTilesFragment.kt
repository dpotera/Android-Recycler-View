package pl.potera.recyclerview.fragment

import android.os.Bundle
import android.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_photo_tiles.view.*
import pl.potera.recyclerview.R
import pl.potera.recyclerview.data.PhotoTiles


class PhotoTilesFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) = super.onCreate(savedInstanceState)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_photo_tiles, container, false)
        val photos = arguments?.getSerializable("photos") as? PhotoTiles
        if(photos != null) {
            Picasso.with(view.context).load(photos.photo1).into(view.imageView1)
            Picasso.with(view.context).load(photos.photo2).into(view.imageView2)
            Picasso.with(view.context).load(photos.photo3).into(view.imageView3)
            Picasso.with(view.context).load(photos.photo4).into(view.imageView4)
            Picasso.with(view.context).load(photos.photo5).into(view.imageView5)
            Picasso.with(view.context).load(photos.photo6).into(view.imageView6)
        }
        return view
    }

    override fun onDetach() = super.onDetach()
}
