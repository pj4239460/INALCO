#EX1
# Classe de base Animal
class Animal:
    def __init__(self, nom):
        self.nom = nom
    
    def manger(self):
        print(f"{self.nom} mange...")

# MixIn Runnable
class RunnableMixIn:
    def courir(self):
        print(f"{self.nom} court...")

# MixIn Flyable
class FlyableMixIn:
    def voler(self):
        print(f"{self.nom} vole...")

#EX2
# Classe Chien qui hérite de Animal et RunnableMixIn
class Chien(Animal, RunnableMixIn):
    pass

# Classe Oiseau qui hérite de Animal et FlyableMixIn
class Oiseau(Animal, FlyableMixIn):
    pass
