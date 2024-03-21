# Continuation de l'exercice 1
# Définition de la classe Etudiant
class Etudiant(object):
    pass

# Instanciation d'un objet e1
e1 = Etudiant()

# Ajout dynamique d'un attribut nom à e1
e1.nom = "Alice"

# Définition de la fonction definir_age
def definir_age(self, age):
    self.age = age

# Importation de MethodType du module types
from types import MethodType

# Ajout dynamique de la méthode definir_age à e1
e1.definir_age = MethodType(definir_age, e1)

# Définition de l'âge de e1
e1.definir_age(20)

# Affichage de l'âge de e1
print(e1.age)
