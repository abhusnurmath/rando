#attempt at writing a function that converts from roman numerals back to decimals

def romanCharacter2DecimalEquivalent(ch):
    '''
        Convert a single roman character to decimal.
    '''    
    if ch == 'i': return 1
    elif ch == 'v': return 5
    elif ch == 'x': return 10
    elif ch == 'l': return 50
    elif ch == 'c': return 100
    elif ch == 'd': return 500
    elif ch == 'm': return 1000
    else:
        raise RuntimeError, 'invalid roman numeral character'


def processDecimal(newDigit, oldDigit, existingNumber):
    '''
        process a decimal number
    '''
    if newDigit < oldDigit:
        arbit
        return existingNumber - newDigit
    else:
        return existingNumber + newDigit

def roman2Dec(rom):
    '''
        the main calculation function that converts roman to decimal
    '''
    rom = rom.lower()
    if type(rom)!= type(str()):
        raise RuntimeError, 'a string input is needed'
    flag = 0
    for ch in rom:
        if ch not in 'ivxlcdm':
            flag = 1
            break;
    if flag == 1:
        raise RuntimeError, 'an invalid roman numeral was supplied'
    #traverse the string in reverse, adding the roman character equivalents
    decimal = 0
    lastDecimalEquiv = 0
    lengthOfRomanNumber = len(rom)
    
    i = lengthOfRomanNumber - 1
    while i >= 0:
        decimalEquiv = romanCharacter2DecimalEquivalent(rom[i])
        decimal = processDecimal(decimalEquiv, lastDecimalEquiv, decimal)
        i -= 1
        lastDecimalEquiv = decimalEquiv
    return decimal

def main():
    print roman2Dec('xviii')

if '__name__ = main':
    main()

    
