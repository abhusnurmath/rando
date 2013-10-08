def freqCount(f):
    freq = {} #a dictionary of frequencies
    line = f.readline()
    while line:
        words = line.split()
        for word in words:
            freq[word] = freq.get(word, 0) + 1
        line = f.readline()
    return freq

def freqCountFor(f):
    freq = {}
    for line in f:
        words = line.split()
        for word in words:
            freq[word]= freq.get(word, 0) + 1
    return freq

def main():
    f = open("thelyrics.txt")
    freq = freqCountFor(f)
    for word in freq:
        print word, " occurs ", freq[word], " times"
