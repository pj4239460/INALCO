package fr.inalco.m2.a2023;

public class TestPoint {
    /**
     * @param unObjet pouvant se déplacer.
     * @param dX déplacement sur l'axe des abscises
     * @param dY déplacement sur l'axe des ordonnées
     */

    public static void deplaceObjet(PeutSeDeplacer unObjet, int dX, int dY){
        unObjet.deplace(dX, dY);
    }

    /* Cette méthode est le point d'entrée d'un programme lancé depuis la console */
    public static void main(String[] args) {

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
        Point unPoint3d = new Point3D(3,5, 2); // Appelle constructeur Point3D (x,y,z) qui appelle constructeur Point(x,y)
        unPoint3d.affiche();

       Point unAutrePoint3d = new Point3D(2); // Appelle constructeur Point3D (z) qui appelle constructeur Point() par défaut
       unAutrePoint3d.affiche(); 

       System.out.println("un point3D coïncide avec un point : " + unPoint3d.coincide(p2));
       System.out.println("un point coïncide avec un point3d : " + p2.coincide(unPoint3d));
       
       unPoint3d.deplace(1, 4);
       
       System.out.println("un point3D coïncide avec un point : " + unPoint3d.coincide(p2));
       System.out.println("un point coïncide avec un point3d : " + p2.coincide(unPoint3d));

       System.out.println("Z est-il compris entre x et y ? " + unPoint3d.zComprisEntreXetY()); 

    }

}