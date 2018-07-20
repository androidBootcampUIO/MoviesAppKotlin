package uio.androidbootcamp.moviesapp.view.activities

import android.app.Activity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import uio.androidbootcamp.moviesapp.R
import uio.androidbootcamp.moviesapp.model.models.Movie
import uio.androidbootcamp.moviesapp.view.adapters.MovieListAdapter

class ResultsListActivity: Activity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resutls_list)

        viewManager = LinearLayoutManager(this)
        val movies = intent.getSerializableExtra(FindMovieActivity.EXTRA_MOVIES_LIST) as Array<Movie>

        viewAdapter = MovieListAdapter(movies)

        recyclerView = findViewById<RecyclerView>(R.id.recycler_results_list_view)
                .apply {
            layoutManager = viewManager
            adapter = viewAdapter
        }
    }
}