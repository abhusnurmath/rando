def create_actors_DB(actor_file):
    '''Create a dictionary keyed on actors from a text file'''
    f = open(actor_file)
    movieInfo = {}
    #read in line by line
    for line in f:
        #remove beginning and trailing spaces
        line = line.rstrip().lstrip()
        actorAndMovies = line.split(',')
        actor = actorAndMovies[0]
        if actor not in movieInfo.keys():
            movieInfo[actor] = set([])
        movies = actorAndMovies[1:]
        cleaned_movies = []
        for movie in movies:
            cleaned_movies.append(movie.lstrip().rstrip())
        movieInfo[actor] = movieInfo.get(actor).union(set(cleaned_movies))
    f.close()
    return movieInfo
