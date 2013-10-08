import sys

def freqCount(text):
    freq = {}
    for letter in text:
        if letter != '\n':
            freq[letter] = freq.get(letter, 0) + 1
    return freq

def englishLetterFrequencies():
    return 'etaoinshrdlcumwfgypbvkjxqz'

def main():
    #get frequencies of every element
    cipherText = '''53‡‡†305))6*;4826)4‡.)4‡);806*;48†8
¶60))85;1‡(;:‡*8†83(88)5*†;46(;88*96
*?;8)*‡(;485);5*†2:*‡(;4956*2(5*—4)8
¶8*;4069285);)6†8)4‡‡;1(‡9;48081;8:8‡
1;48†85;4)485†528806*81(‡9;48;(88;4
(‡?34;48)4‡;161;:188;‡?;'''
    freq = freqCount(cipherText)
    #get sortedFrequencies
    sortedFrequencies = sorted(freq.items(), key= lambda tuples: tuples[1], reverse=True)
    #get the encoding mapping
    encodingMapping = getEncoding(sortedFrequencies, englishLetterFrequencies())     
    print encodingMapping
    decodedText = ''
    for letter in cipherText:
        if letter != '\n':
            decodedText += encodingMapping.get(letter)
    print decodedText

def getEncoding(frequencies, languageFreq):
    encodingDictionary = {}
    i = 0
    for tuples in frequencies:
        encodingDictionary[tuples[0]] = languageFreq[i]
        i+=1
    return encodingDictionary
        
