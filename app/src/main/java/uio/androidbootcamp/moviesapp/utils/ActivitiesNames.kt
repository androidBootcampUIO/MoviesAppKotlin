package uio.androidbootcamp.moviesapp.utils

import uio.androidbootcamp.moviesapp.view.activities.FindMovieActivity
import uio.androidbootcamp.moviesapp.view.activities.MoviesListActivity

enum class ActivitiesNames(val className: String?) {
    MOVIES_LIST_ACTIVITY((MoviesListActivity::class).simpleName),
    FIND_MOVIES_ACTIVITY((FindMovieActivity::class).simpleName)
}
