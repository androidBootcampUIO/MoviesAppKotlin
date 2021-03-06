package uio.androidbootcamp.moviesapp.view.activities

import android.os.Bundle
import uio.androidbootcamp.moviesapp.R
import kotlin.reflect.KClass

class MoviesListActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_movies_list)
        super.onCreate(savedInstanceState)
        setActionBarTitle(getString(R.string.list_movies))
    }

    override fun isDrawerEnabled(): Boolean = true

    override fun getImplementingTypeClassName(): String {
        return MoviesListActivity::class.java.simpleName
    }
}
