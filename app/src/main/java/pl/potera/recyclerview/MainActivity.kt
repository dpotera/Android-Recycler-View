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

        val hanna = Actor("Hanna Bazur", "https://www.ii.pwr.edu.pl/~hmazur/hania.jpg")
        val obama = Actor("Barak", "http://i2.cdn.turner.com/cnnnext/dam/assets/170110212027-01-obama-slider-2008-super-169.jpg")
        val putin = Actor("Vladimir", "https://cdn.theatlantic.com/assets/media/img/photo/2011/09/vladimir-putin-action-man/p34_DWI22303/main_900.jpg?1420519465")

        var movie = Movie("Mad Fraś: Fury swim", "Action & Adventure", "2015",
                "http://orig07.deviantart.net/e532/f/2016/027/2/8/mad_max___icon_by_blagoicons-d9pkjal.png",
                "https://zdjecia.pl.sftcdn.net/pl/scrn/69711000/69711274/mad-max-01-700x401.jpg",
                "Mówisz 'Mad Max', myślisz: 'Wojownik szos'. Choć w pierwszej części wylano fundamenty pod szacowną serię, a trzecia przeniosła cykl w stratosferę kiczu, wszystko, co najlepsze, wydarzyło się w sequelu. To właśnie w nim majestat jałowego świata – stworzonego za dziesięciokrotnie większe pieniądze niż w oryginale – stał się bezdyskusyjny. To wówczas Mel Gibson zrzucił policyjny uniform i przywdział kultową, rozchełstaną skórę, a reżyser George Miller zamienił bohatera w ikonę popkultury. Dziś Miller ma już siódmy krzyżyk na karku, ale lata na bezdrożach nie poszły na marne: 'Mad Max: Na drodze gniewu' to kino akcji równie szlachetne jak stojące za nim intencje. Zrodzone z potrzeby i nakręcone z miłością. Opowiedziane z pasją człowieka, który wie, że od wściekłej amazonki z mechaniczną dłonią lepsza jest tylko buchająca ogniem gitara. ",
                PhotoTiles(
                        "http://core0.staticworld.net/images/idge/imported/imageapi/2014/09/11/16/slide_image_paul_java_5-100422082-orig.jpg",
                        "http://images.gr-assets.com/books/1387740315l/666032.jpg",
                        "http://3.bp.blogspot.com/-lBWWrZbL1Cc/VVsP1IvfsvI/AAAAAAAAkxg/iiismP1Zqs4/s1600/mad-mad-motorcycle-fury-road.jpeg",
                        "https://ocdn.eu/pulscms-transforms/1/jOlktkpTURBXy85NGRkNmY2MGFkOTVjMjBiYjZhOTM3NzgyODkxYjljMS5qcGeSlQMCAM0D-s0CPJMFzQMgzQHC",
                        "https://radiogra.pl/pliki/2015/11/Politechnika-Wroclawska.jpg",
                        "http://photos.wikimapia.org/p/00/01/56/37/69_big.jpg"
                ),
                arrayOf(hanna, obama, putin)
            )
        movieList.add(movie)


//        movie = Movie("Dying in Access", "Drama", "2017",
//                "https://cdn.zapier.com/storage/services/81b8d86866f3cfbe61759985bdfec9d0.128x128.png",
//                "http://www.quackit.com/pix/microsoft_access/microsoft_access_2016/howto/how_to_create_a_totals_row_in_access_2016_5.png")
//        movieList.add(movie)
//
//        movie = Movie("Inside out", "Animation, Kids & Family", "2015",
//                "https://68.media.tumblr.com/avatar_f2601cb2d594_128.png",
//                "http://moviecitynews.com/wp-content/uploads/2015/06/inside-out-651.jpg")
//        movieList.add(movie)
//
//        movie = Movie("Mission Impossible finish studies", "Action", "2015",
//                "https://img.utdstc.com/icons/256/mission-impossible-roguenation-android.png",
//                "http://metrograph.com/uploads/films/unspecified-2-1462727223-726x388.jpg")
//        movieList.add(movie)
//
//        movie = Movie("PWR drama", "Drama", "2015",
//                "https://scontent.fwaw3-1.fna.fbcdn.net/v/t1.0-9/16003247_674518666062410_1974950114795690614_n.jpg?oh=1b6eac171902f0a32c4f0d4d929b6a1b&oe=59C0CB2E",
//                "https://scontent.fwaw3-1.fna.fbcdn.net/v/t1.0-9/16003247_674518666062410_1974950114795690614_n.jpg?oh=1b6eac171902f0a32c4f0d4d929b6a1b&oe=59C0CB2E")
//        movieList.add(movie)
//
//        movie = Movie("Star Wars: Episode VII - The Force Awakens", "Action", "2015")
//        movieList.add(movie)
//
//        movie = Movie("Shaun the Sheep", "Animation", "2015")
//        movieList.add(movie)
//
//        movie = Movie("The Martian", "Science Fiction & Fantasy", "2015")
//        movieList.add(movie)
//
//        movie = Movie("Up", "Animation", "2009")
//        movieList.add(movie)
//
//        movie = Movie("Star Trek", "Science Fiction", "2009")
//        movieList.add(movie)
//
//        movie = Movie("The LEGO Movie", "Animation", "2014")
//        movieList.add(movie)
//
//        movie = Movie("Iron Man", "Action & Adventure", "2008")
//        movieList.add(movie)
//
//        movie = Movie("Aliens", "Science Fiction", "1986")
//        movieList.add(movie)
//
//        movie = Movie("Chicken Run", "Animation", "2000")
//        movieList.add(movie)
//
//        movie = Movie("Back to the Future", "Science Fiction", "1985")
//        movieList.add(movie)
//
//        movie = Movie("Raiders of the Lost Ark", "Action & Adventure", "1981")
//        movieList.add(movie)
//
//        movie = Movie("Goldfinger", "Action & Adventure", "1965")
//        movieList.add(movie)
//
//        movie = Movie("Guardians of the Galaxy", "Science Fiction & Fantasy", "2014")
//        movieList.add(movie)

        mAdapter.notifyDataSetChanged()
    }

    interface ClickListener {
        fun onClick(view: View, position: Int)

        fun onLongClick(view: View, position: Int)
    }


}