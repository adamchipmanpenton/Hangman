import java.util.Scanner;


public class Hangman {




    public String getHangManWord() {
        return hangManWord;
    }

    public String getGuessLetter() {
        return guessLetter;
    }

    public void setGuessLetter(String guessLetter) {
        this.guessLetter = guessLetter;
    }

    public String getShowHangMan() {
        return showHangMan;
    }

    public void setShowHangMan(String showHangMan) {
        this.showHangMan = showHangMan;
    }

    public String getWrongGuess() {
        return wrongGuess;
    }

    public void setWrongGuess(String wrongGuess) {
        this.wrongGuess = wrongGuess;
    }

    public String getRightGuess() {
        return rightGuess;
    }

    public void setRightGuess(String rightGuess) {
        this.rightGuess = rightGuess;
    }

    private String[] hangManWordBank = {"pizza", "hamburgers", "sandwich", "hotdogs", "spaghetti", "taco" };
    private String hangManWord = hangManWordBank[(int) (Math.random() * hangManWordBank.length)];
    private String guessLetter;
    private String showHangMan;
    private int timesGuessedWrong;
    private String rightGuess = "";
    private String wrongGuess = "";
    private String rightCounter;


    public void findGuss(){
//        wrongGuess ="";
//        rightGuess = "";
        rightCounter = "true";

        for(int i=0; i < hangManWord.length(); i++){
            if(hangManWord.charAt(i) == guessLetter.charAt(0)){
                System.out.println("You guessed right: " + hangManWord.charAt(i));
                rightGuess += guessLetter;
                System.out.println("Right gusses: " + rightGuess);
                rightCounter = "false";
            }

        }if(rightGuess.length() == hangManWord.length()){
            System.out.println("You guess win!!!!");
        }else if (rightCounter == "true"){
            wrongGuess += guessLetter;
            timesGuessedWrong += 1;
            System.out.println("Wrong guesses: " + wrongGuess);
            displayHangMan();

        }else{
            rightCounter = "true";
        }



    }


    public void displayHangMan(){

        if (timesGuessedWrong == 1) {
            System.out.println("Wrong guess, try again");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("___|___");
            System.out.println();
        }
        if (timesGuessedWrong == 2) {
            System.out.println("Wrong guess, try again");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (timesGuessedWrong == 3) {
            System.out.println("Wrong guess, try again");
            System.out.println("   ____________");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   | ");
            System.out.println("___|___");
        }
        if (timesGuessedWrong == 4) {
            System.out.println("Wrong guess, try again");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (timesGuessedWrong == 5) {
            System.out.println("Wrong guess, try again");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |           |");
            System.out.println("   |           |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (timesGuessedWrong == 6) {
            System.out.println("Wrong guess, try again");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |           |");
            System.out.println("   |           |");
            System.out.println("   |          / \\ ");
            System.out.println("___|___      /   \\");
        }
        if (timesGuessedWrong == 7) {
            System.out.println("GAME OVER!");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |          _|_");
            System.out.println("   |         / | \\");
            System.out.println("   |          / \\ ");
            System.out.println("___|___      /   \\");
            System.out.println("GAME OVER! The word was " + hangManWord);
        }
    }
}
