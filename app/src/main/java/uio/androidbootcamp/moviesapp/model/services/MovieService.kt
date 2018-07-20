package uio.androidbootcamp.moviesapp.model.services

import com.google.gson.FieldNamingPolicy
import com.google.gson.GsonBuilder
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import uio.androidbootcamp.moviesapp.model.models.Movie
import uio.androidbootcamp.moviesapp.model.models.Movies

//Manejo de Servicios Web
class MovieService(private val presenterOutput: MoviePresenterOutput) {

    companion object {
        var ApiKey: String = "cf1356ff"
        var baseUrl = "http://www.omdbapi.com"
    }

    fun findMovieByName(name: String) {
        if (name.isNotBlank()) {
            val call = findMovieByNameCall(name)
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

    fun findMoviesByKeyWord(keyword: String) {
        if (keyword.isNotBlank()) {
            val call = findMoviesBykeywordCall(keyword)
            call.enqueue(object : Callback<Movies> {
                override fun onFailure(call: Call<Movies>?, t: Throwable?) {

                }

                override fun onResponse(call: Call<Movies>?, response: Response<Movies>?) {
                    presenterOutput.showMovieList(response?.body())
                }
            })
        }
    }

    private fun findMovieByNameCall(name: String): Call<Movie> {
        val movieApiService = movieApiService()
        return movieApiService.findMovieByTitle(ApiKey, name)
    }

    private fun findMoviesBykeywordCall(keyword: String): Call<Movies> {
        val movieApiService = movieApiService()
        return movieApiService.findMoviesByKeyWord(ApiKey, keyword)
    }

    private fun movieApiService() : MovieApiService {
        val gson = GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create()
        val retrofit = Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build()

        return retrofit.create(MovieApiService::class.java)
    }
}

interface MoviePresenterOutput {
    fun showMovieInformation(movie: Movie?)
    fun showMovieList(movieList: Movies?)
}
