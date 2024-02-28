package fr.inalco.m2.a2023;

public class Point3D extends Point {
	
	protected int z; // Pas besoin de redéfinir x et y car hérité de Point. z protected pour permettre l'accès directe au futur classe dérivée.
	
	Point3D(){
		//super(); // Appelle le constructeur de Point()
		// Si super(), c'est-à-dire Point() n'est pas appelé explicitement, alors super() sera appelé implicitement.		
		z=0;
		System.out.println("Constructeur Point3D()");		
	}
	
	Point3D(int x, int y, int z){
		super(x,y); // Apelle constructeur Point(x,y)
		this.z = z;
		System.out.println("Constructeur Point3D (x, y, z)");		
	}

	Point3D(int z){
		
		// Si super(x,y), c'est-à-dire Point(x,y) n'est pas appelé explicitement, super(), c'est-à-dire Point() sera appelé implicitement.
		this.z = z;
		System.out.println("Constructeur Point3D (z)");		
	}
	
	
	// anotation pour indiquer une redéfinition.
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.x +"" + "" + this.y + ""+ this.z;
		//return  super.toString() + "," + z;
	}
	@Override
	public void affiche() {
		 System.out.print("affiche de point 3D :");		
	     System.out.println("(" + super.toString() + "," + z + ")");	
	}
	
	// // @Override provoque une erreur puisque deplace à 3 arguments n'existe pas.
	// // On a une surcharge mais pas une redéfinition.
	
	public void deplace(int dX, int dY, int dZ) {
		// TODO Auto-generated method stub
		super.deplace(dX, dY);
		z += dZ;
	}
	
	/**
	 * 
	 * @return vrai si z est compris entre X et Y, faux sinon
	 */
	public boolean zComprisEntreXetY() {
		// return super.x <= z && z <= super.y; 
		// x et y etant non ambigue, on aurait pu ecrire  return x <= z && z <= y; 
		return super.getX() <= z && z <= super.getY(); 
		// si x et y sont privées. 
	}	
}