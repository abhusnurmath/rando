def isLetter(n):
    return 'a' <= n <= 'z' or 'A' <= n <= 'Z'

def palTest(s):
    if len(s) <= 1: return True
    if not isLetter(s[0]): return palTest(s[1:])
    if not isLetter(s[-1]): return palTest(s[:-1])
    # a string is a palindrome if the last 2 letters of the string are the same,
    # and the remaining string also satisfies the condition of being a palindrome
    elif s[0].lower != s[-1].lower: return False
    else: return palTest(s[1:len(s)-1])

