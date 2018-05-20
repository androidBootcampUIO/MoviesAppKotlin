package uio.androidbootcamp.moviesapp.model.models

import java.util.*

class Movie (val id: Long, val posterPath: String, val name: String, val overview: String, val releaseDate: Date) {

    constructor() : this(0,"","","", Date())

}