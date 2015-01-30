parrot = 'parrot'

def do_something1(var1, var2):
    parrot = var1 + var2
    return parrot

def do_something2(var2, var1):
    #var2 = 8, var1 = 16
    global parrot
    parrot = var2 - var1
    #global parrot = -8
    return parrot

def main():
    global parrot
    parrot = 4
    parrot = do_something1(parrot, parrot)
    do_something2(parrot, 2 * parrot)
    
    print 'This parrot is ', parrot

if __name__ == "__main__":
    main()
