package fr.inalco.m2.a2023;

/**
 * Cette classe permet de représenter les points à deux dimensions
 */

public class Point implements PeutSeDeplacer {

	private static int nbOcc = 0; // Déclaration et initialisation d'une variable de classe.
	/* Les attribut x et y seront privés à la classe c’est-à-dire uniquement visible par les méthodes de la classe.*/
    protected int x; // déclaration des attributs
	protected int y; // déclaration des attributs

    // Un autre constructeur avec deux arguments
    /**
     * @param xVal coordonnée sur l'axe des abscises.
     * @param y coordonnée sur l'axe des orfonnées.
     */

    public Point (int xVal, int y) {
        nbOcc++; // On accède à l'attribut de classe. ! this.nbOcc interdit !
        // Une méthode non static peut accéder à un attribut déclaré static.


        x = xVal; // xVal ne masquant pas x, l'emploi de this n'est pas obligatoire
        this.y = y; // Dans ce cas this est obligatoire car le y passé en argument de la méthode masque l'attribut y.
        System.out.println("Constructeur Point(x,y)");

    }

    /* Déclaration d'un constructeur qui ne prend pas d'arguments
        et qui n'itialise pas les attributs.
        Si on fournit un tel constructeur, on peut y mettre des valeurs par défaut
        et fournir des getters et des setters pour utiliser cette classe.
    Si on procède ainsi on casse un peu le principe d'encapsulation car on expose la structure interne du point alors que ce n'est pas nécessaire.
    */
    public Point() {
        nbOcc++; // Ne pas oublier pour chaque constructeur.
        x = 0;
        y = 0;
        System.out.println("Constructeur Point()");
    }

    /**
     * Cette méthode static renvoi le nombre d'occurence de Point créé.
     * @return le nombre de Point créé dans le programme.
     */
    public static int getNombreOccurence() {
        return nbOcc; // C'est le seul attribut que cette méthode peut manipuler.
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

    @Override
    public String toString() {
        System.out.println("Point.toString()");     
        String s = new String(x + ", " + y);
        return s;
        //return this.x + ", " + this.y;
    
    }

    // Méthode pour afficher les coordonnées du point
    public void affiche() {
        System.out.print("Affiche point : ");
        System.out.println("(" + this.x + ", " + this.y + ")");
        // System.out.println("Affiche point : " + toString());
    }

    /**
     *  Surcharge de affichage pour afficher le nom de la variable qui enregistre * la référence de l'objet
     * @param nomReference le nom de la variable
     */

    public void affiche(String nomReference) {
        System.out.println(nomReference + " : " + this + ": " + this.x + "," + this.y);
    }

    /**
     * Cette méthode a pour but de démontrer que l'encapsulation est au niveau de
     * la classe et non de l'objet.
     * @param p2 point dont on veut comparer à this
     * @return vrai p2 coïncident avec this, faux p2 et this ne coïncident pas.
     */
    public boolean coincide (Point p2) {
        /* Les attributs x et y de p2 sont directement accédé par la méthode coincide appliqué sur l'objet courant.
        */

        // l'écriture la plus compacte.
        return (x == p2.x && y == p2.y);
        // Si on veut éviter toute ambiguïté.
        //return ((x == p2.x) && (y == p2.y));

        // Avec utilisation du if.
        /*
            if (x == p2.x && y == p2.y) {
                return true;
            } else {
                return false;
            }
        */

        // Utilisation de l'opérateur ternaire
        // Pas très utile puisque l'expression à évaluer et identique aux valeurs de retour de l'opérateur ternaire.
        //return (x == p2.x && y == p2.y) ? true : false;

    }

}