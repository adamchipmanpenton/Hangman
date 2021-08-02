import java.security.PublicKey;
import java.util.Scanner;

public class PlayHangman {


    public static void main(String[] args) {
        Hangman playHangMan = new Hangman();
        Scanner sc = new Scanner(System.in);
        String letterGuess;
        int level;

        System.out.println("Let's play Hangman");
        System.out.println("Select level 1, 2, or 3: ");
        level = sc.nextInt();
        playHangMan.setLevel(level);

        playHangMan.findHangManWord();
        System.out.println();
        System.out.println(playHangMan.getHangManWord() + "  test ");
        playHangMan.makeNewWord();

        while (playHangMan.getTimesGuessedWrong() < 7) {
            System.out.println("Guess letter: ");
            letterGuess = sc.next();
            playHangMan.setGuessLetter(letterGuess);
            playHangMan.findGuss();
            playHangMan.winOrLoss();
            System.out.println("------------------------");
        };
    }
}
