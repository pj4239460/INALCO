package fr.inalco.m2.a2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
// import java.util.*;

public class TestCollections {
	public static void main(String[] args) {
		// Un Tableau de chaîne.
		String[] unAutreTableau = {"un", "tableau", "de", "chaine", "vielle", "mode"};

		/*------------------ I. Les Listes ---------------------------*/
		// Construction d'une liste de chaînes de caractères implémentée sous forme de tableau.
		List<String> uneListe = new ArrayList<>();

		// Ajouter tout un tableau directement à une liste ne fonctionne pas.
		// uneListe.addAll(unAutreTableau);

		/* Il faut d'abord le convertir en utilisant la méthode static asList de la classe Arrays */
		uneListe.addAll(Arrays.asList(unAutreTableau));

		String test1 = "chaine";
		String test2 = "vache";

		System.out.println(test1 + " est contenu dans " + uneListe + " : " + uneListe.contains(test1));
		System.out.println(test2 + " est contenu dans " + uneListe + " : " + uneListe.contains(test2));

		// Création d'une autre liste sous forme de liste chaînée.
		List<String> uneListeChainee = new LinkedList<>();
		uneListeChainee.addAll(Arrays.asList(unAutreTableau));

		// Illustration containsAll
		System.out.println("La liste chainee contient-elle toute la liste : " + uneListeChainee.containsAll(uneListe));

		// Ci-dessous, on commence à voir la puissance de l'abstraction de l'orientée objet.
		// On peut comparer le contenu d'une liste chaînée au contenu d'une liste tableau car les deux structures 
		// sont des listes de chaînes.
		System.out.println("Une liste chainee est-elle égale à une liste tableau : " + uneListeChainee.equals(uneListe));

		String ajout1 = "ajout1";
		uneListe.add(ajout1); // Ajout un élément à la fin. ici index 6
		System.out.println("Index de l'ajout  : " + uneListe.indexOf(ajout1)); // 6

		String ajout2 = "ajout2";
		uneListe.add(ajout2); // 7
		System.out.println("Index de l'ajout  : " + uneListe.indexOf(ajout2)); // 7

		// Attention à la gestion des doublons. 
		uneListe.add("ajout2"); // 8
		System.out.println("Index de ajout2  : " + uneListe.indexOf("ajout2"));
		// 7 car c'est la première occurence qui est affichée
		System.out.println("Dernier Index de ajout2  : " + uneListe.lastIndexOf("ajout2")); // 8

		uneListe.remove(ajout2);// Retire la première occurence de ajout2
		System.out.println("Index de ajout2  : " + uneListe.indexOf("ajout2"));
		System.out.println("Dernier Index de ajout2  : " + uneListe.lastIndexOf("ajout2"));

		String ajout3 = "ajout3";
		uneListe.add(ajout3);

		System.out.println("Index de ajout2 , ajout3 : " + uneListe.indexOf("ajout2") + " , " + uneListe.indexOf(ajout3));
		uneListe.remove(7); // Suppression de ajout2

		System.out.println("Index de ajout2 , ajout3 : " + uneListe.indexOf("ajout2") + " , " 
				+ uneListe.indexOf(ajout3));
		// -1 et 7. Comme prévu l'élément placé en 8 a été déplacé en 7.
		// Cette opération sur un tableau peu être très couteuse, contrairement à celle d'une liste chaînée.

		System.out.println("listChainée(5) : " + uneListeChainee.get(5));
		// Le coût de cet accès est d'ordre N : il faut parcourir les N-1 éléments pour arrivé à N. 

		uneListe.add(7, ajout2); 
		// J'insère à l'indice 7, en décalant ce qui était au 7 : coûteux pour les tableaux.

		System.out.println("Index de ajout2 , ajout3 : " + uneListe.indexOf("ajout2") + " , " 
				+ uneListe.indexOf(ajout3)); // 7 et 8. Comme prévu l'élément placé en 7 a déplacé celui-du 7 en 8.

		/*--------------------- II. Les Set ------------------------------*/
		// Déclaration d'un ensemble sous forme d'arbre.
		Set<String> unSet = new HashSet<String>();

		// unSet.addAll(unAutreTableau);// Ne fonctionne pas, comme pour Liste.
		unSet.addAll(Arrays.asList(unAutreTableau));

		// Accéder directement au troisième élément ?
		// On ne peut pas ! L'ensemble n'est pas ordonnée.

		System.out.println("Set contient 'de' : " + unSet.contains(uneListe.get(2)) + " set : " + unSet);

		unSet.add("ajout1");

		Set<String> unAutreSet = new TreeSet<String>();
		// SortedSet<String> unAutreSet = new TreeSet<String>();

		unAutreSet.add("ajout1");
		unAutreSet.add("ajout2");

		//Intersection de un Set et un Autre Set.
		System.out.println("Intersection de : " + unSet + " et unAutreSet : " + unAutreSet);
		unSet.retainAll(unAutreSet);
		System.out.println(unSet);

		unSet.add("vielle");
		System.out.println("Intersection de : " + unSet + " et une liste : " + uneListe);
		unSet.retainAll(uneListe);
		System.out.println(unSet);

		// Intéressant, Set et Liste sont différent mais tous les deux des collections !

		// unAutreSet est un SortedSet
		unAutreSet.add("ajout0");

		// unAutreSet.first(); 
		// ne fonctionne pas car unAutreSet est bien un TreeSet implémentant 
		// SortedSet pour la méthode add (polymorphisme) mais il a été typé Set,
		// qui n'a pas la méthode first. // On va devoir le recaster. 
		System.out.println("Premier élément : " + ((SortedSet<String>) unAutreSet).first()); // ajout0 même si ajouté en 3ème.

		// Pour finir les collections les Itérator.
		// List et Set implémentes Iterable, elles fournissent un Iterator.
		// la boucle foreach
		System.out.println("uneListe");
		for(String s : uneListe) {
			System.out.println(s);
		}

		System.out.println("unAutreSet");
		for(String s : unAutreSet) {
			System.out.println(s);
		}

		// Aute utilisation de l'Iterateur.
		Iterator<String> iterateur = uneListeChainee.iterator();

		// surtout pas : 
		// while (uneListeChainee.iterator().hasNext()) {} 
		// Boucle infinie car un nouvel itérator est renvoyé à chaque fois, qui reprend du début.

		while(iterateur.hasNext()) {
			String s = iterateur.next();
			System.out.println(s);
			iterateur.remove();
		}

		System.out.println("uneListeChainée : " + uneListeChainee);

		/*------------- III .Exemple de MAP --------------------------*/
		HashMap<String, Integer> lesMois = new HashMap<>();
		lesMois.put("Janvier",1);
		lesMois.put("Février",2);

		System.out.println("Le numéro du mois de Février est " + lesMois.get("Février"));







































	}
}