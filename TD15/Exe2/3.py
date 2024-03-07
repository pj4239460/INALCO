class Person:
    def __init__(self, name, age):
        self.name = name  # Enregistre le nom dans l'attribut name
        self.age = age  # Enregistre l'âge dans l'attribut age
        
    def introduce(self):
        # Méthode pour imprimer un message d'introduction
        print(f"My name is {self.name} and I am {self.age} years old.")  # Je m'appelle [name] et j'ai [age] ans.

my_person = Person("John Doe", 30)
my_person.introduce()  # Appelle la méthode introduce de l'instance my_person
