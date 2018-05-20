package uio.androidbootcamp.moviesapp.model.services

import uio.androidbootcamp.moviesapp.model.models.Movie

//Manejo de Servicios Web
class MovieService {

    fun findMovieByName(name:String): Movie {
        return Movie(id = 1, name = name, overview = "Esta es una excelente pelicula.", posterPath = "https://image.tmdb.org/t/p/w500/wwemzKWzjKYJFfCeiB57q3r4Bcm.png")
    }
}