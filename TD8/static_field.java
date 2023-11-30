public class static_field {
    public static void main(String[] args) {
        Person Tom = new Person("Tom Tom", 12);
        Person Jerry = new Person("Jerry Jerry", 15);
        Tom.number = 88;
        System.out.println("Jerry number " + Jerry.number);
        Jerry.number = 99;
        System.out.println("Tom number " + Tom.number);

        //Pour les champs statiques, peu importe quel instance modifie le champ statique, l'effet est le même : 
        //le champ statique de toutes les instances est modifié, car le champ statique n'appartient pas à l'instance.


        //Bien que les instances puissent accéder aux champs statiques, 
        //elles se réfèrent en fait au champ statique de la classe Person. 
        //Ainsi, toutes les instances partagent un seul champ statique. 
        //Il est recommandé d'accéder aux champs statiques en utilisant le nom de la classe. 
        // Person.number = 77;
        // System.out.println("Person number " + Person.number);
    }
}

class Person {
    public String name;
    public int age;

    // non static
    public int number;

    // static
    // public static int number;
    

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}