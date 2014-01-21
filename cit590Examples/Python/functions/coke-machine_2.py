price = 125 

def main():
    while True:
        print "Have a Coke! Price: $1.25"
        amount = collect_money()
        dispense_beverage()
        make_change(amount - price)

def collect_money():
    "Collect money until we have at least 125 cents"
    amount = 0
    while amount < price:
        coin = input("Insert coin: ")
        if coin in [5, 10, 25, 100]:
            amount = amount + coin
            print "  Amount entered:", amount, "cents."
        elif coin == -1: # "Secret" way to quit
            print "Shutting down."
            quit()
        else:
            print "  ** Rejecting", coin, "cent coin."
    return amount

def dispense_beverage():
    "Money has been collected; dispense beverage"
    print
    print "Please make your selection:"
    print " 1 - Coke"
    print " 2 - Coke Zero"
    print " 3 - Caffeine Free Diet Coke"  
    dispensed = False    
    
    while not dispensed:
        choice = input("Your choice: ")
        if choice == 1:
            print "  Dispensing Coke"
            dispensed = True
        elif choice == 2:
            print "  Dispensing Coke Zero"
            dispensed = True
        elif choice == 3:
            print "  Dispensing Caffeine Free Diet Coke"
            dispensed = True
        else:
            print "  ** No such beverage. Choose another."
            dispensed = False

def make_change(amount):
    "Beverage has been dispensed; return change"
    while amount > 0:
        if amount >= 25:
            print "  Returning quarter."
            amount = amount - 25
        elif amount >= 10:
            print "  Returning dime."
            amount = amount - 10
        elif amount >= 5:
            print "  Returning nickel."
            amount = amount - 5
    print

main()    
