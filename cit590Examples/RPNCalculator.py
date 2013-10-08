from CalculatorEngine import *
class RPNCalculator(object):
    def __init__(self):
        self.calcEngine = CalculatorEngine()

    #given a single reverse polish expression do an evaluation
    def eval(self, line):
        #implicit assumption being made here that the user will put spaces between the operators, operands
        words = line.split(" ")
        for item in words:
            if item in '+-*/':
                self.calcEngine.doTextOp(item)
            else:
                self.calcEngine.pushOperand(int(item))
        #once done with all the computations, return whatever is right on top
        return self.calcEngine.currentOperand()

    def run (self):
        while True:
            line = raw_input("type an expression please\n")
            if len(line) == 0: break
            print self.eval(line)
        
        
