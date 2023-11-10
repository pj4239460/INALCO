package fr.inalco.m2.a2023;

public class PointTab implements PeutSeDeplacer{
    // Les variables d'instance pour les coordonnées x et y
    private static final short X = 0;
    private static final short Y = 1;
    private static int instanceCount = 0;

    int[] tab; // déclaration un tableau

    // Constructeur pour initialiser les coordonnées du point
    public PointTab (int x, int y){
        this.tab = new int[2];
        this.tab[X] = x;
        this.tab[Y] = y;
        instanceCount++;
    }

    // Méthode statique pour obtenir le nombre d'instances
    public static int getInstanceCount(){
        return instanceCount;
    }

    // getter pour x
    public int getX() {
        return this.tab[X];
    }

    // getter pour y
    public int getY() {
        return this.tab[Y];
    }

    // setter pour x
    public void setX(int x) {
        this.tab[X] = x;
    }

    // setter pour y
    public void setY(int y) {
        this.tab[Y] = y;
    }

    // Méthode pour déplacer le point en ajoutant des valeurs aux coordonnées x et y
    public void deplace(int deltaX, int deltaY) {
        this.tab[X] += deltaX;
        this.tab[Y] += deltaY;
    }

    // Méthode pour afficher les coordonnées du point
    public void affiche() {
        System.out.println(this + ": " + tab[X] + "," + tab[Y]);
    }

    public boolean coincide(PointTab otherPoint) {
        return this.tab[X] == otherPoint.tab[X] && this.tab[Y] == otherPoint.tab[Y];
    }


}