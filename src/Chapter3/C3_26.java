
package Chapter3;
import java.util.Scanner;
/**
 * Write a program that tells whether a number is divisible by 5 and 6, by 5 or 6, and 5 or 6 but not both.
 * 
 * @author Gavin Wilkens
 */

public class C3_26 {
    /**
     * Main Method
     * 
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        boolean fiveAndSix = (number % 5 == 0) && (number % 6 == 0);
        boolean fiveOrSix = (number % 5 == 0) || (number % 6 == 0);
        boolean fiveOrSixNotBoth = (number % 5 == 0) ^ (number % 6 == 0);

        System.out.println("Is " + number + " divisible by 5 and 6? " + fiveAndSix);
        System.out.println("Is " + number + " divisible by 5 or 6? " + fiveOrSix);
        System.out.println("Is " + number + " divisible by 5 or 6, but not both? " + fiveOrSixNotBoth);
    }

}
