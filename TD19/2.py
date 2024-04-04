# Extension de la classe Animal
class Animal:
    def __init__(self, nom):
        self.nom = nom
    
    def manger(self):
        print(f"{self.nom} mange...")
    
    def dormir(self):
        print(f"{self.nom} dort...")

# MixIn Runnable
class RunnableMixIn:
    def courir(self):
        print(f"{self.nom} court...")

# MixIn Flyable
class FlyableMixIn:
    def voler(self):
        print(f"{self.nom} vole...")

# Classe Chien qui hérite de Animal et RunnableMixIn
class Chien(Animal, RunnableMixIn):
    pass

# Classe Oiseau qui hérite de Animal et FlyableMixIn
class Oiseau(Animal, FlyableMixIn):
    pass


# (Optionnel) MixIn Swimmable
class SwimmableMixIn:
    def nager(self):
        print(f"{self.nom} nage...")

# Tests
if __name__ == "__main__":
    mon_chien = Chien("Rex")
    mon_oiseau = Oiseau("Tweety")
    
    mon_chien.manger()
    mon_chien.courir()
    mon_chien.dormir()
    
    mon_oiseau.manger()
    mon_oiseau.voler()
    mon_oiseau.dormir()
