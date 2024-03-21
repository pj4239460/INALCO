# -*- coding: utf-8 -*-
class Etudiant(object):
    compte = 0

    def __init__(self, nom):
        self.nom = nom
        Etudiant.compte += 1

# Test :
if Etudiant.compte != 0:
    print('Test échoué !')
else:
    bart = Etudiant('Bart')
    if Etudiant.compte != 1:
        print('Test échoué !')
    else:
        lisa = Etudiant('Bart')
        if Etudiant.compte != 2:
            print('Test échoué !')
        else:
            print('Étudiants :', Etudiant.compte)
            print('Test réussi !')
