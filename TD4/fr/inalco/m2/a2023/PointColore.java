package fr.inalco.m2.a2023;


public final class PointColore extends Point {
  
	protected String couleur;
		
	PointColore(){
		System.out.println("Constructeur PointColore");
	}
	
	PointColore(int valX, int valY, String uneCouleur){
		super(valX, valY); // apple le constructeur de la classe Parent.
		
		couleur = uneCouleur;
		System.out.println("appel de Constructeur de PointColore(x,y,couleur)");
	}
}
