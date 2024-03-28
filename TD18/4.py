class Ecran(object):
    def __init__(self):
        # Initialiser les variables d'instance privées pour largeur et hauteur
        self._largeur = 0
        self._hauteur = 0

    @property
    def largeur(self):
        # Le getter pour la largeur
        # Retourne la valeur de la largeur de l'écran
        return self._largeur

    @largeur.setter
    def largeur(self, valeur):
        # Le setter pour la largeur
        # Permet de définir la largeur de l'écran
        self._largeur = valeur

    @property
    def hauteur(self):
        # Le getter pour la hauteur
        # Retourne la valeur de la hauteur de l'écran
        return self._hauteur

    @hauteur.setter
    def hauteur(self, valeur):
        # Le setter pour la hauteur
        # Permet de définir la hauteur de l'écran
        self._hauteur = valeur

    @property
    def resolution(self):
        # Une propriété en lecture seule pour la résolution
        # Calcule la résolution en multipliant la largeur par la hauteur
        return self._largeur * self._hauteur

# Test :
s = Ecran()
s.largeur = 1024  # Définit la largeur de l'écran
s.hauteur = 768   # Définit la hauteur de l'écran
print('résolution =', s.resolution)  # Affiche la résolution de l'écran
if s.resolution == 786432:
    print('Test réussi !')
else:
    print('Test échoué !')
