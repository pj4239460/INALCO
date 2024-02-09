//Héritage
//classe enfant
public class Voiture extends Vehicule {
    private String modele = "Mustang"; // Modèle de la voiture

    public static void main(String[] args) {
        Voiture maVoiture = new Voiture();

        maVoiture.klaxonner();

        System.out.println(maVoiture.marque + " " + maVoiture.modele);
    }
}
