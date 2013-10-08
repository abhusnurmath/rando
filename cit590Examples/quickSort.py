def quickSort(a):
    if a:
        pivot = a[0]
        return (
            quickSort([x for x in a if x < pivot]) +
            [x for x in a if x == pivot] +
            quickSort([x for x in a if x > pivot])
            )
    else:
        return []













def quickSort2(a, comp):
    if a:
        pivot = a[0]
        return (
            quickSort2([x for x in a if comp(x, pivot)], comp)
        + [x for x in a if x == pivot]
        + quickSort2([x for x in a if comp(pivot, x)], comp)
                )
    else:
        return []
        
