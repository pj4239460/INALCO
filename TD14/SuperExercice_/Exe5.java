import java.util.Arrays;
import java.util.List;

public class Exe5 {

    // Définir la méthode printList qui peut imprimer une liste d'éléments de n'importe quel type
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Print a list of integers:");
        printList(integerList);

        List<String> stringList = Arrays.asList("Hello", "World", "Java");
        System.out.println("Print string list:");
        printList(stringList);

        List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.3);
        System.out.println("Print a list of double floating numbers:");
        printList(doubleList);
    }
}
