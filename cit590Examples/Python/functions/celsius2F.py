def tempConverter(tempInCel):
    tempInF = 9.0/5.0 * tempInCel + 32
    return tempInF

def printC2FMessage(c, f):
    print str(c) + ' in celsius is ' + str(f) + ' in fahrenheit' 

tempInC = 37
printC2FMessage(tempInC, tempConverter(tempInC))

