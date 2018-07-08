package uio.androidbootcamp.moviesapp.view.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_show_movie.*
import uio.androidbootcamp.moviesapp.R
import uio.androidbootcamp.moviesapp.model.models.Movie
import uio.androidbootcamp.moviesapp.presenter.ShowMoviePresenter
import uio.androidbootcamp.moviesapp.view.activities.FindMovieActivity.Companion.EXTRA_MOVIE

class ShowMovieActivity : BaseActivity(), ShowMoviePresenter.View {
    private val presenter = ShowMoviePresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_show_movie)
        super.onCreate(savedInstanceState)
        setActionBarTitle(getString(R.string.show_movie))
        presenter.getMovieFromIntent(intent)
    }

    override fun showMovieData(movie: Movie) {
        movie.let {
            movieTitle.text = it.title
            movieDescription.text = it.plot
        }
    }

    override fun isDrawerEnabled(): Boolean {
        return false
    }

    override fun getImplementingTypeClassName(): String {
        return ShowMovieActivity::class.java.simpleName
    }
}
