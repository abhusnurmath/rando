from RPNCalculator import *

#a regular infix calculator
class Calculator(object):
    def __init__(self):
        self.calcEngine = RPNCalculator()
        self.opStack = Stack()
        self.outLine = ''

    def eval(self, line):
        self.outLine = ''
        i = 0
        while i < len(line):
            if line[i] == '(':
                self.opStack.push('(')
            elif line[i] == ')':
                self.doParen()
            elif line[i] in '+-*/':
                self.doBinary(line[i])
            elif line[i] in '0123456789':
                self.outLine += line[i]
            i = i + 1
        while not self.opStack.isEmpty():
            self.doOp(self.opStack.pop())
        return self.calcEngine.eval(self.outLine)

    def run(self):
        while True:
            line = raw_input('type an expression\n')
            if len(line) == 0: break
            print self.eval(line)

    def doParen(self):
        while self.opStack.top() != '(':
            op = self.opStack.pop()
            self.doOp(op) #do every single binary operation that is between the two parens
        self.opStack.pop() #eventually remove the left paren

    def doOp(self, op):
        self.outLine += (' ' + op + ' ')

    def prec (self,op):
        if op == '/' or op == '*': return 2
        elif op == '+' or op == '-': return 1
        return 0

    def doBinary(self, topop):
        self.outLine += ' '
        if self.opStack.isEmpty(): self.opStack.push(topop)
        else:
            nextop = self.opStack.top()
            if self.prec(topop) <= self.prec(nextop):
                self.doOp(nextop)
                self.opStack.pop()
            self.opStack.push(topop)
            
        
