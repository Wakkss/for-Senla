package hangman;

import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        //String logo = "hangman.Hangman Logo"; // Логотип игры

        Random random = new Random();
        String chosenWord = Word.wordList[random.nextInt(Word.wordList.length)];
        int wordLength = chosenWord.length();

        // Testing code
        //System.out.println(logo);

        // Create blanks
        int lives = 6;
        char[] display = new char[wordLength];
        for (int i = 0; i < wordLength; i++) {
            display[i] = '_';
        }
        System.out.println(display);

        Scanner scanner = new Scanner(System.in);

        while (new String(display).contains("_")) {
            if (lives == 0) {
                System.out.println("You lose!");
                break;
            }
            System.out.print("Guess a letter: ");
            char guess = scanner.nextLine().toLowerCase().charAt(0);
            //System.out.println(logo);

            boolean correctGuess = false;
            for (int position = 0; position < wordLength; position++) {
                char letter = chosenWord.charAt(position);
                if (letter == guess) {
                    display[position] = letter;
                    correctGuess = true;
                }
            }

            if (!correctGuess) {
                lives--;
                System.out.printf("You guessed '%c', that's not in the word. You lose a life.n\n", guess);
            }
            System.out.println(display);
            System.out.println(Stages.stages[lives]);

        }

        if (!new String(display).contains("_")) {
            System.out.println("You win!");
        }

        scanner.close();
    }
}
