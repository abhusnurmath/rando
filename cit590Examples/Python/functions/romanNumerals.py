

#roman numeral function

def romanDigit(n, oneChar, fiveChar, tenChar):
    #returns the equivalent of n written in roman numerals
    #using given chars for one, five and ten
    if n == 0: return ''
    elif n == 1: return oneChar
    elif n == 2: return 2 * oneChar
    elif n == 3: return 3 * oneChar
    elif n == 4: return oneChar + fiveChar
    elif n == 5: return fiveChar
    elif n == 6: return fiveChar + oneChar
    elif n == 7: return fiveChar + 2 * oneChar
    elif n == 8: return fiveChar + 3 * oneChar
    elif n == 9: return oneChar + tenChar
    else: print 'number out of range'

def romanNumber(n):
    #returns the roman numeral representation
    return (
        romanDigit(n/1000,'M', '', '')
        + romanDigit((n/100)%10, 'C', 'D', 'M')
        + romanDigit((n/10)%10, 'X', 'L', 'C')
        + romanDigit(n%10, 'I', 'V', 'X')
            )

#using the roman number function to get roman numerals from 1 to 100
def main():
    n = input('please enter a positive number\n')
    print romanNumber(n)
    
#now call the main function
main()
    

    
        

