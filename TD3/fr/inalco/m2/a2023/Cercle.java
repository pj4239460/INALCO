package fr.inalco.m2.a2023;

/**
 * Cette classe sera composé de la classe Point.
 * Elle implémente aussi l'interface PeutSeDeplacer.
 */

public class Cercle implements PeutSeDeplacer {
	private Point centre;
	private int rayon;

	/**
	 * La constructeur de cercle va construire le centre de type Point.
	 * @param centreX coordonnée de l'abscisse 
	 * @param centreY coordonnée de l'ordonnée 
	 * @param rayon longueur du rayon 
	 */
	public Cercle (int centreX, int centreY, int rayon) {
		centre = new Point(centreX, centreY); // La création d'un cercle entraîne la création du centre.
		this.rayon = rayon;
	}

	public int getRayon(){
		return rayon;
	}

	public void setRayon(int rayon){
		this.rayon = rayon;
	}


	/**
	 * Déplacer un cercle c'est déplacer son centre. On a ici une délégation de méthode.
	 * @param dX le déplacement horizontal.
	 * @param dY le déplacement vertical.
	 */
	public void deplace(int dX, int dY) {
		centre.deplace(dX, dY);
	}

	/**
	 * @return le périmètre du cercle
	 */
	public double calculerPerimètre(){
		return (2*rayon*Math.PI);
	}

	/**
	 * @return le surface du cercle
	 */
	public double calculerSurface(){
		return (rayon*rayon*Math.PI);
	}
	/**
	 * Affiche les coordonnées du centre ainsi que la longueur du rayon.
	 */
	public void affiche() {
		System.out.println("Affichage un cercle de centre :");
		centre.affiche();
		System.out.println(" et de rayon " + rayon);
	}




}