def replicate(x,n):
    if n==0:
        return []
    elif n==1:
        return [x]
    else:
        return replicate(x,n-1) + [x]

def sumList(ls):
    if len(ls) == 0:
        return 0
    else:
        return ls[0] + sumList(ls[1:])

def maxList(ls):
    if len(ls) == 1:
        return ls[0]
    elif len(ls) == 0:
        print ('not allowed')
    else:
        #we have recursively found the max of the n-1 list, call that m1
        #the max of the big list is either m1 or the first element of the list
        if maxList(ls[1:]) > ls[0]:
            return maxList(ls[1:])
        else:
            return ls[0]
