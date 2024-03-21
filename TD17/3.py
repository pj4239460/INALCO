# Mise à jour de la classe MonAnimal
class MonAnimal:
    def __init__(self, nom="", age=0):
        self.nom = nom
        self.age = age

# Création d'une instance de MonAnimal
mon_animal = MonAnimal("Rex", 5)

# Fonction pour tester, obtenir ou définir des attributs
def tester_obtenir_definir_attribut(obj, attribut, valeur_defaut=None):
    if hasattr(obj, attribut):
        valeur = getattr(obj, attribut)
        print(f"La valeur de l'attribut '{attribut}' est {valeur}.")
    else:
        setattr(obj, attribut, valeur_defaut)
        print(f"Attribut '{attribut}' non trouvé. Défini à {valeur_defaut}.")

# Test de la fonction avec différents attributs
print(dir(mon_animal))
tester_obtenir_definir_attribut(mon_animal, "nom")
tester_obtenir_definir_attribut(mon_animal, "age")
tester_obtenir_definir_attribut(mon_animal, "couleur", "marron")
