from addressbook import *

def main():
    #create address book
    contact1 = Contact('Arvind', 2323422321)
    address_book = Address_Book('Bob', [contact1])
    print address_book.owner
    print address_book.contacts[0]
    print address_book.search_name('Arvind')
    address_book.add_contact('Alice', 345)
    print address_book.search_name('Alice')
    address_book.search_memory(contact1)
    print len(address_book.contacts)
    print address_book

if __name__ == '__main__':
    main()
    
