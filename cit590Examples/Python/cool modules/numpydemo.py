import numpy as np

def main():
    rows = input('how many rows in your square matrix?\n')
    cols = rows
    print 'start inputting numbers in your matrix. \n'
    ls = []
    count = 0
    while (count != rows*cols):
        num = input()
        ls.append(num)
        count += 1
    x = np.array(ls).reshape(rows, cols)
    print x
    mat = np.matrix(x)
    print 'the determinant of your matrix is =', np.linalg.det(mat)
    eig = np.linalg.eig(mat)
    eigenValues = eig[0]
    print eigenValues

if __name__ == "__main__":
    main()
    
    
    
    
    
