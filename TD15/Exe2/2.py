class Person:
    def __init__(self, name, age):
        self.name = name  # Enregistre le nom dans l'attribut name
        self.age = age  # Enregistre l'âge dans l'attribut age

# Création d'une instance avec des attributs spécifiques
my_person = Person("John Doe", 30)
print(my_person.name)  # Affiche "John Doe"
print(my_person.age)  # Affiche 30
