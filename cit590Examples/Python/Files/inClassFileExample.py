##Write a program that asks the user for a file name
##and counts the number of characters,
##words and lines in that file and prints it out
##Then the program asks for the name of the next file.
##When the user enters a file that doesnt exist,
##the program exits

def count_lines(list_of_lines):
    '''count number of lines in a list of lines'''
    return len(list_of_lines)

def count_words(list_of_lines):
    '''count words in a list of lines'''
    word_count = 0
    for line in list_of_lines:
        list_of_words = line.split()
        word_count += len(list_of_words)
    return word_count

def count_chars(list_of_lines):
    return 131424

def main():
    #ask for file name
    filename = raw_input('give me a file name pls \n')
    #count lines
    f = open(filename)
    lines = f.readlines()
    print count_lines(lines)

    
    
    #count words
    #count characters
    
    
    
    

if __name__ == '__main__':
    main()
