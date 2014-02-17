from movie import *   # import everything from your module
import unittest  # This loads the testing methods and a main program

class TestMovies(unittest.TestCase):  # use any meaningful name

    def testCreateDb(self):
        movieInfo = createDb()
        self.assertTrue('Troy' in movieInfo.get('Brad Pitt'))
        self.assertTrue('The Godfather' in movieInfo.get('Marlon Brando'))
        self.assertFalse('Sleepers' in movieInfo.get('Marlon Brando'))

    def testSelectWhereMoviesIs(self):
        movieInfo = createDb()
        lst = selectWhereMoviesIs('The Godfather', movieInfo)
        #spot check a few
        self.assertTrue('Al Pacino' in lst)
        self.assertTrue('Tom Cruise' not in lst)
        #check length of list
        self.assertEquals(3, len(lst))
        #check to see if the list is completely correct
        self.assertEquals(set(lst), set(['Diane Keaton', 'Al Pacino', 'Marlon Brando']))
        #check the function does not crash when we enter random movie
        #that is not there
        self.assertEquals(0, len(selectWhereMoviesIs('Sholay', movieInfo)))           
    
unittest.main() 
