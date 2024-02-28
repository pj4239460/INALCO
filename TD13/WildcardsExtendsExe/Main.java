class Box<T> {
    private T item;
    
    public void set(T item) {
        this.item = item;
    }
    
    public T get() {
        return item;
    }
}

public class Main {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.set(123);
        
        printNumberBox(integerBox);
        
        Box<Double> doubleBox = new Box<>();
        doubleBox.set(456.78);
        
        printNumberBox(doubleBox);
    }

    public static void printNumberBox(Box<? extends Number> box) {
        box.set(10); // Error: set(capture#1-of ? extends Number) in Box<capture#1-of ? extends Number> cannot be applied to (int)
        System.out.println(box.get());
    }
}
//1. Pourquoi ne pouvons-nous pas écrire dans Box<? extends Number> même si nous savons que 10 est un Integer et donc un sous-type de Number ?

//La raison pour laquelle nous ne pouvons pas écrire dans une Box<? extends Number> est due 
//à la manière dont Java traite la sécurité des types avec les génériques. L'utilisation de ? extends Number 
//signifie que la Box peut contenir n'importe quel objet de type Number ou de ses sous-types. 
//Cependant, au moment de la compilation, Java ne peut pas déterminer de quel sous-type de Number il s'agit spécifiquement. 
//Ainsi, bien que 10 soit un Integer, qui est un sous-type de Number, 
//Java interdit cette opération pour éviter le risque d'ajouter un type incorrect dans la Box 
//(par exemple, ajouter un Integer dans une Box<Double>), ce qui pourrait conduire à des erreurs de type à l'exécution.

//2. Comment modifieriez-vous la classe Box ou l'utilisation de celle-ci si vous deviez à la fois lire et écrire des 
//éléments de types spécifiques (par exemple, Integer, Double) dans la même instance de Box ?

//Pour pouvoir lire et écrire des éléments de types spécifiques dans la même instance de Box, 
//il est nécessaire de ne pas utiliser de joker (? extends ou ? super) lors de la déclaration de Box. 
//Vous devez déclarer Box avec un type générique spécifique lors de son utilisation, 
//par exemple Box<Integer> ou Box<Double>. Cela garantit que vous pouvez à la fois lire et écrire des 
//éléments du type spécifié sans compromettre la sécurité de type.

// Box<Integer> integerBox = new Box<>();
// integerBox.set(10); // Valide
// Integer value = integerBox.get(); // Valide

//Si vous avez besoin d'une flexibilité maximale, envisagez de redéfinir la méthode ou d'utiliser 
//des méthodes différentes pour des opérations spécifiques qui nécessitent une écriture sécurisée dans la Box.
