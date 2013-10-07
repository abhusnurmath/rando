import types
def quadraticSolver(coeffList):
    a = coeffList[0]
    b = coeffList[1]
    c = coeffList[2]
    if a != 0:
        root1 = ((-1) * b + (b*b - 4 * a * c) ** 0.5) /(2*a)
        root2 = ((-1) * b - (b*b - 4 * a * c) ** 0.5)/(2*a)
        return ([root1, root2])
    else:
        if b != 0:
            return -float(c)/float(b)
        else:
            raise ValueError, 'this is a nonsensical equation'

def isHexagonal(num):
    roots = quadraticSolver([2, -1, -1 * num])
    for root in roots:
        if isPositiveInteger(root):
            return True
    return False

def isPositiveInteger(num):
    if int(num)!= 0 and num/int(num) == 1 and num > 0:
        return True
    return False

def writeHexagonalNumbersToFile():
    f = open('hexagonalnums', 'w')
    for i in range(0,100):
        if isHexagonal(i):
            f.write(str(i) + '\n')
    f.close()
    
        

