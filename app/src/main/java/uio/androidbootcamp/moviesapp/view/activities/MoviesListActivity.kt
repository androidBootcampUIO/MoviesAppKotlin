package uio.androidbootcamp.moviesapp.view.activities

import android.os.Bundle
import uio.androidbootcamp.moviesapp.R
import kotlin.reflect.KClass

class MoviesListActivity : BaseActivity<MoviesListActivity>() {

    override fun getImplementingTypeClass(): KClass<MoviesListActivity> {
        return MoviesListActivity::class
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_movies_list)
        super.onCreate(savedInstanceState)
        setActionBarTitle(getString(R.string.find_movie))
    }

    override fun isDrawerEnabled(): Boolean {
        return true
    }
}
