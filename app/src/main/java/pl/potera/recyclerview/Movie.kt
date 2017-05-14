package pl.potera.recyclerview

import java.io.Serializable

class Movie (val title: String, val genre: String, val year: String, val icon: String,
             val image: String): Serializable{
    val stars: Number = 0
    var seen: Boolean = false
}