package converter;

import java.util.Scanner;

public class Valute {
    // Обменные курсы относительно USD
    private static final double EUR_TO_USD = 1.1; // 1 EUR = 1.1 USD
    private static final double GBP_TO_USD = 1.3; // 1 GBP = 1.3 USD
    private static final double RUB_TO_USD = 0.013; // 1 RUB = 0.013 USD
    private static final double JPY_TO_USD = 0.009; // 1 JPY = 0.009 USD

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму в USD: ");
        double amountInUSD = scanner.nextDouble();

        System.out.printf("Сумма в EUR: %.2f%n", convertToEUR(amountInUSD));
        System.out.printf("Сумма в GBP: %.2f%n", convertToGBP(amountInUSD));
        System.out.printf("Сумма в RUB: %.2f%n", convertToRUB(amountInUSD));
        System.out.printf("Сумма в JPY: %.2f%n", convertToJPY(amountInUSD));

        scanner.close();
    }

    public static double convertToEUR(double amountInUSD) {
        return amountInUSD / EUR_TO_USD;
    }

    public static double convertToGBP(double amountInUSD) {
        return amountInUSD / GBP_TO_USD;
    }

    public static double convertToRUB(double amountInUSD) {
        return amountInUSD / RUB_TO_USD;
    }

    public static double convertToJPY(double amountInUSD) {
        return amountInUSD / JPY_TO_USD;
    }
}
