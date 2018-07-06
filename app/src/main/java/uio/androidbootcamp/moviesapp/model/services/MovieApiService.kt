package uio.androidbootcamp.moviesapp.model.services

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
import uio.androidbootcamp.moviesapp.model.models.Movie

interface MovieApiService {

    @GET("/")
    fun findMovieByTitle(
            @Query("apikey") apiKey: String,
            @Query("t") title: String
    ): Call<Movie>
}