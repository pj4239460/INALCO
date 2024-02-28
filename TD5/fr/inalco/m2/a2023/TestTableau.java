package fr.inalco.m2.a2023;

public class TestTableau {

	public static void main(String[] args) {
		// Déclaration d'un tableau de chaîne.
		String[] unSimpleTableau;

		// Création d'un tableau de 100 référence sur des chaînes.
		unSimpleTableau = new String[100];

		// insertion au 1er indice 
		unSimpleTableau[0] = "Premier élément";

		// Valorisation de certain indice.
		unSimpleTableau[4] = "Une chaine";

		// unSimpleTableau[100] = "";

		// Un Tableau de chaîne.
		String[] unAutreTableau = {"un", "tableau", "de", "chaine", "vielle", "mode"};

		// Un autre tableau
		String[] tableau =  new String[] {"zéro", "un","deux"}; 

		for (int i = 0; i < tableau.length; i++) {
			System.out.println(tableau[i]);
		}

		// Boucle avec invariant.
		int i = 0 ;
		// i est l'invariant de boucle.
		// Ici c'est l'indice de l'élement à afficher.

		while(true) {
			if (i==unAutreTableau.length) {
				break;
			}

			System.out.println(unAutreTableau[i]);	
			i++; 
		}
	}

}