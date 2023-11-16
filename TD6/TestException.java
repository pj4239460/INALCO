import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestException {

	//Pas besoin d'import pour IllegalArgumentException car elle fait partie du lang.java
	// Déclenchement d'une exception avec l'instruction throw
	public static double racineCarree(double nombre) {
		if (nombre < 0) {
			throw new IllegalArgumentException("Le nombre ne peut pas être négatif");
		}
		return Math.sqrt(nombre);
	}

	public static void main(String[] args) {
		// Déclenchement d'une exception par une opération qui ne peut aboutir
		try {
			FileInputStream file = new FileInputStream("fichier_inexistant.txt");			
		} catch (FileNotFoundException e) {
			System.out.println("Le ficher n'a pas été trouvé: " + e.getMessage());
		}

		//Test de la méthode racineCarree
		try {
			double resultat = racineCarree(-5);
			// double resultat = racineCarree(5);
			System.out.println("La racine carrée est: " + resultat);
		} catch (IllegalArgumentException e) {
			System.out.println("Erruer: " + e.getMessage());
		}
	}
}