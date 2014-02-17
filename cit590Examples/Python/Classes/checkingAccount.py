import bankAccount

class CheckingAccount(bankAccount.BankAccount):
    def __init__(self, initBal = 0):
        bankAccount.BankAccount.__init__(self, initBal) #when using your parent class' constructor you have to specify the keyword self
        self.checkRecord = { }
        
    def processCheck(self, number, toWho, amount):
        try:
            self.defensiveWithdraw(amount)
        except ValueError, e:
            print "check returned for insufficient funds"
            raise ValueError, "insufficient funds " + str(amount)
        self.checkRecord[number] = (toWho, amount) #the dictionary stores a key value mapping between the number of the check and who was the recipient
        
    def checkinfo (self, number):
        if self.checkRecord.has_key(number):
            return self.checkRecord[number]
        else:
            return 'no such check'

    def giveAllCheckInfo(self):
        for num in self.checkRecord.keys():
            print 'check number '+ str(num) + ' to ' +  self.checkinfo(num)[0] + ' for ' + str(self.checkinfo(num)[1])
        
