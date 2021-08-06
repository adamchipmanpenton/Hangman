import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Hangman {

    public void setLevel(int level) {
        this.level = level;
    }
    public String getHangManWord() {
        return hangManWord;
    }
    public void setGuessLetter(String guessLetter) {
        this.guessLetter = guessLetter;
    }
    public int getTimesGuessedWrong() {
        return timesGuessedWrong;
    }
    public int getTimesGuessedRight() {
        return timesGuessedRight;
    }

    private String hangManWordBank[] = new String[100];
    private String hangManWord = "";
    private String guessLetter;
    private int timesGuessedWrong;
    private String wrongGuess = "";
    private boolean rightCounter;
    private int level;
    private int timesGuessedRight;
    private String findWord[] =new String[10];

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
            } while (hangManWord.length() >= 4 || hangManWord.length() == 0);
        } else if (level == 2) {
            do {
                hangManWord = hangManWordBank[(int) (Math.random() * hangManWordBank.length)];
            } while (hangManWord.length() <4  || hangManWord.length() > 8);
        } else if (level == 3) {
            do {
                hangManWord = hangManWordBank[(int) (Math.random() * hangManWordBank.length)];
            } while (hangManWord.length() <= 8);
        }
        deleteWord();
    }

    public void deleteWord(){
        for(int i=0; i<100; i++){
            if(hangManWord.equals(hangManWordBank[i])){
                hangManWordBank[i] = "";
            }
        }
    }

    public void makeNewWord(){
        for(int i=0; i<hangManWord.length(); i++){
            findWord[i] = "_";
        }
        printHangManWord();
    }

    public void addNewLetter(int i){
        findWord[i] = guessLetter.toUpperCase();
        printHangManWord();
    }

    public void printHangManWord(){
        System.out.print("Word to find: ");
        for(int i=0; i<hangManWord.length(); i++){
            System.out.print(findWord[i]);
        }
        System.out.println();
    }

    public void findIfGuessRight(){
        if (rightCounter){
            wrongGuess += guessLetter.toUpperCase();
            timesGuessedWrong += 1;
            System.out.println("Wrong guess!!!!");
            System.out.println("Wrong guesses: " + wrongGuess);
            printHangManWord();
            displayHangMan();
        }
    }

    public void findGuss(){
        rightCounter = true;
        for(int i=0; i < hangManWord.length(); i++){
            if(hangManWord.charAt(i) == guessLetter.charAt(0)){
                System.out.println("You guessed right!!!!");
                timesGuessedRight += 1;
                System.out.println("Wrong guesses: " + wrongGuess);
                rightCounter = false;
                addNewLetter(i);
                displayHangMan();
            }
        }
    }

    public void restartGame(){
        wrongGuess="";
        timesGuessedRight=0;
        timesGuessedWrong=0;
    }

    public void displayHangMan(){
        if (timesGuessedWrong == 1) {
            System.out.println("   _____________");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (timesGuessedWrong == 2) {
            System.out.println("   _____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /. .\\");
            System.out.println("   |        |  __ |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (timesGuessedWrong == 3) {
            System.out.println("   _____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /. .\\");
            System.out.println("   |        |  __ |");
            System.out.println("   |         \\___/");
            System.out.println("   |           |");
            System.out.println("   |           |");
            System.out.println("   |           |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (timesGuessedWrong == 4) {
            System.out.println("   _____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /. .\\");
            System.out.println("   |        |  __ |");
            System.out.println("   |         \\___/");
            System.out.println("   |           |");
            System.out.println("   |           |");
            System.out.println("   |           |");
            System.out.println("   |          / \\");
            System.out.println("   |         /   \\");
            System.out.println("___|___");
        }
        if (timesGuessedWrong == 5) {
            System.out.println("   _____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /. .\\");
            System.out.println("   |        |  __ |");
            System.out.println("   |         \\___/");
            System.out.println("   |          _|_");
            System.out.println("   |         / | \\");
            System.out.println("   |           |");
            System.out.println("   |          / \\");
            System.out.println("   |         /   \\");
            System.out.println("___|___");
        }
        if (timesGuessedWrong == 6) {
            System.out.println("   _____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /* *\\");
            System.out.println("   |        |  0  |");
            System.out.println("   |         \\___/");
            System.out.println("   |          _|_");
            System.out.println("   |         / | \\");
            System.out.println("   |           |");
            System.out.println("   |          / \\");
            System.out.println("   |         /   \\");
            System.out.println("___|___");
            System.out.println("GAME OVER! The word was " + hangManWord);
        }
    }
}
