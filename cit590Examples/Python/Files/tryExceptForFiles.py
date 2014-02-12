def safeOpen(fileName):
    try:
        f = open(fileName)
    except IOError, e:
        print 'said file does not exist'
    else:
        print('good good. file exists')
        return f

def main():
    fileName = raw_input('what is your filename')
    f = safeOpen(fileName)

main()
    
