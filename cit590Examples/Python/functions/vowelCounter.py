def vowelCounter(string) :
    vowelCount = 0
    for a in string:
        if a in 'aeiou':
            vowelCount += 1
    return vowelCount

while 1==1:
    inputString = raw_input("please give me a string\n")
    print "The number of vowels in this string are ", vowelCounter(inputString) 
            
