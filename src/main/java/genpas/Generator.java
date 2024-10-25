package genpas;

import java.util.Random;
import java.util.Scanner;

public class Generator {
    //рандомный индекс
    public static int ranIndex(char[] res, int l) {
        int index = (int)(Math.random() * l);
        while (res[index] != '\u0000') {
            index = (int)(Math.random() * l);
        }
        return index;
    }
    //рандомная маленькая буква
    public static char[] lower(char[] res, int l) {
        char[] letters1 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int x = ranIndex(res, l);
        Random random = new Random();
        res[x] = letters1[random.nextInt(letters1.length)];
        return res;
    }

    //рандомная большая буква
    public static char[] upp(char[] res, int l) {
        char[] letters2 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        int x = ranIndex(res, l);
        Random random = new Random();
        res[x] = letters2[random.nextInt(letters2.length)];
        return res;
    }

    //рандомная цифры
    public static char[] num(char[] res, int l) {
        char[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        int x = ranIndex(res, l);
        Random random = new Random();
        res[x] = numbers[random.nextInt(numbers.length)];
        return res;
    }

    //рандомный символ
    public static char[] sym(char[] res, int l) {
        char[] symbols = {'!', '#', '$', '%', '&', '(', ')', '*', '+'};
        int x = ranIndex(res, l);
        Random random = new Random();
        res[x] = symbols[random.nextInt(symbols.length)];
        return res;
    }
    public static String ins(int l) {
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
                '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                '!', '#', '$', '%', '&', '(', ')', '*', '+'};
        Random random = new Random();

        char[] str = new char[l];
        lower(str, l);
        upp(str, l);
        num(str, l);
        sym(str, l);
        for (int i = 0; i < l; i++) {
            if (str[i] == '\u0000')
                str[i] = letters[random.nextInt(letters.length)];
        }
        return new String(str);
    }
}