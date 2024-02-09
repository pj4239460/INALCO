//Encapsulation
public class Personne {
    private String nom; // Attribut privé, non accessible de l'extérieur
    private int age; // Attribut privé, non accessible de l'extérieur

    // Constructeur
    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    // Getter pour nom
    public String getNom() {
        return nom;
    }

    // Setter pour nom
    public void setNom(String nom) {
        this.nom = nom;
    }

    // Getter pour age
    public int getAge() {
        return age;
    }

    // Setter pour age
    public void setAge(int age) {
        this.age = age;
    }
}
