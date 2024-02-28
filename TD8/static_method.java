public class static_method {
    public static void main(String[] args) {
        Person.setNumber(99);
        System.out.println("Person number " + Person.number);
    }
}

class Person {
    public static int number;

    public static void setNumber(int value) {
        number = value;
    }
}
