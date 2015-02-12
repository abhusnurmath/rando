import unittest
from inClassFileExample import *

class Test_FileExample(unittest.TestCase):
    fileName = ''
    
    def setUp(self):
        self.fileName = 'testfile.txt'

    def test_count_lines(self):
        num_lines = count_lines(['for', 'cit', '590'])
        self.assertEqual(num_lines, 3)
        self.assertEqual(count_lines([]), 0)

    def test_count_words(self):
         num_words = count_words(['for this', 'cit', '590 something'])
         self.assertEqual(num_words, 5)
         self.assertEqual(count_words([]), 0)
         self.assertEqual(count_words(['a b c', '', 'd']), 4)

    def test_count_chars(self):
        self.assertEqual(count_chars(['ab b c', '', 'd']), 5)
unittest.main()
