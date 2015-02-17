class BankAccount(object):
        
    def __init__ (self, initBalance = 0, owner = 'Arvind'):
        self.balance = initBalance
        self.owner = owner
        
    def deposit(self, amount):
        self.balance += amount
        
    def withdraw(self, amount):
        self.balance -= amount
        
    def getBalance(self):
        return self.balance

    def setBalance(self, someBalance):
        self.balance = someBalance

    def getOwner(self):
        return self.owner
    
    def transfer (self, amount, toAccount):
        '''
            transfer amount from this account to the toAccount
        '''
        self.withdraw(amount)
        toAccount.deposit(amount)
        
    def defensiveWithdraw (self, amount):
        '''
            check if funds are available before withdrawing.
            insufficient funds results in a ValueError
        '''
        if self.balance < amount:
            raise ValueError, "insufficient funds"
        self.balance -= amount
        
    def __str__(self):
        '''
           the str function tells you how the object will be displayed
           in case it is used in something like a print statement
        '''
        return "The account is owned by " + self.getOwner() + \
                " balance is " + str(self.getBalance())

    #add_interest - give the account 1% interest
    #add_owner - give joint ownership
    

