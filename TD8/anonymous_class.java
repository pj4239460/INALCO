interface Greeting {
    void sayHello();
}

public class anonymous_class {
    public static void main(String[] args) {
        // Création d'une instance de Greeting avec une classe anonyme
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Bonjour, le monde !");
            }
        };

        greeting.sayHello(); // Affiche : Bonjour, le monde !
    }
}