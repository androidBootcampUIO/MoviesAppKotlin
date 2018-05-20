package uio.androidbootcamp.moviesapp.model.models

import java.util.*

data class Movie (val id: Long = 0, val posterPath: String, val name: String, val overview: String, val releaseDate: Date = Date()) {

    constructor() : this(0,"","","", Date())

}