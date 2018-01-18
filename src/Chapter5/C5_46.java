package Chapter5;

import java.util.Scanner;

/**
 * Write a program that prompts the user to enter a string, then it will display
 * the string in reverse.
 *
 * @author Gavin Wilkens
 */
public class C5_46 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {

            reverse += s.charAt(i);
        }
        System.out.print(s + " in reverse is " + reverse);

    }

}
