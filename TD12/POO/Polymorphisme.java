//Polymorphisme

class Animal {
    public void sonAnimal() {
        System.out.println("L'animal fait un bruit");
    }
}

class Cochon extends Animal {
    public void sonAnimal() {
        System.out.println("Le cochon dit : wee wee");
    }
}

class Chien extends Animal {
    public void sonAnimal() {
        System.out.println("Le chien dit : bow wow");
    }
}

public class Polymorphisme {
    public static void main(String[] args) {
        Animal monAnimal = new Animal();  // Crée un objet Animal
        Animal monCochon = new Cochon();  // Crée un objet Cochon
        Animal monChien = new Chien();  // Crée un objet Chien

        monAnimal.sonAnimal();
        monCochon.sonAnimal();
        monChien.sonAnimal();
    }
}
//Dans cet exemple de polymorphisme, la classe Animal définit une méthode sonAnimal, 
//tandis que les classes Cochon et Chien redéfinissent cette méthode pour fournir leur propre implémentation spécifique. 
//Ainsi, même appelée via une référence de type Animal, 
//la méthode sonAnimal se comporte différemment selon l'objet réel auquel elle s'applique.