from addressbook import *
import unittest

class Test_AddressBook(unittest.TestCase):
    def test_init(self):
        addressbook = Address_Book('abc', [Contact('b', 12)])
        self.assertEqual(addressbook.owner, 'abc')
        self.assertEqual(len(addressbook.contacts), 1)

    def test_add_contact(self):
        addressbook = Address_Book('abc', [Contact('b', 12)])
        addressbook.add_contact('c', 34)
        self.assertEqual(len(addressbook.contacts), 2)
        self.assertTrue(type(addressbook.contacts[1]) is Contact)
        self.assertEqual(addressbook.contacts[1].name, 'c')

unittest.main()
