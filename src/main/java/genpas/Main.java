package genpas;
import java.lang.String;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the length of the desired password from 8 to 12 characters: ");
        Scanner con = new Scanner(System.in);
        if (con.hasNextInt()) {
            int len = con.nextInt();
            con.close();
            if (len >= 8 && len <= 12)
                System.out.println("Your password is: " + Generator.ins(len));
            else
                System.out.println("You entered an incorrect password length!");
        }
        else {
            con.close();
            System.out.println("You didn't enter a number");
        }
    }
}