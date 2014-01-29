def sneakyAppend(ls):
#lists can be fundamentally altered inside functions
    ls.extend([1,2,3])

lst = [45, 56]
sneakyAppend(lst)
sneakyAppend(lst)
sneakyAppend(lst)
print lst
    
