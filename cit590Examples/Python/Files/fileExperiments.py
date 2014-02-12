def main():
    f = open("thelyrics.txt")
    fout = open("thelyrics3.txt", "w")
    lst = f.readlines()
    lst.reverse()
    fout.writelines(lst)
    fout.close()

    f.close()

    f3 = open("thelyrics.txt",'r+')
    lst = f3.readlines()
    lst.reverse()
    f3.writelines(lst)
    f3.close()

    
main()
