#note that we do not do the usual from ... import ...
import wordCounter 
import unittest

class Test_WC(unittest.TestCase):
    
    def setUp(self):
        #this is how we can set up the global variable
        wordCounter.freq = {'the' : 40, 'shake' : 1}
    
    def test_most_frequent(self):
        result = wordCounter.most_frequent()
        self.assertEqual(('th', 40), result)

unittest.main()
