# Exercice 1 : Création d'une hiérarchie de véhicules
class Vehicule:
    def demarrer(self):
        print("Le véhicule démarre")

# class Voiture(Vehicule):
#     pass

# class Moto(Vehicule):
#     pass

# Exercice 2 : Personnalisation des classes enfants
class Voiture(Vehicule):
    def demarrer(self):
        print("La voiture démarre avec un bruit de moteur classique")

    def activerGPS(self):
        print("Le GPS de la voiture est activé")

class Moto(Vehicule):
    def demarrer(self):
        print("La moto démarre avec un bruit de moteur vrombissant")

    def mettreCasque(self):
        print("Le casque de moto est maintenant mis")


def preparerVoyage(vehicule):
    vehicule.demarrer()
    if hasattr(vehicule, 'activerGPS'):
        vehicule.activerGPS()
    if hasattr(vehicule, 'mettreCasque'):
        vehicule.mettreCasque()

# Création des instances
vehicule_generique = Vehicule()
ma_voiture = Voiture()
ma_moto = Moto()

# Démonstration du polymorphisme
preparerVoyage(vehicule_generique) # Affiche "Le véhicule démarre"
preparerVoyage(ma_voiture) # Affiche "La voiture démarre avec un bruit de moteur classique" puis "Le GPS de la voiture est activé"
preparerVoyage(ma_moto) # Affiche "La moto démarre avec un bruit de moteur vrombissant" puis "Le casque de moto est maintenant mis"