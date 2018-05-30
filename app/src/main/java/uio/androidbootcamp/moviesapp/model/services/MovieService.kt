package uio.androidbootcamp.moviesapp.model.services

import uio.androidbootcamp.moviesapp.model.models.Movie

//Manejo de Servicios Web
class MovieService(private val presenterOutput: MoviePresenterOutput) {

    fun findMovieByName(name: String) {
        if (name.isNotBlank()) {
            val movie = Movie(id = 1, name = name, overview = "This is Chewbacca. He's first-mate on a ship that might suit our needs. I don't like the look of this. Han Solo. I'm captain of the Millennium Falcon. Chewie here tells me you're looking for passage to the Alderaan system. Yes, indeed. If it's a fast ship. Fast ship? You've never heard of the Millennium Falcon? Should I have? It's the ship that made the Kessel run in less than twelve parsecs! I've outrun Imperial starships, not the local bulk-cruisers, mind you. I'm talking about the big Corellian ships now. She's fast enough for you, old man. What's the cargo? Only passengers. Myself, the boy, two droids, and no questions asked. What is it? Some kind of local trouble? Let's just say we'd like to avoid any Imperial entanglements.\n" +
                    "\n" +
                    "Chewie! Get behind me! Get behind me! Can't get out that way. Looks like you managed to cut off our only escape route. Maybe you'd like it back in your cell, Your Highness. See-Threepio! See-Threepio! Yes sir? We've been cut off! Are there any other ways out of the cell bay?...What was that? I didn't copy! I said, all systems have been alerted to your presence, sir. The main entrance seems to be the only way in or out, all other information on your level is restricted.",
                    posterPath = "https://image.tmdb.org/t/p/w500/wwemzKWzjKYJFfCeiB57q3r4Bcm.png")
            presenterOutput.showMovieInformation(movie)
        } else {
            presenterOutput.showMovieInformation(null)
        }
    }
}

interface MoviePresenterOutput {
    fun showMovieInformation(movie: Movie?)
}
