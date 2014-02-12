def simpleDiv(a,b):
    if b==0:
        raise RuntimeError, "div by 0"
    else:
        return a/b

def main():
    try:
        f = simpleDiv(5,0)
    except RuntimeError, e:
        print e
    else:
        print("ahh it worked and the answer is ", f)

main()
    
