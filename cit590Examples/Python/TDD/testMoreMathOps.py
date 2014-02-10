from mathOps1 import *   # import everything from your module
import unittest  # This loads the testing methods and a main program

class TestMath(unittest.TestCase):  # use any meaningful name

    def testQuadraticSolution(self):
        self.assertTrue(self.listContainsSameElements([2, 3], quadraticSolver([1, -5 ,6])))
        self.assertTrue(self.listContainsSameElements([2, 2], quadraticSolver([1, -4 ,4])))
        self.assertRaises(ValueError, quadraticSolver, [1, -4 ,5])
        self.assertEquals(-1.25, quadraticSolver([0, 4, 5]))
        self.assertRaises(ValueError, quadraticSolver, [0,0,5])

    def listContainsSameElements(self, l1, l2):
        length1 = len(l1)
        length2 = len(l2)
        if length1 != length2:
            return False
        #I want both lists to contain the same elements,
        #but they could be repeated ...
        l1.sort()
        l2.sort()
        count = 0
        while count <= len(l1) - 1:
            if l1[count] != l2[count]:
                return False
            count += 1
        return True

    def testHexagonality(self):
        self.assertTrue(isHexagonal(6))
        self.assertFalse(isHexagonal(8))
        self.assertFalse(isHexagonal(21))

    def testIsPositiveInteger(self):
        self.assertFalse(isPositiveInteger(-1.0))
        self.assertTrue(isPositiveInteger(1))
        self.assertTrue(isPositiveInteger(5.0))

    def testWriteToFile(self):
        writeHexagonalNumbersToFile()
        f = open('hexagonalnums', 'r')
        firstLine = f.readline().lstrip().rstrip()
        self.assertEquals('1',firstLine)
        f.close()
        #spot check to make sure it contains 28
        f = open('hexagonalnums', 'r')
        lines = f.readlines()
        #this line removes the spaces at the left and right extremes
        trimmedLines = map(str.rstrip,map(str.lstrip, lines))
        self.assertTrue('28' in trimmedLines)
        f.close()
    
unittest.main() 
