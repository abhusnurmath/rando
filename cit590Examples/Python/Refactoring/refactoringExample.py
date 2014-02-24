def main():
    
    movieInfo = {}   
    createDb()
 
    print 'What do you like to do:'
    print 'a Insert'
    print 'b Delete'
    print 'c Select movie information'
    print 'd Select Actor Information'
    print 'e Find common actors for a given pair of movies'
    print 'f Get all co-actors of a given actor'
    print 'g Get largest ensemble cast'
    print 'h Get common movie'

    option = raw_input('Enter the letter for your option or \'quit\' to quit the program: ')
    
    if option == 'a':

        actorList = []
        
        movie = raw_input('Enter the name of a movie:')
        if movie =='':
            raise TypeError, 'Movie shouldn\'t be empty'
        else:
            movie = movie.lower()

        while True:
            actors = raw_input('Enter the name of an actor in this movie:')
            if isInput(actors) == True:
                actors = actors.lower()
                actorList.append(actors)
            else:
                raise ValueError, 'Actor name should only be string or at least enter q'
            if actors == 'q':
                break
        actorList.remove('q')
        finalList = (movie, actorList)
        print insertIntoDb(finalList)
        main()
 
    if option == 'b':
        movie = raw_input('Please enter the name of the movie you would like to delete from the database:')
        if movie =='':
            raise TypeError, 'Movie shouldn\'t be empty'
        else:
            movie = movie.lower()
        print deleteFromDb(movie)
        main()
  

    if option == 'c':
        movieSelection = raw_input('Please enter the movie you would like to retrieve actor information for:')
        if movieSelection  =='':
            raise TypeError, 'Movie shouldn\'t be empty'
        else:
            movieSelection = movieSelection.lower()
        print selectMovieInfo(movieSelection)
        main()
  

    if option == 'd':
        actorSelection = raw_input('Please enter the actor you would like to retrieve movie information for:')
        if isInput(actorSelection) == True:
            actorSelection = actorSelection.lower()
        else:
            raise ValueError, 'Actor name should only be string'
        print selectActorInfo(actorSelection)
        main()

    if option == 'e':
        movie1 = raw_input('Enter the first movie:')
        movie2 = raw_input('Enter the second movie to find all common actors in the 2 movies:')
        if movie1 =='' or movie2 == '':
            raise TypeError, 'Movie shouldn\'t be empty'
        else:
            movie1 = movie1.lower()
            movie2 = movie2.lower()
        print getCommonActors(movie1, movie2)
        main()

    if option == 'f':
        coActors = raw_input('Enter the actor you would like to retrieve a list of all actors this actor has worked with in the database:')
        if isInput(coActors) == True:
            coActors = coActors.lower()
        else:
            raise ValueError, 'Actor name should only be string'
        print getCoActors(coActors)
        main()

    if option == 'g':
        print getLargestEnsembleCast()
        return main()

    if option == 'h':
        actor1 = raw_input('Enter the name of an actor in the database:')
        actor2 = raw_input('Enter the name of another actor to find common movies the two actors have starred in:')
        if isInput(actor1) is True and isInput(actor2) is True:
            actor1 = actor1.lower()
            actor2 = actor2.lower()
        else:
            raise ValueError, 'Actor name should only be string'
        print getCommonMovie(actor1, actor2)
        return main()

    if option == 'quit':
        print 'You have quit the program'
        
    
if __name__ == '__main__':
    main()
