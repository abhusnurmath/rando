#simple program illustrating the usage of functions
#to apply pythagoras' theorem

def getHypotenuse(a,b):
    '''
        compute the length of hypotenuse for a right triangle sides a,b
    '''
    return (square(a) + square(b))**0.5

def square(x):
    '''
        squares the number x
    '''
    return x**2
