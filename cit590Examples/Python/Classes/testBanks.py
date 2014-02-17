from bankAccount import *   # import everything from your module
import unittest  # This loads the testing methods and a main program

class TestBank(unittest.TestCase):  # use any meaningful name

    def testDeposit(self):
        account = BankAccount()
        account.deposit(5)
        self.assertEqual(account.getBalance(), 5)

    
unittest.main() 
