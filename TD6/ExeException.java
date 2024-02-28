import java.io.IOException;

public class ExeException{
	public static void main(String[] args){
		try {
			// Supposons que ces méthodes peuvent lancer différentes exceptions
			methodeQuiLanceIOException();
			methodeQuiLanceNullPointerException();
			
		} catch (NullPointerException e) {
			System.out.println("Une NUllPointerException a été capturée: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Une IOExceptio a été capturée: " + e.getMessage());
		} catch (Exception e) {
			// Ce bloc catch capture toutes les autres exceptions
			System.out.println("Une exception non spécifiée a été capturée: " + e.getMessage());
		} finally {
			// Ce bloc s'exécute toujours, qu'une exception ait été capturée ou non
			System.out.println("Bloc finally exécuté.");
		}

	}

	private static void methodeQuiLanceNullPointerException(){
		// Exemple de code qui peut lancer NullPointerException
		String chaine = null;
		int longueur = chaine.length(); // Ceci va lancer une NullPointerException
	}

	private static void methodeQuiLanceIOException() throws IOException {
		// Exemple de code qui peut lancer IOException
		throw new IOException("Erruer d'entrée/sortie");// lancement manuel d'une IOEception
	}


}