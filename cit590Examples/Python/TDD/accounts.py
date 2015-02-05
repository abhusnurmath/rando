def defensiveWithdraw (amount, balance):
     if  balance < amount:
         raise ValueError, "insufficient funds"
     balance -= amount
