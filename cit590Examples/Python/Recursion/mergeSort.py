def mergeSort(a):
    if len(a)==0 or len(a) == 1:
        return a
    else:
        firstHalf = mergeSort(a[:len(a)/2])
        secondHalf = mergeSort(a[len(a)/2:])
        return merge(firstHalf, secondHalf)

def merge(a1, a2):
    a3 = []
    len1 = len(a1)
    len2 = len(a2)
    i=j=0
    while i < len1 and j < len2:
        if a1[i] < a2[j]:
            a3.append(a1[i])
            i += 1
        else:
            a3.append(a2[j])
            j += 1
    # we would either have gone through
    # all of a1 or all of a2 by this time
    # just tack on the remaining stuff at the end
    if i < len1:
        a3.extend(a1[i:])
    if j < len2:
        a3.extend(a2[j:])
    return a3    
            

                

