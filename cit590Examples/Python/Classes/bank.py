import bankAccount

class Bank():
    '''
        example of using one class within another
    '''
    def __init__(self, openingBalance = 0, owner = 'CEO'):
        ba = bankAccount.BankAccount(openingBalance, owner)
        self.bankAccounts = [ba]

    def openNewAccount(self, openingBalance = 0, owner = 'CEO'):
        '''
            addition of a new account. defaults to being owned by CEO
        '''
        ba = bankAccount.BankAccount(openingBalance, owner)
        self.bankAccounts.append(ba)

    def __str__(self):
        string = ""
        for account in self.bankAccounts:
            string = string + str(account) + "\n"
        return string
        
