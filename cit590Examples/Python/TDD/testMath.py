from mathOps import *   # import everything from your module
import unittest  # This loads the testing methods and a main program

class TestMath(unittest.TestCase):  # use any meaningful name

    ## Your test methods go here. Indent your
    ## methods, because they belong inside the class.
    def testSquareRoot(self):
        self.assertEqual(4, squareRoot(16))
        self.assertEqual(25, squareRoot(625))

    def testQuadraticSolution(self):
        roots = solveQuadratic([1,-5,6])
        self.assertEqual(True, self.listsContainSameElements([2,3],roots))

    def listsContainSameElements(self,list1, list2):
        '''
            checks whether two lists contain the same elements,
            regardless of the order
        '''
        return set(list1) == set(list2)

unittest.main()  # outside the class--this tells the framework to run

    
