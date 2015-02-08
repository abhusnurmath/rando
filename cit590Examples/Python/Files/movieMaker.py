def create_actors_DB(actor_file):
    '''Create a dictionary keyed on actors from a text file'''
    f = open(actor_file)
    movieInfo = {}
    for line in f:
        line = line.rstrip().lstrip()
        actorAndMovies = line.split(',')
        actor = actorAndMovies[0]
        movieInfo[actor] = set([])
        movies = actorAndMovies[1:]
        cleaned_movies = []
        for movie in movies:
            cleaned_movies.append(movie.lstrip().rstrip())
        movieInfo[actor] = movieInfo.get(actor).union(set(cleaned_movies))
    f.close()
    return movieInfo
