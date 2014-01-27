# a function that returns the english translation of a number

def numToString(n):
    if n == 0: return ''
    elif n == 1: return 'one'
    elif n == 2: return 'two'
    elif n == 3: return 'three'
    elif n == 4: return 'four'
    elif n == 5: return 'five'
    elif n == 6: return 'six'
    elif n == 7: return 'seven'
    elif n == 8: return 'eight'
    elif n == 9: return 'nine'
    elif n == 10: return 'ten'
    elif n == 11: return 'eleven'
    elif n == 12: return 'twelve'
    elif n == 13: return 'thirteen'
    elif n == 14: return 'fourteen'
    elif n == 15: return 'fifteen'
    elif n == 16: return 'sixteen'
    elif n == 17: return 'seventeen'
    elif n == 18: return 'eighteen'
    elif n == 19: return 'nineteen'
    elif n <= 29: return 'twenty' + numToString(n%10)
    elif n <= 39: return 'thirty' + numToString(n%10)
    elif n <= 49: return 'forty' + numToString(n%10)
    elif n <= 59: return 'fifty' + numToString(n%10)
    elif n <= 69: return 'sixty' + numToString(n%10)
    elif n <= 79: return 'seventy' + numToString(n%10)
    elif n <= 89: return 'eighty' + numToString(n%10)
    elif n <= 99: return 'ninety' + numToString(n%10)
    elif n <= 999: return (numToString(n/100) + 'hundred'
                           + numToString(n%100))
    elif n <= 99999: return (numToString(n/1000) + 'thousand'
                            + numToString(n%1000))
