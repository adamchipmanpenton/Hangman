import java.security.PublicKey;
import java.util.Scanner;

public class PlayHangman {


    public static void main(String[] args) {
        Hangman playHangMan = new Hangman();
        Scanner sc = new Scanner(System.in);
        String letterGuess = "";


        System.out.println("Guess letter: ");
        letterGuess = sc.next();
        playHangMan.setGuessLetter(letterGuess);

        System.out.println(playHangMan.getHangManWord() + "  test " + playHangMan.getGuessLetter());

        playHangMan.displayHangMan();
        playHangMan.findGuss();

    }


}
