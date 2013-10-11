from stacks import *
#a class that does the calculations for a calculator using reverse polish notation
class CalculatorEngine(object):
    def __init__(self):
        self.dataStack = Stack()

    def pushOperand (self, value):
        self.dataStack.push(value)

    def currentOperand (self):
        return self.dataStack.top()

    def performBinary (self, fun):
        #note the usage of a function as an argument!
        right = self.dataStack.pop()
        left = self.dataStack.pop()
        self.dataStack.push(fun(left, right))

    #small binary operation functions
    #note how they use lambdas since they are so simple
    def doAddition (self):
        self.performBinary(lambda x,y : x+ y)
    def doSubtraction (self):
        self.performBinary(lambda x,y : x -y )
    def doMultiplication (self):
        self.performBinary(lambda x,y : x * y)
    def doDivision (self):
        self.performBinary(lambda x,y : x /y )

    def doTextOp (self, op):
        if (op == '+'): self.doAddition()
        elif (op == '-'): self.doSubtraction()
        elif (op == '*'): self.doMultiplication()
        elif (op == '/'): self.doDivision()
        
