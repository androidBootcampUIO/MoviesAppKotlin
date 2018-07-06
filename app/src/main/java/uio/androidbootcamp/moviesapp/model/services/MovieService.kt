package uio.androidbootcamp.moviesapp.model.services

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import uio.androidbootcamp.moviesapp.model.models.Movie

//Manejo de Servicios Web
class MovieService(private val presenterOutput: MoviePresenterOutput) {

    fun findMovieByName(name: String) {
        val baseUrl = "http://www.omdbapi.com"
        val retrofit = Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        val movieApiService = retrofit.create(MovieApiService::class.java)

        if (name.isNotBlank()) {
            val apiKey = "" // insertar apiKey
            val call = movieApiService.findMovieByTitle(apiKey, name)

            call.enqueue(object : Callback<Movie> {
                override fun onFailure(call: Call<Movie>?, t: Throwable?) {

                    presenterOutput.showMovieInformation(null)
                }

                override fun onResponse(call: Call<Movie>?, response: Response<Movie>?) {
                    presenterOutput.showMovieInformation(response?.body())
                }

            })
        }
    }
}

interface MoviePresenterOutput {
    fun showMovieInformation(movie: Movie?)
}
