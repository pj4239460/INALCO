package fr.inalco.m2.a2023;
import fr.inalco.m2.a2023.Point;

//pour compiler: javac fr/inalco/m2/a2023/*.java
//ensuite exécuter: java fr.inalco.m2.a2023.TestPoint

public class TestPoint {

  /* Cette méthode est le point d'entrée d'un programme lancé depuis la console */
  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Point p1 = new Point (2, 4);
    System.out.println("Nombre d'instances de Point:"+Point.getInstanceCount());
    p1.affiche();
    p1.deplace(2, 3);
    p1.affiche();

    Point p2 = new Point (3, 5);
    System.out.println("Nombre d'instances de Point:"+Point.getInstanceCount());
    p2.affiche();
    p2.deplace(1,4);
    p2.affiche();

    Point p3 = new Point (2, 6);
    System.out.println("Nombre d'instances de Point:"+Point.getInstanceCount());
    p3.affiche();

    //System.out.println("x : " + p3.x);
    /* L'attribut x ayant été déclaré privé dans la classe Point, l'accès directe est signalé par une erreur à la compilation.
    */

    Point p4 = new Point (1,6);
    System.out.println("Nombre d'instances de Point:"+Point.getInstanceCount());

    System.out.println("p3,x : " + p3.getX());
    p3.setX(1);
    System.out.println("p3,x : " + p3.getX());
    System.out.println("p3 et p4 coincident-ils ? " + p3.coincide(p4));
    System.out.println("p4 et p3 coincident-ils ? " + p4.coincide(p3));
    System.out.println("p1 et p3 coincident-ils ? " + p1.coincide(p3));

  }
}
