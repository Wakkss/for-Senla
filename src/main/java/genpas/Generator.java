package genpas;

import java.util.Random;
import java.util.Scanner;

public class Generator {
    public static void main(String[] args) {
        String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",
                "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
                "!", "#", "$", "%", "&", "(", ")", "*", "+"};
        Random random = new Random();
        System.out.print("Enter the length of the desired password from 8 to 12 characters: ");
        Scanner con = new Scanner(System.in);
        int len = con.nextInt();
        if (len >= 8 && len <= 12) {
            System.out.print("Your password is: ");
            for (int i = 0; i < len; i++) {
                System.out.print(letters[random.nextInt(letters.length)]);
            }
        }
        else
            System.out.println("You entered an incorrect password length");
    }
}