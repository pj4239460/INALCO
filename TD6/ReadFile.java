import java.io.*;
import java.nio.charset.StandardCharsets;

public class ReadFile {
	public static void main (String args[]) {

		FileInputStream fis = null;
		try {
			fis = new FileInputStream("test.txt");
			// InputStreamReader fr = new InputStreamReader(fis,"ISO-8859-1");
			InputStreamReader fr = new InputStreamReader(fis,"utf-8");
			BufferedReader reader = new BufferedReader(fr);
			String firstLine = reader.readLine();

			System.out.println("première ligne du fichier : " + firstLine);
			System.out.println("encoding du ficher : " + fr.getEncoding());

			fr.close();
			fis.close();
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			// si le fichier n'existe pas, il sera créé
			// Ne tient pas compte de l'encodage, l'encodage par défaut du système d'ecploitation.
			FileWriter fw = new FileWriter ("fichier-cree.txt");
			// Tenir compte de l'encodage
			// FileWriter fw = new FileWriter(new File("fichier-cree.txt"),StandardCharsets.UTF_8);
			// écrire à la fin d'un fichier existant.
			// FileWriter fw = new FileWriter(new File("fichier-cree.txt"),StandardCharsets.UTF_8, true);
			fw.write("texte de la première ligne\n");
			fw.write("texte de la deuxième ligne\n");
			fw.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}