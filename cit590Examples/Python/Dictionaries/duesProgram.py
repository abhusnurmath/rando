#the dues program from the book page 92

def main():
    print 'enter dues in the format person:amount paid'
    dues = {}
    line = raw_input()
    while line != 'quit':
        word = line.split(':')
        #if we have valid input, we would have
        #word[0] being the person's names and word[1]
        #is the amount they have paid
        dues[word[0]] = dues.get(word[0], 0.00) + eval(word[1])
        line = raw_input()
    for name in dues:
        print name, "has paid", dues[name]
    
main()
