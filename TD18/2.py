def log(arg):
    if callable(arg):  # Si l'argument est une fonction (utilisation du décorateur sans paramètre)
        func = arg
        def wrapper(*args, **kwargs):
            print('begin call')
            result = func(*args, **kwargs)
            print('end call')
            return result
        return wrapper
    else:  # Si l'argument est une chaîne de caractères (utilisation du décorateur avec un paramètre)
        def decorator(func):
            def wrapper(*args, **kwargs):
                print(f'{arg} begin call')
                result = func(*args, **kwargs)
                print(f'{arg} end call')
                return result
            return wrapper
        return decorator

# Mode d'utilisation
@log
def f():
    pass

@log('execute')
def g():
    pass

f()
g()