from accounts import *

import unittest

class Test_withdraw(unittest.TestCase):
    def test_defensiveWithdraw (self):
        #assert that an error will be thrown
        self.assertRaises(ValueError, defensiveWithdraw, 1000, 10)

unittest.main()
