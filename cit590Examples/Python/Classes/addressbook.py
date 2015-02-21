class Address_Book(object):
    def __init__(self, owner, contacts):
        ''' owner is a string and contacts is a list
            of contact objects
        '''
        #design this with a dictionary keyed on name
        self.owner = owner
        self.contacts = contacts

    def search_memory(self, contact):
        '''search for a contact(Contact object)'''
        return self.contacts.index(contact)

    def search_name(self, name):
        '''name being passed in as a string'''
        for contact in self.contacts:
            if contact.name == name:
                return contact.phone
        return 'does not exist'

    def add_contact(self, name, phone):
        '''add contact with this name and this ph'''
        new_contact = Contact(name, phone)
        self.contacts.append(new_contact)

    #def delete_name(name):

    def __str__(self):
        output_string = ''
        output_string += 'address book of ' + self.owner + '\n'
        for contact in self.contacts:
            output_string += str(contact)
            output_string += '\n'
        return output_string

class Contact(object):
    def __init__(self, name, phone):
        self.name = name
        self.phone = phone
    def __str__(self):
        return self.name + ' ' + str(self.phone)


