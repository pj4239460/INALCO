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

  	PointTab p1 = new PointTab (3,5);
  	PointTab p2 = new PointTab (3,5);

  	p1.affiche();
  	p2.affiche();

  	System.out.println("P1 cooincide-t-il avec P2:"+p1.coincide(p2));

  	TestPoint.deplaceObjet(p1, 2, 4);
  	p1.affiche();
  	p2.affiche();
  	System.out.println("P1 cooincide-t-il avec P2:"+p1.coincide(p2));

    Cercle c1 = new Cercle(6, 8, 5);
    
    c1.affiche();
    c1.deplace(3,3);
    c1.affiche();

    System.out.println("Son périmètre vaut : " + c1.calculerPerimètre());
    System.out.println("Sa surface vaut : " + c1.calculerSurface());
  }



}