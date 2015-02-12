import unittest
from inClassFileExample import *

class Test_FileExample(unittest.TestCase):
    fileName = ''
    
    def setUp(self):
        self.fileName = 'testfile.txt'

unittest.main()
