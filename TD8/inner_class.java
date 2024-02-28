public class inner_class {
    public static void main(String[] args) {
        Outer outer = new Outer("Nested"); // Outer
        // pour instancier un Inner, nous devons d'abord créer une instance de Outer, 
        // puis utiliser le new de l'instance de Outer pour créer l'instance de Inner
        Outer.Inner inner = outer.new Inner(); // Inner
        //instancier une Classe Interne ne peut pas se faire sans une instance de Outer.
        inner.hello();

        // modifier le name de outer
        inner.setName("Modified");
        inner.hello();
    }
}

class Outer {
    private String name;

    Outer(String name) {
        this.name = name;
    }

    class Inner {
        void hello() {
            System.out.println("Hello, " + Outer.this.name);
        }
        // Méthode ajoutée dans la classe Inner pour modifier le champ name de la classe Outer.
        void setName(String newName) {
            Outer.this.name = newName;
        }
    }
}
