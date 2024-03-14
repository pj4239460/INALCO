class Student(object):

    def __init__(self, name, gender):
        self.name = name
        self.__gender = gender

    def get_gender(self):
        return self.__gender

    def set_gender(self,gender):
        self.__gender = gender
        
# Test :
bart = Student('Bart', 'male')
if bart.get_gender() != 'male':
    print('Test échoué !')
else:
    bart.set_gender('female')
    if bart.get_gender() != 'female':
        print('Test échoué !')
    else:
        print('Test réussi !')