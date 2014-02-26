from scipy.integrate import quad

def integrand(x, a, b):
    return a * x + b

def main():
    I = quad(integrand, 0, 1, args = (2, 1))
    print 'the value of the integral ', I[0]
    print 'the error bound is ', I[1]

if __name__ == "__main__":
    main()
