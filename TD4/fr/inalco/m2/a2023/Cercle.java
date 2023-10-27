package fr.inalco.m2.a2023;

/**
 * Cette classe sera composé de la classe Point.
 * Elle implémente aussi l'interface PeutSeDeplacer.
 */

public class Cercle implements PeutSeDeplacer {
	private Point centre; // attribut privé pour respecter le principe d'encapsulation.
	private int rayon;

	/**
	 * La constructeur de cercle va construire le centre de type Point.
	 * @param centreX coordonnée de l'abscisse en unité du plan
	 * @param centreY coordonnée de l'ordonnée en unité du plan
	 * @param rayon longueur du rayon en unité du plan
	 */
	public Cercle (int centreX, int centreY, int rayon) {
		System.out.println("Constructeur Cercle(x,y,r)");
		centre = new Point(centreX, centreY); // La création d'un cercle entraîne la création du centre.
		this.rayon = rayon;
	}

	/* Pas de getter et setter pour la classe Centre sinon vous donnez à une autre classe la possibilité
	 * d'accéder au centre et d'en empêcher sa destruction lorsque un objet cercle sera détruit.
	 */

	/*
	public Point getCentre() {
		return centre;
	}

	public void setCentre(Point centre) {
		this.centre = centre;
	}
	
	*/

	/**
	 * 
	 * @return
	 */
	public int getRayon(){
		return rayon;
	}

	/**
	 * 
	 * @param rayon
	 */
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
		// Math.PI renvoi un double, il faut donc s'aligner sur double
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
		// On verra une autre manière de faire. 
		System.out.println("affiche cercle : " + centre.toString() + " et de rayon " + rayon);
	}




}