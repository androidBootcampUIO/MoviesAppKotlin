package uio.androidbootcamp.moviesapp.model.models

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Movie(val title: String,
                 val year: String,
                 val rated: String,
                 val released: String,
                 val runtime: String,
                 val genre: String,
                 val director: String,
                 val writer: String,
                 val actors: String,
                 val plot: String,
                 val language: String,
                 val country: String,
                 val awards: String,
                 val poster: String,
                 val ratings: List<Rating>,
                 val metascore: String,
                 @SerializedName("imdbRating") val imdbRating: String,
                 @SerializedName("imdbVotes") val imdbVotes: String,
                 @SerializedName("imdbID") val imdbID: String,
                 val type: String,
                 @SerializedName("DVD") val dvd: String,
                 val boxOffice: String,
                 val production: String,
                 val website: String,
                 val response: String) : Serializable