package fr.inalco.m2.a2023;

public class Point implements PeutSeDeplacer {

	private static int nbOcc = 0; // Déclaration et initialisation d'une variable de classe.
	private int x; // déclaration des attributs
	private int y; // déclaration des attributs

    public Point (int x, int y){
        this.x = x;
        this.y = y;
        nbOcc++;
    }

    // Méthode statique pour obtenir le nombre d'instances
    public static int getInstanceCount(){
        return nbOcc;
    }    

    // getter pour x
    public int getX() {
        return this.x;
    }

    // getter pour y
    public int getY() {
        return this.y;
    }

    // setter pour x
    public void setX(int x) {
        this.x = x;
    }

    // setter pour y
    public void setY(int y) {
        this.y = y;
    }

    // Méthode pour déplacer le point en ajoutant des valeurs aux coordonnées x et y
    public void deplace(int deltaX, int deltaY) {
        this.x += deltaX;
        this.y += deltaY;
    }
    // Méthode pour afficher les coordonnées du point
    public void affiche() {
        System.out.println(this + ": " + x + "," + y);
    }

    public boolean coincide(Point otherPoint) {
        return this.x == otherPoint.x && this.y == otherPoint.y;
    }

}