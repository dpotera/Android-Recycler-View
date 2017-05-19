package pl.potera.recyclerview.data

import java.io.Serializable

class Movie (val title: String, val genre: String, val year: String, val icon: String,
             val image: String, val description: String, val photos: PhotoTiles,
             val actors: Array<Actor>): Serializable {
    var stars: Float = 0f
    var seen: Boolean = false
}