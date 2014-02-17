from bankAccount import *

def main():
    bankAccount = BankAccount()
    bankAccount.deposit(100)
    
    otherBankAccount = BankAccount(50, 'Trustees of Penn')
    otherBankAccount.withdraw(10)

    try:
        otherBankAccount.defensiveWithdraw(1000)
    except ValueError, e:
        print "Insufficient funds. Current balance is " + str(otherBankAccount.getBalance())

    bankAccount.transfer(30, otherBankAccount)

    print bankAccount
    print otherBankAccount
            
if __name__ == "__main__":
    main()
