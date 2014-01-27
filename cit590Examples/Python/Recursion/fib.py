#recursive function definition of fibonacci
#slow. 
def rfib(n):
    if n == 0: return 0
    elif n == 1: return 1
    else:
        return rfib(n-1) + rfib(n-2)
    


