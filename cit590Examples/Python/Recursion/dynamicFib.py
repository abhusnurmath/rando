#dynamic programming version of the fibonacci prog
fibs = {0:0, 1:1}
def recursiveButDynamicFib(n):
    global fibs
    if not fibs.has_key(n):
        fibs[n] = recursiveButDynamicFib(n-2) + recursiveButDynamicFib(n-1)
    return fibs[n]
