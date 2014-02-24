class Animal:
    def Name(self):
        pass
    def Sleep(self):
        print 'sleep'
    def MakeNoise(self):
        pass

class Dog(Animal):
    def Name(self):
        print 'I am a dog'
    def MakeNoise(self):
        print 'Woof!'

class Lion(Animal):
    def Name(self):
        print 'I am a lion'
    def Sleep(self):
        Animal.Sleep(self)
    def MakeNoise(self):
        print 'Roar!'

class UnknownBeast(Animal):
    def Name(self):
        print 'I am the great unknown!'

class TestAnimal:
    def GoToSleep(self, animal):
        animal.Sleep()
    def MakeNoise(self, animal):
        animal.MakeNoise()
    
