package fr.inalco.m2.a2023;

import java.util.ArrayList;

    /**
     * Classe permettant de tester la classe Point et le Cercle.
     * @see Point
     */

public class TestPoint {

    /**
    * @param unObjet pouvant se déplacer.
    * @param dX déplacement sur l'axe des abscises
    * @param dY déplacement sur l'axe des ordonnées
    */

    public static void deplaceObjet(PeutSeDeplacer unObjet, int dX, int dY) {
        unObjet.deplace(dX, dY);
    }

    /**
    *  Cette méthode est le point d'entrée d'un programme lancé depuis la
    * console
    * @param args paramètre passé en ligne de commande.
    */

    public static void main(String[] args) {
    // TODO Auto-generated method stub

        Point p1 = new Point (2, 4); // Affichera constructeur de Point(x,y)
        p1.affiche(); // Je suis un point : (2, 4)
        p1.deplace(2, 3);
        p1.affiche(); // Je suis un point : (4, 7)


        Point p2 = new Point (3, 5); // Idem modulo la valeur des paramètres.
        p2.affiche();
        p2.deplace(1,4);
        p2.affiche();

        Point p3 = new Point (1, 6);
        p3.affiche("p3");

        System.out.println("x : " + p3.x);
        /* L'attribut x ayant été déclaré protected dans la classe Point, l'accès est possible 
        * pour toutes les classes du package et les classes dérivées même si ces dernières n'appartiennent pas au même package ...
        */

        Point p4 = new Point (1,6);
        p4.affiche("p4");

        System.out.println("x : " + p3.getX());
        System.out.println("p3 et p4 coincident-ils ? " + p3.coincide(p4));
        System.out.println("p4 et p3 coincident-ils ? " + p4.coincide(p3));
        System.out.println("p1 et p3 coincident-ils ? " + p1.coincide(p3));
        System.out.println("Nb Points créés : " + Point.getNombreOccurence());

        TestPoint.deplaceObjet(p4, 3, 7);
        p4.affiche("p4");

        Cercle c1 = new Cercle(6,8,5);   // construction d'un objet cercle, un objet point sera construit 
                                    // mais inacessible depuis l'extérieur.
        c1.affiche();
        c1.deplace(3, 3);
        c1.affiche();
    
        System.out.println("Son périmètre vaut : " + c1.calculerPerimètre());
        System.out.println("Sa surface vaut : " + c1.calculerSurface());
        Point3D pc3d = new Point3D(); // Appelle constructeur Point3D qui appelle constructeur Point()
        pc3d.affiche();
   
        Point unPoint3d = new Point3D(3,5, 2); // Appelle constructeur Point3D (x,y,z) qui appelle constructeur Point(x,y)
        unPoint3d.affiche();
   
        Point unAutrePoint3d = new Point3D(2); // Appelle constructeur Point3D (z) qui appelle constructeur Point() par défaut
        unAutrePoint3d.affiche();   

        System.out.println("un point3D coïncide avec un point : " + unPoint3d.coincide(p2));
        System.out.println("un point coïncide avec un point3d : " + p2.coincide(unPoint3d));
   
        unPoint3d.deplace(1, 4);
        unPoint3d.affiche();

        // unPoint3d.deplace(1, 4,5);
        // Ne peut pas fonctionner car deplace(int dX, int dY, int dZ) n'est pas une méthode d'un point.
        // Étant donné que unPoint3d est déclaré comme un type Point, il peut seulement appeler les méthodes définies ou redéfinies dans la classe Point. Par conséquent, vous pouvez appeler unPoint3d.deplace(1, 4); car cette méthode est définie dans la classe Point. Cependant, unPoint3d.deplace(1, 4, 5); ne peut pas être appelée car il n'y a pas de méthode deplace dans la classe Point qui accepte trois paramètres.
        // Pour appeler la méthode deplace à trois paramètres de Point3D, vous devez faire un casting explicite de unPoint3d en type Point3D (en supposant que vous êtes sûr que unPoint3d est réellement un objet Point3D), par exemple :
        // if (unPoint3d instanceof Point3D) {
        //     ((Point3D) unPoint3d).deplace(1, 4, 5);
        // }
        // Ce code vérifie d'abord si unPoint3d est vraiment une instance de Point3D, puis le convertit en type Point3D, ce qui vous permet d'appeler la méthode spécifique à trois paramètres deplace de Point3D.

        System.out.println("un point3D coïncide avec un point : " + unPoint3d.coincide(p2));
        System.out.println("un point coïncide avec un point3d : " + p2.coincide(unPoint3d));
   
        System.out.println("un point3D coïncide avec un point : " + pc3d.coincide(p2));
        // peut fonctionner car coincide est une méthode d'un point. Point3D est un point aussi.

        System.out.println("Z est-il compris entre x et y ? " + pc3d.zComprisEntreXetY()); 
        //System.out.println("Z est-il compris entre x et y ? " + unPoint3d.zComprisEntreXetY()); 
        // Ne peut pas fonctionner car zComprisEntreXetY n'est pas une méthode d'un point.

        ArrayList<Point> monPlan = new ArrayList<Point> ();
   
        monPlan.add(unPoint3d);
        monPlan.add(p1);
        monPlan.add(p4);
   
    }

}