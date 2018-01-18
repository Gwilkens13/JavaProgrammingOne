package Chapter6;

import java.util.Scanner;

/**
 * Write a program that can convert one currency amount to another.
 *
 * @author Gavin Wilkens
 */
public class P6 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//Ask for rate ammounts.
        System.out.print("How many Euros will a dollar buy? ");
        double euroRate = input.nextDouble();
        System.out.print("How many Pound Sterling will a dollar buy? ");
        double poundRate = input.nextDouble();
        System.out.print("How many Yen will a dollar buy? ");
        double yenRate = input.nextDouble();

        do { //Add a do while loop to ask for conversions.
            System.out.print("Please enter the amount of dollars you want to convert. ");
            double dollars = input.nextDouble();
            System.out.print("Enter E to buy Euros, P to buy Pound Sterling, or Y to buy Yen. ");
            String currencyName = input.next();
            double e = convert(dollars, euroRate);
            double p = convert(dollars, poundRate);
            double y = convert(dollars, yenRate);
            if (currencyName.equalsIgnoreCase("e")) {
                System.out.println("For " + dollars + " dollars, you can buy " + String.format("%.2f", e) + " Euros");
            }
            if (currencyName.equalsIgnoreCase("p")) {
                System.out.println("For " + dollars + " dollars, you can buy " + String.format("%.2f", p) + " Pound Sterling.");
            }
            if (currencyName.equalsIgnoreCase("y")) {
                System.out.println("For " + dollars + " dollars, you can buy " + String.format("%.2f", y) + " Yen.");
            }
            //Ask to see if there are other conversions to do.
            System.out.println("Are there more conversions to perform? ");
            String answer = input.next();
            if (!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("no")) {
                do {
                    System.out.println("Enter yes to continue, or no to stop.");
                    String answer1 = input.next();
                    if (answer1.equalsIgnoreCase("yes") || answer1.equalsIgnoreCase("no")) {
                        break;
                    }
                } while (true);
            }
            if (answer.equals("yes")) {
                continue;
            }
            if (answer.equalsIgnoreCase("no")) {
                break;
            }
        } while (true);

        //Add the method for converting the dollars to other currencies
    }

    /**
     * Convert Method
     *
     * @param $ money inputted
     * @param currency Currency needed to convert to.
     * @return total
     */
    public static double convert(double $, double currency) {
        double total;
        if ($ > 100) {
            total = $ * 0.95 * currency;
        } else {
            total = $ * 0.90 * currency;
        }
        return total;
    }
}
