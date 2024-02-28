package fr.inalco.m2.a2023;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestCollection {
    
    public static void main(String[] args) {
        // Tableau avec les jours de la semaine
        String[] joursSemaines = {"Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche"};
        
        // Affichage de chaque jour avec une boucle for
        for (String jour : joursSemaines){
            System.out.println(jour);
        }
        
        // Création d'une collection de type ArrayList
        List<String> semaineInverse = new ArrayList<>(joursSemaines.length);
        
        // Recopie le contenu en ordre inverse dans la collection
        for(int i=joursSemaines.length-1; i >= 0; i-- ){
            semaineInverse.add(joursSemaines[i]);
        }
        
        // Affichage de la collection
        System.out.println("Collection inverse :");
        for (String jour : semaineInverse){
            System.out.println(jour);
        }
        
        // Création d'un dictionnaire avec des clés de type String et des valeurs de type Integer
        HashMap<String, Integer> semaineJourNumero = new HashMap<>();
        
        // Recopie le contenu du tableau des jours dans le dictionnaire
        int i = 1;
        for(String jour: joursSemaines){
            semaineJourNumero.put(jour, i++);
        }

        
        // Utilisation de la méthode containsKey pour vérifier la présence de "mercredi"
        String unJour = "Mercredi";
        if (semaineJourNumero.containsKey(unJour)){
            System.out.println("Dans la semaine, " + unJour + " est le jour numéro " + semaineJourNumero.get(unJour));
        }
    }
}