package uio.androidbootcamp.moviesapp.view.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_show_movie.*
import uio.androidbootcamp.moviesapp.R
import uio.androidbootcamp.moviesapp.model.models.Movie
import uio.androidbootcamp.moviesapp.view.activities.FindMovieActivity.Companion.EXTRA_MOVIE

class ShowMovieActivity : AppCompatActivity() {

    private var movie: Movie? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_show_movie)
        super.onCreate(savedInstanceState)
        setActionBarTitle(getString(R.string.show_movie))
        movie = intent.getSerializableExtra(EXTRA_MOVIE) as Movie?

        movie.let {
            movieTitle.text = it?.name
            movieDescription.text = it?.overview
        }
    }

    fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

//    override fun isDrawerEnabled(): Boolean {
//        return true
//    }
//
//    override fun getImplementingTypeClassName(): String {
//        return FindMovieActivity::class.java.simpleName
//    }
}
