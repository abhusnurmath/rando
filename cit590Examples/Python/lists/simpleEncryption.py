def encrypt(text):
    result = ''
    for c in text:
        result = result + ' ' + str(ord(c))
    return result

def decrypt(text):
    result = ''
    for num in text.split():
        result = result + chr(eval(num))
    return result

def rot13char(c):
    alphabet = 'abcdefghijklmnopqrstuvwxyz'
    idx = alphabet.find(c)
    idx = (idx + 13)%26
    return alphabet[idx]

def rot13(str):
    result = ''
    for ch in str.lower():
        if 'a' <= ch <= 'z':
            result = result + rot13char(ch)
        else:
            result = result + ch
    return result
