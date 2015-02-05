def change_digits_to_letters(license):
    ''' if digit in a spot where there
        should be a letter, replace with most similar
    '''
    #collect the last 3 char of license
    
    list_license = list(license)
    for i in range(0,2):
        if list_license[i] == '1':
            list_license[i] = 'I'
        elif list_license[i] == '2':
            list_license[i] = 'Z'
        elif list_license[i] == '3':
            list_license[i] = 'B'
        elif list_license[i] == '8':
            list_license[i] = 'B'
        elif list_license[i] == '4':
            list_license[i] = 'A'

    return ''.join(list_license)
