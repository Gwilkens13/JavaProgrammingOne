
package Chapter4;
import java.util.Scanner;
/**
 *Write a program the prompts the user to enter 2 strings and reports whether the 2nd sting is a substring of the first one.
 * 
 * @author Gavin Wilkens
 */

public class C4_22 {
    /**
     * Main Method
     * 
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String 1: ");
        String s1 = input.nextLine();
        System.out.print("Enter String 2: ");
        String s2 = input.nextLine();
        input.close();

        if (s1.contains(s2)) {
            System.out.println(s2 + " is a substring of " + s1);
        } else {
            System.out.println(s2 + " is NOT a substring of " + s1);
        }

    }

}
