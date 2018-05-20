package uio.androidbootcamp.moviesapp.utils

import uio.androidbootcamp.moviesapp.view.activities.FindMovieActivity
import uio.androidbootcamp.moviesapp.view.activities.MoviesListActivity

enum class ActivitiesNames(val className: String?) {
    MOVIESLISTACTIVITY((MoviesListActivity::class).simpleName), FINDMOVIESACTIVITY((FindMovieActivity::class).simpleName)
}

