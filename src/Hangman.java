import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Hangman {

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String[] getHangManWordBank() {
        return hangManWordBank;
    }

    public void setHangManWordBank(String[] hangManWordBank) {
        this.hangManWordBank = hangManWordBank;
    }

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

    public int getTimesGuessedWrong() {
        return timesGuessedWrong;
    }

    public void setTimesGuessedWrong(int timesGuessedWrong) {
        this.timesGuessedWrong = timesGuessedWrong;
    }

    private String hangManWordBank[] = new String[5];
    private String hangManWord;
    private String guessLetter;
    private String showHangMan;
    private int timesGuessedWrong;
    private String rightGuess = "";
    private String wrongGuess = "";
    private boolean rightCounter;
    private String findWord ="";
    private int level;
    private int timesGuessedRight;

    public void findHangManWord() {
        try {
            File myObj = new File("Word_list.txt");
            Scanner myReader = new Scanner(myObj);
            int i = 0;
            while (myReader.hasNext()) {
                String data = myReader.next();
                hangManWordBank[i] = data;
                i += 1;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        if (level == 1) {
            do {
                hangManWord = hangManWordBank[(int) (Math.random() * hangManWordBank.length)];
            } while (hangManWord.length() >= 4);
        } else if (level == 2) {
            do {
                hangManWord = hangManWordBank[(int) (Math.random() * hangManWordBank.length)];
            } while (hangManWord.length() < 4 || hangManWord.length()  > 8);
        } else if (level == 3) {
            do {
                hangManWord = hangManWordBank[(int) (Math.random() * hangManWordBank.length)];
            } while (hangManWord.length() <= 8);
        }
    }

    public void makeNewWord(){
        for(int i=0; i<hangManWord.length(); i++){
            findWord += "_";
        }
        System.out.println(findWord);
    }

    public void winOrLoss(){
        if(timesGuessedRight == hangManWord.length()){
            System.out.println("You guess win!!!!");
        }else if (rightCounter == true){
            wrongGuess += guessLetter;
            timesGuessedWrong += 1;
            System.out.println("Wrong guess!!!!");
            System.out.println("Wrong guesses: " + wrongGuess);
            System.out.println("Right guesses: " + rightGuess);
            displayHangMan();
        }
    }

    public void findGuss(){
        rightCounter = true;
        for(int i=0; i < hangManWord.length(); i++){
            if(hangManWord.charAt(i) == guessLetter.charAt(0)){
                System.out.println("You guessed right!!!!");
                rightGuess += guessLetter;
                timesGuessedRight += 1;
                System.out.println("Wrong guesses: " + wrongGuess);
                System.out.println("Right guesses: " + rightGuess);
                rightCounter = false;
                System.out.println(findWord);
                displayHangMan();
            }
        }
    }

    public void displayHangMan(){

        if (timesGuessedWrong == 1) {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("___|___");
            System.out.println();
        }
        if (timesGuessedWrong == 2) {
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
