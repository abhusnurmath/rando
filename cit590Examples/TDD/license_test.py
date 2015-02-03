from license import *   # import everything from your module
import unittest  # This loads the testing methods and a main program

class Test_License(unittest.TestCase):  # use any meaningful name
    def test_change_digits_to_letters(self):
        changed = change_digits_to_letters('A8789')
        #first argument - actual, expected, message
        self.assertEqual(changed, 'AB789', 'check 8 -> B')
        changed = change_digits_to_letters('I2235')
        self.assertEqual(changed, 'IZ235', 'check 2 -> Z')
        #we should add a test case for each translation

        #make sure that 2 at a time works.
        changed = change_digits_to_letters('14346')
        self.assertEqual(changed, 'IA346', '2 at a time failed')
        nochange = change_digits_to_letters('IA346')
        self.assertEqual(nochange, 'IA346', 'input was fine!')
        #no change after the 3rd spot
        after3 = change_digits_to_letters('IAA46')
        self.assertEqual(after3, 'IAA46', 'function doing more work than asked for!')

unittest.main()  # outside the class--this tells the framework to run
