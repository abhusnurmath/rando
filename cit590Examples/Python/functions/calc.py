import string
# simple calculator program

def acceptUserInput():
    operationString = raw_input(
                      'please enter your computation \n')
    return operationString

def checkValidity(operationString):
    #check that the first is a number
    if operationString[0] not in '0123456789':
        print 'your string does not begin with a number'
        return False
    if ('+' not in operationString and
        '-' not in operationString and
        '*' not in operationString and
        '/' not in operationString and
        '^' not in operationString):
           print 'operator missing'
           return False
    #the -1 index is the last character of a string
    #so this checks that the string ends with a number
    if operationString[-1] not in '0123456789':
        print 'looks like you forgot a second operand'
        return False
    #there are other checks that can be done. we are ignoring those.
    return True

def execute(operationString):
    if '^' in operationString:
        #string.find(str1, str2) tries to find str2 in str1
        #it returns the index of the first location of str2.
        index  = string.find(operationString, '^')
        operand1 = operationString[:index]
        operand2 = operationString[index+1:]
        answer = eval(operand1 + '**' + operand2)
        return answer
    answer = eval(operationString)
    return answer
    
def printAnswer(answer):
    print 'The answer is going to be ', answer

def evaluateOnce():
    operationString = acceptUserInput()
    #check validity of input. do not do next until valid input
    while (not checkValidity(operationString)):
        operationString = acceptUserInput()
    answer = execute(operationString)
    printAnswer(answer)

def main():
    #ask for input
    evaluateOnce()
    contChoice = raw_input('do you want to continue?')
    while contChoice != 'n':
        evaluateOnce()
        contChoice = raw_input('do you want to continue?')

if __name__ == '__main__':
    main()
