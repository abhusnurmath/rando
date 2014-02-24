class Stack(object):
    def __init__(self):
        self.storage = []
    def push (self, newValue):
        self.storage.append(newValue)
    def top (self):
        return self.storage[len(self.storage)-1]
    def pop(self):  
        return self.storage.pop()
      
    def isEmpty (self):
        return len(self.storage) == 0
    def getStorage(self):
        return self.storage
    
