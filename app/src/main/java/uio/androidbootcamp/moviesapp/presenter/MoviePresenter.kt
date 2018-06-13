package uio.androidbootcamp.moviesapp.presenter

import uio.androidbootcamp.moviesapp.model.models.Movie
import uio.androidbootcamp.moviesapp.model.services.MoviePresenterOutput
import uio.androidbootcamp.moviesapp.model.services.MovieService

//Aquí se maneja la lógica de la aplicación
class MoviePresenter(val view: View) : MoviePresenterOutput {

    private val movieService = MovieService(this)

    fun findMovieByName(name: String) {
        movieService.findMovieByName(name)
    }

    override fun showMovieInformation(movie: Movie?) {
        if (movie == null) {
            view.showMovieNotFoundMessage()
        } else {
            view.showMovieInformation(movie)
        }
    }

    fun viewLoaded() {
        view.setActionsToScreenElements()
    }

    interface View {
        fun setActionsToScreenElements()
        fun showMovieInformation(movie: Movie)
        fun showMovieNotFoundMessage()
    }
}
