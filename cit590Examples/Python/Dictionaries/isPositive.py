def isPositive(n):
    if type(n) is not int or type(n) is not float:
        raise ValueError, 'only accepting integers'
    if n > 0:
        return True
    return False
