price = 125
coke = 1
coke_zero = 2
cfd_coke = 3

while True:
    print "Have a Coke! Price: $1.25"
    amount = 0
    
    # Collect money until we have at least 125 cents
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

    # Money has been collected; dispense beverage 
    print
    print "Please make your selection:"
    print coke, "- Coke"
    print coke_zero, "- Coke Zero"
    print cfd_coke, "- Caffeine Free Diet Coke"  
    dispensed = False    
    
    while not dispensed:
        choice = input("Your choice: ")
        if choice == coke:
            print "  Dispensing Coke"
            dispensed = True
        elif choice == coke_zero:
            print "  Dispensing Coke Zero"
            dispensed = True
        elif choice == cfd_coke:
            print "  Dispensing Caffeine Free Diet Coke"
            dispensed = True
        else:
            print "  ** No such beverage. Choose another."
            dispensed = False

    # Beverage has been dispensed; return change
    amount -= price
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

    
