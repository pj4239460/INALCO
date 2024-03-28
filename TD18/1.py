# -*- coding: utf-8 -*-
import time, functools

def metric(fn):
    @functools.wraps(fn)  # Utilise functools.wraps pour préserver le nom et la docstring de la fonction originale
    def wrapper(*args, **kw):
        debut = time.time()  # Temps de début
        resultat = fn(*args, **kw)  # Appel de la fonction originale et obtention du résultat
        fin = time.time()  # Temps de fin
        print('%s exécuté en %s ms' % (fn.__name__, (fin - debut) * 1000))
        return resultat
    return wrapper

# Test
@metric
def rapide(x, y):
    time.sleep(0.0012)
    return x + y

@metric
def lent(x, y, z):
    time.sleep(0.1234)
    return x * y * z

f = rapide(11, 22)
print(f)
s = lent(11, 22, 33)
print(s)
