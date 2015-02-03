from mathOps import *   # import everything from your module
import unittest  # This loads the testing methods and a main program

class TestMath(unittest.TestCase):  # use any meaningful name

    ## Your test methods go here. Indent your
    ## methods, because they belong inside the class.
    def testQuad(self):
        ls = solve([1,-5,4])
        ls.sort()
        self.assertEquals(ls, [1.0,4.0])
        ls = solve([2,-5,2])
        ls.sort()
        self.assertEquals(ls, [0.5, 2.0])
        ls = solve([0,-5,2])
        ls.sort()
        self.assertEquals(ls, [0.4])
        ls = solve([3,4,5])
        ls.sort()
        #assert error shows up using self.assertRaises

unittest.main()  # outside the class--this tells the framework to run

    
