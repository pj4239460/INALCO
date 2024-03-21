# Liste de différents types de données
elements = [123, 'hello', [1, 2, 3], {'a': 1, 'b': 2}, lambda x: x*x]

# Classe personnalisée
class MonAnimal:
    pass

# Ajout d'une instance de MonAnimal à la liste
elements.append(MonAnimal())

# Modification de la boucle pour utiliser isinstance()
for elem in elements:
    print(f"Type de {repr(elem)} : {type(elem)}")
    # Vérifications spécifiques avec isinstance()
    if isinstance(elem, str):
        print(f"{elem} est une chaîne de caractères.")
    elif isinstance(elem, int):
        print(f"{elem} est un entier.")
    elif isinstance(elem, MonAnimal):
        print("L'élément est une instance de MonAnimal.")
