import java.util.Scanner;

public class PlayHangman {

    public static void main(String[] args) {
        Hangman playHangMan = new Hangman();
        Scanner sc = new Scanner(System.in);
        String letterGuess;
        String playAgain;

        System.out.println("Let's play Hangman");
         do{
            System.out.println("Select level 1, 2, or 3: ");
            playHangMan.setLevel(sc.nextInt());
            playHangMan.findHangManWord();
            System.out.println();
            //System.out.println(playHangMan.getHangManWord() + "  test ");
            playHangMan.makeNewWord();
            while (playHangMan.getTimesGuessedWrong() < 6) {
                System.out.println("Guess letter: ");
                letterGuess = sc.next().toLowerCase();
                playHangMan.setGuessLetter(letterGuess);
                playHangMan.findGuss();
                playHangMan.findIfGuessRight();
                System.out.println("----------------------------------");
                if(playHangMan.getTimesGuessedRight() == playHangMan.getHangManWord().length()) {
                    System.out.println("You guess win!!!!");
                    break;
                }
            }
        playHangMan.restartGame();
        System.out.println("Type y if you wish to play again.");
        playAgain = sc.next();
        }while(playAgain.equals("y"));
        System.out.println("Good bye.");
    }
}
