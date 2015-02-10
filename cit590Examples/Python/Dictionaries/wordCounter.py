freq = {}

def freqCount(line):
    #get the global dict
    global freq
    words = line.split()
    for word in words:
        #convert word to lower case
        word = word.lower()
        #takes care of word not being in dict initially
       
        freq[word] = freq.get(word,0) + 1

def most_frequent():
    global freq
    words = freq.keys()
    frequencies = freq.values()
    max_freq = max(frequencies)
    #at what index did this max freq occur
    desired_index = frequencies.index(max_freq)
    #returns both the word and max freq
    return (words[desired_index], max_freq)

def main():
    line = raw_input('enter text and use quit to quit\n')
    while line != 'quit':
        freqCount(line)
        line = raw_input()
    for word in freq:
        print word + ' occurs ' + str(freq[word]) + ' times'
        
    print 'THE MOST FREQUENT WORD IS!!!! '
    print most_frequent()[0] + ' which occurs ' + str(most_frequent()[1])

if __name__ == "__main__":
    main()
