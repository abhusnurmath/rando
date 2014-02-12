import urllib

def getAllCISCourses():
    f = urllib.urlopen("http://www.cis.upenn.edu/grad/springcourses.shtml")
    line = f.readline()
    courses = []
    allMyLines = []
    i=0
    while line:
        if line.find('CIS') > 0:
            courses.append(line[line.find('CIS')+4:line.find('CIS')+7])
        line = f.readline()
    f.close()
    return courses

def main():
    courses = getAllCISCourses()
    print courses

main()
