package uio.androidbootcamp.moviesapp.presenter

import android.content.Intent
import uio.androidbootcamp.moviesapp.model.models.Movie
import uio.androidbootcamp.moviesapp.view.activities.FindMovieActivity

class ShowMoviePresenter(val view: View) {

    private lateinit var movie: Movie

    fun getMovieFromIntent(intent: Intent){
        movie = intent.getSerializableExtra(FindMovieActivity.EXTRA_MOVIE) as Movie
        view.showMovieData(movie)
    }

    interface View {
        fun showMovieData(movie: Movie)
    }
}