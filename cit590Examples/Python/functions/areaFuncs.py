def area_of_rectangle(length, breadth):
    '''computes the area of '''
    # the first value passed to this function
    # will be stored in length,
    # the second value passed to this function
    # will be stored in breadth
    area = length * breadth
    return area

def area_of_square(s):
    '''computes the area of a square of side s'''
    # whatever value is passed to this function
    # is saved into the variable called s
    # and then s is used in this function
    return s ** 2

def main():
    square_side = 5
    print ('area of square method 1 '
    , area_of_square(square_side))
    
    #this has no effect since
    #this variable is local to main
    length = 723

    print ('area of square method 2 '
    , area_of_rectangle(square_side, square_side))
    

if __name__ == "__main__":
    main()
    


