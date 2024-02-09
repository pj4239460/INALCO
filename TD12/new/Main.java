// Tri
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person[] ps = new Person[] {
            new Person("Bob", 61),
            new Person("Alice", 88),
            new Person("Lily", 75),
        };
        Arrays.sort(ps);
        System.out.println(Arrays.toString(ps));
    }
}

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