# program used to demonstrate the proper way to exit loops
import math
import sys
n = 1
continue_choice = True
while n < 100 and continue_choice:
    print 'the sqrt of ', n, 'is ',math.sqrt(n)
    #print squareroots 10 at a time
    if n % 10 == 1:
        continue_choice = raw_input('continue?\n')
        if continue_choice == 'n' or continue_choice == 'N':
            #fill in break, quit, sys.exit() in here
    n += 1
print 'yayyy we did all our work!!!'
