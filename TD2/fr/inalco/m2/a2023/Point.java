package fr.inalco.m2.a2023;

public class Point {
    // Les variables d'instance pour les coordonnées x et y
	private int x;
	private int y;

    // Constructeur pour initialiser les coordonnées du point
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // getter pour x
    public int getX() {
        return x;
    }

    // getter pour y
    public int getY() {
        return y;
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
        System.out.println("Coordonnées du point : x = " + x + ", y = " + y);
    }

    public boolean coincide(Point otherPoint) {
        return this.x == otherPoint.x && this.y == otherPoint.y;
    }

    /*
    public static void main(String[] args) {
        // Instancier trois objets Point avec des coordonnées différentes
        Point point1 = new Point(2, 3);
        Point point2 = new Point(-1, 5);
        Point point3 = new Point(0, 0);

        // Afficher les coordonnées des points
        point1.affiche();
        point2.affiche();
        point3.affiche();

        // Déplacer le premier point
        point1.deplace(1, -2);
        point2.deplace(3, 10);
        point3.deplace(4, 5);

        // Afficher les nouvelles coordonnées du premier point
        System.out.println("Après déplacement :");
        point1.affiche();
        point2.affiche();
        point3.affiche();
    }
    */
} 
