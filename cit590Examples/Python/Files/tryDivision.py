def tryDivision(a,b):
    try:
        c = a/b
    except ZeroDivisionError as e:
        print 'Division by Zero! Be Careful!!!!!'
    else:
        print str(c) + ' is the result of the division.'
        
