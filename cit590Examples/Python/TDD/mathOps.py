def squareRoot(x):
    return x ** 0.5

def solveQuadratic(coeffList):
    a = coeffList[0]
    b = coeffList[1]
    c = coeffList[2]
    root1 = (-b + squareRoot(b*b - 4 * a * c)) / 2 * a
    root2 = (-b - squareRoot(b*b - 4 * a * c)) / 2 * a
    return [root1, root2]
