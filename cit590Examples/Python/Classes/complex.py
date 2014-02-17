class Complex(object):
    def __init__(self, realpart = 0 , imaginarypart = 0):
        self.r = realpart
        self.i = imaginarypart

    def getReal(self):
        return self.r

    def getImaginary(self):
        return self.i
    
    def modulus(self):
        return (self.r ** 2 + self.i ** 2) ** (0.5)

    def __str__(self):
        if self.i > 0:
            return str(self.r) + ' + ' + str(self.i) + 'i'
        elif self.i == 0:
            return str(self.r)
        else:
            return str(self.r) + ' - ' + str(self.i * -1) + 'i'

def sortOnModulus(c1, c2):
    #remember the following rule when writing a custom sort function
    #when less return -1
    #when equal return 0
    #else return 1
    #always always always ensure that your sort function can compare
    #any two entries 
    if c1.modulus() < c2.modulus():
        return -1
    elif c1.modulus() == c2.modulus():
        return 0
    return 1

def main():
    #list of complex numbers
    ls = [Complex(3,4), Complex(8,15), Complex(5,12), Complex(1,1)]
    print('This is my initial list --------- \n')
    for l in ls:
        print l
    ls.sort(sortOnModulus)
    print('This is my sorted list ----------- \n')
    for l in ls:
        print l

