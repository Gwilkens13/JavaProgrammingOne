package Chapter3;

import java.util.Scanner;

/**
 * Write a program that lets the user guess whether the flip of a coin is heads
 * or tails.
 *
 * @author Gavin Wilkens
 */
public class C3_14 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter 0 for heads or 1 for tails: ");
        int userGuess = input.nextInt();

        System.out.println("Flipping coin...");
        int coinSide = (int) (Math.random() * 2.0);

        if (userGuess == coinSide) {
            System.out.println("Good job! You're correct.");
        } else if (coinSide == 0) {
            System.out.println("Sorry, it is heads");
        } else {
            System.out.println("Sorry, it is tails");
        }
    }
}
