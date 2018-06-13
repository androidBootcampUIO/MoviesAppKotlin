package uio.androidbootcamp.moviesapp.view.activities

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_find_movie.*
import uio.androidbootcamp.moviesapp.R
import uio.androidbootcamp.moviesapp.model.models.Movie
import uio.androidbootcamp.moviesapp.presenter.MoviePresenter
import uio.androidbootcamp.moviesapp.utils.toast

class FindMovieActivity : BaseActivity(), MoviePresenter.View {
    private val presenter = MoviePresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_find_movie)
        super.onCreate(savedInstanceState)
        setActionBarTitle(getString(R.string.find_movie))
        presenter.viewLoaded()
    }

    override fun setActionsToScreenElements() {
        button_find_movie.setOnClickListener {
            presenter.findMovieByName(edit_text_movie_name.text.toString())
        }
    }

    override fun showMovieInformation(movie: Movie) {
        val intent = Intent(this, ShowMovieActivity::class.java).apply {
            putExtra(EXTRA_MOVIE, movie)
        }
        startActivity(intent)
    }

    override fun showMovieNotFoundMessage() {
       toast(getString(R.string.movie_not_found))
    }

    override fun getImplementingTypeClassName(): String {
        return FindMovieActivity::class.java.simpleName
    }

    override fun isDrawerEnabled(): Boolean {
        return true
    }

    companion object {
        const val EXTRA_MOVIE = "MOVIE"
    }
}
