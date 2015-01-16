# a simple program for multiplication tables
x = input("Please enter a number between 2 and 20 that you would like the multiplication tables for \n")
multiplier = 1;
if 2 <= x <= 20:
    while multiplier <= 20:
        print x," times ", multiplier, " is ", x*multiplier
        multiplier = multiplier + 1
else:
    print "Invalid input"
    
