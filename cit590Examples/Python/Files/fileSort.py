import os

# we need a global counter that keeps track
# of the number of files being made
topTemp = 0
def makeTempFileName():
    global topTemp
    topTemp += 1
    return "t" + str(topTemp) + ".txt"

def makeTempFiles(fin):
    #read from the file fin and make temporary files
    tnames = []
    done = False
    while not done:
        tn = makeTempFileName()
        tnames.append(tn)
        fn = open(tn , "w")
        lines = []
        I = 0
        while not done and I < 100:
            I += 1
            line = fin.readline()
            if line:
                lines.append(line)
            else:
                done = True
        lines.sort()
        fn.writelines(lines)
        fn.close()
    return tnames

#take a list of files
#extract the first 2 and merge them into 1
def mergeTwoIntoOne(tlist):
    t1 = tlist.pop()
    t2 = tlist.pop()
    tn = makeTempFileName()
    tlist.append(tn)
    f1 = open(t1)
    f2 = open(t2)
    fn = open(tn, "w")
    mergeFiles(f1, f2, fn)
    f1.close()
    f2.close()
    #might as well clean up the temp files created
    os.remove(t1)
    os.remove(t2)
    fn.close()

def mergeFiles(f1, f2, fn):
    line1 = f1.readline()
    line2 = f2.readline()
    while line1 and line2:
        if line1 < line2:
            fn.write(line1)
            line1 = f1.readline()
        else:
            fn.write(line2)
            line2 = f2.readline()
    while line1:
        fn.write(line1)
        line1 = f1.readline()
    while line2:
        fn.write(line2)
        line2 = f2.readline()

def main():
    #make the temporary files
    try:
        fin = open("input.txt");
    except IOError, e:
        print("said file does not exist")
    else:
        tlist = makeTempFiles(fin)
    #merge all these temporary files
    while len(tlist) > 1:
        mergeTwoIntoOne(tlist)
    # finally when there is only 1 file left, do the rename
    tname = tlist.pop()
    os.rename(tname, "outputForClass.txt")

main()
