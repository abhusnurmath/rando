#program for computing the frequency of words in a given text

freq = {}

def freqCount(line):
    global freq
    words = line.split()
    for word in words:
        freq[word] = freq.get(word,0) + 1

def main():
    line = raw_input('enter text and use quit to quit\n')
    while line != 'quit':
        freqCount(line)
        line = raw_input()
    for word in freq:
        print word + ' occurs ' + str(freq[word]) + ' times'

main()
