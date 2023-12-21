public class User {
	protected String name;
	// Un membre protected peut être accédé par les classes du même 
	// package ainsi par toutes les sous-classes de la classe où
	// il est déclaré

	public User(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}
}