def sieve(a):
    if a: #shorthand for 'is a an empty list'
        return a[0:1] + \
               sieve(filter(lambda x: x % a[0] != 0, a[1:]))

    else:
        return []
    
