from addressbook import *
import unittest

class Test_AddressBook(unittest.TestCase):
    def setUp(self):
        self.addressbook = Address_Book('abc', [Contact('b', 12)])
        
    def test_init(self):
        self.assertEqual(self.addressbook.owner, 'abc')
        self.assertEqual(len(self.addressbook.contacts), 1)

    def test_add_contact(self):
        self.addressbook.add_contact('c', 34)
        self.assertEqual(len(self.addressbook.contacts), 2)
        self.assertTrue(type(self.addressbook.contacts[1]) is Contact)
        self.assertEqual(self.addressbook.contacts[1].name, 'c')

    def test_search_name(self):
        phone = self.addressbook.search_name('b')
        self.assertEqual(12, phone)

unittest.main()
