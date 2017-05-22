package pl.potera.recyclerview.data

class MovieGenerator {

    companion object {
        fun generateMovieList(): ArrayList<Movie> {
            val hanna = Actor("Hanna Bazur", "https://www.ii.pwr.edu.pl/~hmazur/hania.jpg")
            val obama = Actor("Barak", "http://i2.cdn.turner.com/cnnnext/dam/assets/170110212027-01-obama-slider-2008-super-169.jpg")
            val putin = Actor("Vladimir", "https://cdn.theatlantic.com/assets/media/img/photo/2011/09/vladimir-putin-action-man/p34_DWI22303/main_900.jpg?1420519465")
            val boov = Actor("Boov", "https://vignette3.wikia.nocookie.net/dreamworks/images/d/d7/Oh.png/revision/latest?cb=20160626125748")
            val joy = Actor("Joy", "https://img.clipartfest.com/0361b806842c6f957766f8e7916c551c_find-out-what-joy-from-joy-clipart-inside-out_638-638.jpeg")
            val tom = Actor("Tom Cruise", "https://s-media-cache-ak0.pinimg.com/736x/c0/de/d8/c0ded861585e2d3714601cc028f05813.jpg")
            val boy = Actor("Boy from Up", "https://vignette3.wikia.nocookie.net/disney/images/2/27/Russell-up.jpg/revision/latest?cb=20100707183306")

            val movieList = ArrayList<Movie>()

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


            movie = Movie("Dying in Access", "Drama", "2017",
                    "https://cdn.zapier.com/storage/services/81b8d86866f3cfbe61759985bdfec9d0.128x128.png",
                    "http://www.quackit.com/pix/microsoft_access/microsoft_access_2016/howto/how_to_create_a_totals_row_in_access_2016_5.png",
                    "Microsoft Access – system obsługi relacyjnych baz danych, wchodzący w skład pakietu biurowego Microsoft Office dla środowiska Windows.",
                    PhotoTiles(
                            "https://www.quackit.com/pix/microsoft_access/tutorial/tutorial_home_access_2016.png",
                            "http://pad3.whstatic.com/images/thumb/9/96/Use-Microsoft-Access-Step-34-Version-2.jpg/aid1117662-v4-728px-Use-Microsoft-Access-Step-34-Version-2.jpg",
                            "https://tctechcrunch2011.files.wordpress.com/2016/07/microsoft.jpg?w=738",
                            "https://c.s-microsoft.com/en-us/CMSImages/lrn-share-site-ms-logo.png?version=bf62922f-fda3-d328-e220-b699eac0d6c0",
                            "https://www.ii.pwr.edu.pl/~hmazur/hania.jpg",
                            "https://corporatewatch.org/sites/default/files/microsoft_logo.jpeg"
                    ),
                    arrayOf(hanna, hanna, hanna)
            )
            movieList.add(movie)

            movie = Movie("Inside out", "Animation, Kids & Family", "2015",
                    "https://68.media.tumblr.com/avatar_f2601cb2d594_128.png",
                    "http://moviecitynews.com/wp-content/uploads/2015/06/inside-out-651.jpg",
                    "After young Riley is uprooted from her Midwest life and moved to San Francisco, her emotions - Joy, Fear, Anger, Disgust and Sadness - conflict on how best to navigate a new city, house, and school.",
                    PhotoTiles(
                            "https://vignette4.wikia.nocookie.net/villains/images/0/04/Boov.JPG/revision/latest?cb=20150611154736",
                            "https://neuwritesd.files.wordpress.com/2015/07/rileys-emotions-inside-out.jpg",
                            "https://media.licdn.com/mpr/mpr/shrinknp_800_800/AAEAAQAAAAAAAAIyAAAAJGEzMTQ0ZDc5LTM3MTYtNDg0My05NGI1LWZkNWExMmI3MWE5ZQ.jpg",
                            "https://blogs-images.forbes.com/markhughes/files/2015/06/INSIDE-OUT-13.jpg?width=960",
                            "https://blogs-images.forbes.com/jvchamary/files/2015/08/Inside-Out-RGB-d250_82cQpub2.pub16.207-1940x1091.jpg?width=960",
                            "http://blog.ssis.edu.vn/102537/wp-content/uploads/sites/162/2015/09/Inside-Out-21.jpg"
                    ),
                    arrayOf(boov, joy, obama)
            )
            movieList.add(movie)

            movie = Movie("Up", "Animation", "2009",
                    "http://s1.evcdn.com/images/block/I0-001/038/436/500-4.jpeg_/planters-bank-presents-disney-pixars-up-00.jpeg",
                    "http://i430.photobucket.com/albums/qq26/coisasminhascoisas/cinema/up-movie-1.jpg",
                    "opis",
                    PhotoTiles(
                            "http://i430.photobucket.com/albums/qq26/coisasminhascoisas/cinema/up-movie-1.jpg",
                            "https://a.dilcdn.com/bl/wp-content/uploads/sites/25/2014/05/Up-02.jpg",
                            "http://cdn.images.express.co.uk/img/dynamic/36/590x/up_pixar-132989.jpg",
                            "http://orig10.deviantart.net/358c/f/2012/216/d/4/fanart_up_disney_pixar_by_didi_esmeralda-d59ttj8.jpg",
                            "https://i.ytimg.com/vi/ORFWdXl_zJ4/hqdefault.jpg",
                            "https://vignette3.wikia.nocookie.net/disney/images/2/27/Russell-up.jpg/revision/latest?cb=20100707183306"
                    ),
                    arrayOf(boy, joy, boov))
            movieList.add(movie)

            movie = Movie("Mission Impossible finish studies", "Action", "2015",
                    "https://img.utdstc.com/icons/256/mission-impossible-roguenation-android.png",
                    "http://metrograph.com/uploads/films/unspecified-2-1462727223-726x388.jpg",
                    "Od kilku tygodni na ekranach światowych kin triumfy święci \"Mission: Impossible III\" - najnowsza odsłona przygód specjalisty od zadań niemożliwych Ethana Hunta. Z tej okazji do sklepów trafiło specjalne, dwupłytowe wydanie pierwszej części kinowego cyklu zrealizowanej w 1996 roku przez Briana De Palmę. ",
                    PhotoTiles(
                            "https://blogs-images.forbes.com/jvchamary/files/2015/08/Inside-Out-RGB-d250_82cQpub2.pub16.207-1940x1091.jpg?width=960",
                            "http://blog.ssis.edu.vn/102537/wp-content/uploads/sites/162/2015/09/Inside-Out-21.jpg",
                            "https://www.ii.pwr.edu.pl/~hmazur/hania.jpg",
                            "https://corporatewatch.org/sites/default/files/microsoft_logo.jpeg",
                            "https://ocdn.eu/pulscms-transforms/1/jOlktkpTURBXy85NGRkNmY2MGFkOTVjMjBiYjZhOTM3NzgyODkxYjljMS5qcGeSlQMCAM0D-s0CPJMFzQMgzQHC",
                            "https://radiogra.pl/pliki/2015/11/Politechnika-Wroclawska.jpg"
                    ),
                    arrayOf(putin, tom, obama)
            )
            movieList.add(movie)

            movie = Movie("PWR drama", "Drama", "2015",
                    "https://scontent.fwaw3-1.fna.fbcdn.net/v/t1.0-9/16003247_674518666062410_1974950114795690614_n.jpg?oh=1b6eac171902f0a32c4f0d4d929b6a1b&oe=59C0CB2E",
                    "https://scontent.fwaw3-1.fna.fbcdn.net/v/t1.0-9/16003247_674518666062410_1974950114795690614_n.jpg?oh=1b6eac171902f0a32c4f0d4d929b6a1b&oe=59C0CB2E",
                    "Setting up Android Studio takes just a few clicks. (You should have already downloaded Android Studio.) To install Android Studio on Linux, proceed as follows: Unpack the .zip file you downloaded to an appropriate location for your applications, such as within /usr/local/ for your user profile, or /opt/ for shared users.",
                    PhotoTiles(
                            "https://corporatewatch.org/sites/default/files/microsoft_logo.jpeg",
                            "https://ocdn.eu/pulscms-transforms/1/jOlktkpTURBXy85NGRkNmY2MGFkOTVjMjBiYjZhOTM3NzgyODkxYjljMS5qcGeSlQMCAM0D-s0CPJMFzQMgzQHC",
                            "https://radiogra.pl/pliki/2015/11/Politechnika-Wroclawska.jpg",
                            "https://blogs-images.forbes.com/jvchamary/files/2015/08/Inside-Out-RGB-d250_82cQpub2.pub16.207-1940x1091.jpg?width=960",
                            "http://blog.ssis.edu.vn/102537/wp-content/uploads/sites/162/2015/09/Inside-Out-21.jpg",
                            "https://www.ii.pwr.edu.pl/~hmazur/hania.jpg"
                    ),
                    arrayOf(boov, tom, hanna)
            )
            movieList.add(movie)

            movie = Movie("Mad Fraś: Fury swim 1998", "Pain & Adventure", "1410",
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


            movie = Movie("Umieranie w Microsoft Access", "Drama", "2000",
                    "https://cdn.zapier.com/storage/services/81b8d86866f3cfbe61759985bdfec9d0.128x128.png",
                    "http://www.quackit.com/pix/microsoft_access/microsoft_access_2016/howto/how_to_create_a_totals_row_in_access_2016_5.png",
                    "Microsoft Access – system obsługi relacyjnych baz danych, wchodzący w skład pakietu biurowego Microsoft Office dla środowiska Windows.",
                    PhotoTiles(
                            "https://www.quackit.com/pix/microsoft_access/tutorial/tutorial_home_access_2016.png",
                            "http://pad3.whstatic.com/images/thumb/9/96/Use-Microsoft-Access-Step-34-Version-2.jpg/aid1117662-v4-728px-Use-Microsoft-Access-Step-34-Version-2.jpg",
                            "https://tctechcrunch2011.files.wordpress.com/2016/07/microsoft.jpg?w=738",
                            "https://c.s-microsoft.com/en-us/CMSImages/lrn-share-site-ms-logo.png?version=bf62922f-fda3-d328-e220-b699eac0d6c0",
                            "https://www.ii.pwr.edu.pl/~hmazur/hania.jpg",
                            "https://corporatewatch.org/sites/default/files/microsoft_logo.jpeg"
                    ),
                    arrayOf(hanna, hanna, hanna)
            )
            movieList.add(movie)

            movie = Movie("Inside out", "Animation, Kids & Family", "2015",
                    "https://68.media.tumblr.com/avatar_f2601cb2d594_128.png",
                    "http://moviecitynews.com/wp-content/uploads/2015/06/inside-out-651.jpg",
                    "After young Riley is uprooted from her Midwest life and moved to San Francisco, her emotions - Joy, Fear, Anger, Disgust and Sadness - conflict on how best to navigate a new city, house, and school.",
                    PhotoTiles(
                            "https://vignette4.wikia.nocookie.net/villains/images/0/04/Boov.JPG/revision/latest?cb=20150611154736",
                            "https://neuwritesd.files.wordpress.com/2015/07/rileys-emotions-inside-out.jpg",
                            "https://media.licdn.com/mpr/mpr/shrinknp_800_800/AAEAAQAAAAAAAAIyAAAAJGEzMTQ0ZDc5LTM3MTYtNDg0My05NGI1LWZkNWExMmI3MWE5ZQ.jpg",
                            "https://blogs-images.forbes.com/markhughes/files/2015/06/INSIDE-OUT-13.jpg?width=960",
                            "https://blogs-images.forbes.com/jvchamary/files/2015/08/Inside-Out-RGB-d250_82cQpub2.pub16.207-1940x1091.jpg?width=960",
                            "http://blog.ssis.edu.vn/102537/wp-content/uploads/sites/162/2015/09/Inside-Out-21.jpg"
                    ),
                    arrayOf(boov, joy, obama)
            )
            movieList.add(movie)

            movie = Movie("Up and Down", "Anime", "20088",
                    "http://s1.evcdn.com/images/block/I0-001/038/436/500-4.jpeg_/planters-bank-presents-disney-pixars-up-00.jpeg",
                    "http://i430.photobucket.com/albums/qq26/coisasminhascoisas/cinema/up-movie-1.jpg",
                    "opis",
                    PhotoTiles(
                            "http://i430.photobucket.com/albums/qq26/coisasminhascoisas/cinema/up-movie-1.jpg",
                            "https://a.dilcdn.com/bl/wp-content/uploads/sites/25/2014/05/Up-02.jpg",
                            "http://cdn.images.express.co.uk/img/dynamic/36/590x/up_pixar-132989.jpg",
                            "http://orig10.deviantart.net/358c/f/2012/216/d/4/fanart_up_disney_pixar_by_didi_esmeralda-d59ttj8.jpg",
                            "https://i.ytimg.com/vi/ORFWdXl_zJ4/hqdefault.jpg",
                            "https://vignette3.wikia.nocookie.net/disney/images/2/27/Russell-up.jpg/revision/latest?cb=20100707183306"
                    ),
                    arrayOf(boy, joy, boov))
            movieList.add(movie)

            return movieList
        }
    }

}