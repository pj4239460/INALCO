enum Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
}

public class Test {
    Day day;

    // Constructeur, accepte un élément de l'énumération Day comme paramètre
    public Test(Day day) {
        this.day = day;
    }

    // Affiche un message différent en fonction de la valeur actuelle de day
    public void tellItLikeItIs() {
        switch (day) {
            case MONDAY:
                System.out.println("Les lundis sont mauvais.");
                break;
            
            case FRIDAY:
                System.out.println("Les vendredis sont meilleurs.");
                break;
                
            case SATURDAY: case SUNDAY:
                System.out.println("Les week-ends sont les meilleurs.");
                break;
                
            default:
                System.out.println("Les jours de milieu de semaine sont moyens.");
                break;
        }
    }

    // Point d'entrée principal du programme
    public static void main(String[] args) {
        Test firstDay = new Test(Day.MONDAY);
        firstDay.tellItLikeItIs();
        Test thirdDay = new Test(Day.WEDNESDAY);
        thirdDay.tellItLikeItIs();
        Test fifthDay = new Test(Day.FRIDAY);
        fifthDay.tellItLikeItIs();
        Test sixthDay = new Test(Day.SATURDAY);
        sixthDay.tellItLikeItIs();
        Test seventhDay = new Test(Day.SUNDAY);
        seventhDay.tellItLikeItIs();

        // Utiliser la méthode toString()
        System.out.println("Exemple de méthode toString() : " + Day.MONDAY.toString());

        // Utiliser la méthode valueOf(String)
        Day day_new = Day.valueOf("SUNDAY");
        System.out.println("Exemple de méthode valueOf() : " + day_new);
        // Utiliser la méthode values()
        System.out.println("Exemple de méthode values() :");
        for (Day d : Day.values()) {
            System.out.println(d);
        }

        // Utiliser la méthode ordinal()
        System.out.println("Exemple de méthode ordinal() : " + Day.FRIDAY.ordinal());
    }
}