# Liste de différents types de données
elements = [123, 'hello', [1, 2, 3], {'a': 1, 'b': 2}, lambda x: x*x]

# Parcourir la liste et imprimer le type de chaque élément
for elem in elements:
    print(f"Type de {repr(elem)} : {type(elem)}")
    # Vérifications spécifiques
    if isinstance(elem, str):
        print(f"{elem} est une chaîne de caractères.")
    elif isinstance(elem, int):
        print(f"{elem} est un entier.")
