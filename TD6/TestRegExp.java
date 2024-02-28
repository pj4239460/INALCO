import java.util.regex.*;

public class TestRegExp {
	public static void main(String args[]){
		try{
			String texte = "aezrty";
			Pattern p = Pattern.compile("[a-z]*");
			Matcher m = p.matcher(texte);
			boolean matched = m.find();
			System.out.println("Une partie du texte correspond-il au motif ? " + matched);
		} catch (PatternSyntaxException pse) {
			// exception levée lors de la compilation
			// si la syntaxe de l'expression n'est pas correcte
		}

		Pattern p = Pattern.compile("#.*#");

		String text = "Ici, #un mot à trou# et là encore un #autre#";

		Matcher m = p.matcher(text);

		while(m.find()) {
			// affichage de la sous-chaine capturée,
			// de l'index de début dans la chaine originale
			// et de l'index de fin
			System.out.println("Le texte \"" + m.group() + 
				"\" débute à " + m.start() + " et termine à " + m.end());
		}

	}
}