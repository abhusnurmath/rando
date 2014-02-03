def solve(coeffList):
    #[a.b.c] is the coeffList

    a = coeffList[0]
    b = coeffList[1]
    c = coeffList[2]
    if a!=0:
        root1 = (-b + (b**2 - 4 * a *c)**0.5 )/(2.0 *a)
        root2 = (-b - (b**2 - 4 * a *c)**0.5 )/(2.0 *a)    
    return [root1, root2]
    
