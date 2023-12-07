import java.util.Arrays;
public class StringExe {
    public static void main(String[] args) {
        char[] scores = new char[] { '8', '7', '5', '6' }; 
        Score s = new Score(scores);
        s.printScores();
        scores[2] = '9'; 
        s.printScores();
    }
}


class Score {
    private char[] scores;
    public Score(char[] scores) {
        // this.scores = scores; 
        this.scores = Arrays.copyOf(scores, scores.length); // Créer une copie du tableau
    }

    // Dans ce code java, la classe Score utilise directement la référence au tableau char[] passé
    // à son constructeur. Par conséquent, toute modification du tableau scores dans la méthode main
    // affecte également Score, car ils partagent la même référence. Ainsi, après une modification dans main,
    // ce qui peut poser problème si le code externe est non fiable.

    public void printScores() {
        System.out.println(Arrays.toString(scores));
    }
}