import java.util.Arrays;
import java.util.List;

public class Exe2 {

    // Définir la méthode sumOfList pour calculer la somme de tous les éléments Number dans la liste
    public static double sumOfList(List<? extends Number> list) {
        double sum = 0.0;
        for (Number number : list) {
            sum += number.doubleValue(); // Utiliser doubleValue pour traiter tous les types de Number
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("The sum of integerList is: " + sumOfList(integerList));

        List<Double> doubleList = Arrays.asList(1.5, 2.5, 3.5);
        System.out.println("The sum of doubleList is: " + sumOfList(doubleList));
    }
}
