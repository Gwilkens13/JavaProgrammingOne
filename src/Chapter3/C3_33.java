
package Chapter3;
import java.util.Scanner;
/**
 * Write a program that compares the price and weight of 2 packages.
 * 
 * @author Gavin Wilkens
 */

public class C3_33 {
    /**
     * Main Method
     * 
     * @param args arguments from command line prompt
     */
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight and price for package 1: ");
        double weight1 = input.nextDouble();
        double price1 = input.nextDouble();

        System.out.print("Enter weight and price for package 2: ");
        double weight2 = input.nextDouble();
        double price2 = input.nextDouble();

        if (price1 * 1.0D / weight1 >= price2 * 1.0D / weight2) {
            System.out.println("Package 1 has a better price.");
        } else {
            System.out.println("Package 2 has a better price.");
        }
    }

}
