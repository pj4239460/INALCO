import java.util.Scanner;

public class Riddle {
	private Scanner scanner;

	public Riddle(Scanner scanner) {
		this.scanner = scanner;
	}

	public void presentRiddle() {
        System.out.println("Voici une énigme amusante pour vous :");
        System.out.println("Qu'est-ce qui est plus grand que la Tour Eiffel, mais infiniment moins lourd ?");
        System.out.println("1. Sa peinture");
        System.out.println("2. Son ombre");
        System.out.println("3. La lumière");
        System.out.println("4. Un nuage");

        System.out.println("Votre réponse (1-4) : ");
        int answer = scanner.nextInt();

        if (answer == 2) {
        	System.out.println("Correct! L'ombre de la Tour Eiffel est plus grande que la tour elle-même, mais elle ne pèse rien.");
        } else {
        	System.out.println("Incorrect. Essayez encore la prochaine fois !");
        }
	}
}