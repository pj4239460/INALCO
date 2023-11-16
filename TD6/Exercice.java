import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class MonException extends Exception {
    public MonException(String message) {
        super(message);
    }
}
//Lorsque vous déclarez une classe en Java sans utiliser de modificateur d'accès (comme public, private ou protected), 
//cette classe a par défaut un accès au niveau du package. 

public class Exercice {
	public static int diviser(int numerateur, int denominateur) {
		return numerateur / denominateur;
	}

	public static void main(String[] args) {
		//exercice 1.
		//Écrivez une méthode qui divise deux nombres et utilise le traitement des exceptions pour gérer la division par zéro.
        try {
            int result = diviser(10, 0);
            System.out.println("Le résultat est : " + result);
        } catch (ArithmeticException e) {
            System.out.println("Erreur: Division par zéro.");
        }

        //exercice 2.
        //Écrivez une méthode qui lit un fichier et gère les exceptions qui pourraient se produire, telles que le fichier non trouvé.
        try {
            BufferedReader reader = new BufferedReader(new FileReader("monFichier.txt"));
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                System.out.println(ligne);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Erreur lors de la lecture du fichier: " + e.getMessage());
        }

        //exercice 3.
        //Créez une classe personnalisée d'exception en Java nommée MonException, puis écrivez un code qui la déclenche.
        try {
            tester();
        } catch (MonException e) {
            System.out.println("Exception capturée: " + e.getMessage());
        }
	}
    public static void tester() throws MonException {
        throw new MonException("Ceci est une exception personnalisée");
    }
}