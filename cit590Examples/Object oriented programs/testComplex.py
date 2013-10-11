from complex import *  
import unittest  

class TestComplex(unittest.TestCase):
    
    def testSort(self):
        ls = [Complex(3,4), Complex(8,15), Complex(5,12), Complex(1,1)]
        ls.sort(sortOnModulus)
        self.assertTrue(1, ls[0].getReal())

    def testInitialization(self):
        c = Complex(3, 4)
        self.assertEquals(c.getReal(), 3)
        self.assertEquals(c.getImaginary(), 4)

    def testStringification(self):
        c = Complex(3,4)
        string1 = '' + str(c)
        self.assertEquals('3 + 4i', string1)
        c = Complex(3, 0)
        string2 = '' + str(c)
        self.assertEquals('3', string2)
        c = Complex(3, -4)
        string3 = '' + str(c)
        self.assertEquals('3 - 4i', string3)
        
unittest.main()
