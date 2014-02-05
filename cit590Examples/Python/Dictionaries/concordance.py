from string import split

def countWords (words, dct, lineNumber):
    for word in words:
        lst = dct.get(word, [])
        #make sure we do not repeat the same
        # linenumber over and over again
        if lineNumber not in lst:
            lst.append(lineNumber)
        #note that we are modifying the dictionary
        #that was passed in as an argument
        dct[word] = lst

def main():
    line = raw_input()
    lineNumber = 0
    dct = {}
    while line != 'quit':
        lineNumber += 1
        countWords(split(line), dct, lineNumber)
        line = raw_input()

    for w in sorted(dct.keys()):
        print w, ':', dct[w]

main()
