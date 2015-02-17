import urllib

def getAllOHs():
    f = urllib.urlopen("http://www.seas.upenn.edu/~bhusnur4/cit590_spring2015/staff.html")
    line = f.readline()
    print line
    OHs = []
    allMyLines = []
    #as long as there are lines in the file
    while line:
        allMyLines.append(line)
        # if 'Office Hours' not found we get -1
        if line.find('Office Hours') >=0:
            OHs.append(line)
        line = f.readline()
    f.close()
    return OHs

def main():
    tas = getAllOHs()
    print tas

if __name__ == '__main__':
    main()
