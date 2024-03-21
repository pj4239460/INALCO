# Modification de la classe Etudiant pour utiliser __slots__
class Etudiant(object):
    __slots__ = ('nom', 'age')  # Limiter les attributs à 'nom' et 'age'

# Création d'une nouvelle instance e2
e2 = Etudiant()

# Assignation de 'nom' et 'age'
e2.nom = "Bob"
e2.age = 22
print(f"Nom: {e2.nom}, Age: {e2.age}")

# Tent
try:
    e2.score = 95
except AttributeError as error:
    print("Erreur : Impossible d'ajouter l'attribut 'score'. La classe Etudiant est limitée aux attributs 'nom' et 'age' par __slots__.")
