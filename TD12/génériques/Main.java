import java.util.ArrayList;
import java.util.Arrays;

// interface Comparable<T> {
//     /**
//      * Retourne un nombre négatif : l'instance actuelle est plus petite que l'argument o
//      * Retourne 0 : l'instance actuelle est égale à l'argument o
//      * Retourne un nombre positif : l'instance actuelle est plus grande que l'argument o
//      */
//     int compareTo(T o);
// }

// class Person {
//     String nom;
//     int score;
//     Person(String nom, int score) {
//         this.nom = nom;
//         this.score = score;
//     }
//     public String toString() {
//         return this.nom + "," + this.score;
//     }
// }

class Person implements Comparable<Person> {
    String nom;
    int score;
    Person(String nom, int score) {
        this.nom = nom;
        this.score = score;
    }
    public int compareTo(Person autre) {
        return this.nom.compareTo(autre.nom);
    }
    public String toString() {
        return this.nom + "," + this.score;
    }
}

public class Main {
    public static void main(String[] args) {
        // ArrayList list = new ArrayList();
        // list.add("Hello");
        // // Obtention d'un Object, nécessité de caster explicitement en String :
        // String first = (String) list.get(0);
        // System.out.println(first);

        // list.add(new Integer(123));
        // // ERREUR : ClassCastException :
        // String second = (String) list.get(1);

        // ArrayList<String> strList = new ArrayList<String>();

        // strList.add("hello"); // OK
        // String s = strList.get(0); // OK
        // strList.add(new Integer(123)); // Erreur de compilation !
        // Integer n = strList.get(0); // Erreur de compilation !

        String[] ss = new String[] { "Orange", "Pomme", "Poire" };
        Arrays.sort(ss);
        System.out.println(Arrays.toString(ss));

        Person[] ps = new Person[] {
            new Person("Bob", 61),
            new Person("Alice", 88),
            new Person("Lily", 75),
        };
        Arrays.sort(ps);
        System.out.println(Arrays.toString(ps));

    }
}
