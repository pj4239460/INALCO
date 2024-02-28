class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + '\'' + ", age=" + age + '}';
    }
}

class Pair<T> {
    private T first;
    private T last;

    public Pair(T first, T last) {
        this.first = first;
        this.last = last;
    }

    public T getFirst() {
        return first;
    }

    public T getLast() {
        return last;
    }
}

public class Main {
    public static void main(String[] args) {
        Person alice = new Person("Alice", 30);
        Person bob = new Person("Bob", 40);

        // Utilisation directe du constructeur pour créer l'objet Pair
        Pair<Person> personPair = new Pair<>(alice, bob);

        System.out.println("Première personne : " + personPair.getFirst());
        System.out.println("Deuxième personne : " + personPair.getLast());
    }
}