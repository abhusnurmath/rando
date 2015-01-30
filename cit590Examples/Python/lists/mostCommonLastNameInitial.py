import string
def most_common(students):
    initials = []
    #get the first character of the last name into a list called initials
    for student in students:
        initials.append(student.split()[0][0])
    maximum = 0
    for alphabet in string.ascii_uppercase:
       curr_count = initials.count(alphabet)
       if curr_count > maximum:
           maximum = curr_count
           freq_letter = alphabet
    return freq_letter
        
