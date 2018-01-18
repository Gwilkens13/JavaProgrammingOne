package Chapter2;

import java.util.Scanner;

/**
 * Write a program that reads a Celsius degree in a double value from the
 * console, then converts it to Fahrenheit and displays the result.
 *
 * @author Gavin Wilkens
 */
public class C2_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a degree in Celsius: ");
        double celsius = input.nextDouble();
        double fahrenheit = (9.0 / 5.0) * celsius + 32.0;
        System.out.println(celsius + " degree Celsius is equal to " + fahrenheit + " in Fahrenheit");
    }

}
