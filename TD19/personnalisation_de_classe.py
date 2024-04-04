# L'exercice 1
class Livre:
    def __init__(self, titre, auteur):
        self.titre = titre  # Initialisation du titre du livre
        self.auteur = auteur  # Initialisation de l'auteur du livre
    
    def __str__(self):
        # Retourne une chaîne de caractères formatée pour l'affichage
        return f"Livre: {self.titre}, écrit par {self.auteur}"
    __repr__ = __str__

# Test de l'exercice 1
print("Test de l'exercice 1")
livre1 = Livre("Les Misérables", "Victor Hugo")
print(livre1)  # Devrait afficher "Livre: Les Misérables, écrit par Victor Hugo"

# L'exercice 2
class Bibliotheque:
    def __init__(self):
        self.livres = []  # Liste pour stocker les livres
        self.index_actuel = 0  # Indice pour l'itération

    def ajouter_livre(self, livre):
        self.livres.append(livre)  # Ajout d'un livre à la bibliothèque
    
    def __iter__(self):
        self.index_actuel = 0  # Réinitialise l'indice pour une nouvelle itération
        return self

    def __next__(self):
        if self.index_actuel < len(self.livres):
            # Retourne le livre actuel et incrémente l'indice
            livre = self.livres[self.index_actuel]
            self.index_actuel += 1
            return livre
        raise StopIteration  # Levée quand tous les livres ont été parcourus
        #S'il y a pas de StopIteration, que se passe-t-il?

# Test de l'exercice 2
print("Test de l'exercice 2")
biblio = Bibliotheque()
biblio.ajouter_livre(Livre("1984", "George Orwell"))
biblio.ajouter_livre(Livre("Le Meilleur des mondes", "Aldous Huxley"))

for livre in biblio:
    print(livre)  # Affiche chaque livre de la bibliothèque

# L'exercice 3
# La classe Bibliotheque est modifiée comme suit pour l'exercice 3
class NewBibliotheque:
    def __init__(self):
        self.livres = []
    
    def ajouter_livre(self, livre):
        self.livres.append(livre)
    
    def __getitem__(self, index):
        # Gère l'accès par indice ou par slice
        return self.livres[index]

# Test de l'exercice 3
print("Test de l'exercice 3")
biblio = NewBibliotheque()
biblio.ajouter_livre(Livre("1984", "George Orwell"))
biblio.ajouter_livre(Livre("Le Meilleur des mondes", "Aldous Huxley"))
biblio.ajouter_livre(Livre("Harry Potter à l'école des sorciers", "J.K. Rowling"))
print(biblio[0])  # Accès au premier livre ajouté
print(biblio[1:3])  # Utilisation d'un slice pour obtenir une liste des livres

# Ces tests affichent le premier livre de la bibliothèque, puis les livres de l'indice 1 à 2.

