package pl.potera.recyclerview.fragment

import android.os.Bundle
import android.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_actors.view.*

import pl.potera.recyclerview.R
import pl.potera.recyclerview.data.Actor

class ActorsFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) = super.onCreate(savedInstanceState)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_actors, container, false)
        val actors = arguments?.getSerializable("actors") as? Array<Actor>
        if (actors != null) {
            Picasso.with(view.context).load(actors[0].image).into(view.imageView1)
            Picasso.with(view.context).load(actors[1].image).into(view.imageView2)
            Picasso.with(view.context).load(actors[2].image).into(view.imageView3)
            view.textView1.text = actors[0].name
            view.textView2.text = actors[1].name
            view.textView3.text = actors[2].name
        }
        return view
    }

    override fun onDetach() = super.onDetach()
}
