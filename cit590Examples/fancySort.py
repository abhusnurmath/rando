def compareBasedOnLastComponent(x,y):
    if x[-1] < y[-1]: return -1
    elif x[-1] == y[-1]: return 0
    return 1

data = [['arv','Penn', 33], ['fed', 'West Point', 45],
        ['Ben', 'Cornell', 25], ['Steven', 'UVA', 24]]
    
