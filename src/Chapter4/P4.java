package Chapter4;

import java.util.Scanner;

/**
 * Write a program that will compare 2 bids for a construction project.
 *
 * @author Gavin Wilkens
 */
public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        // add the scanner input
        Scanner input = new Scanner(System.in);
        //Ask for name, work, and charge of the first bidder
        System.out.print(" Enter the first bidder's name. ");
        String firstName = input.next();
        System.out.print(" How many hours did " + firstName + " work. ");
        int firstWork = input.nextInt();
        System.out.print(" How much does " + firstName + " charge per hour. ");
        double firstCharge = input.nextDouble();
        // Ask for the name, work, and charge for the second bidder
        System.out.print(" What is the second bidder's name. ");
        String secondName = input.next();
        System.out.print(" How many hours did " + secondName + " work. ");
        int secondWork = input.nextInt();
        System.out.print(" How much does " + secondName + " charge per hour. ");
        double secondCharge = input.nextDouble();
        // Calculate the hours times the hourly rate.
        double firstCost = (firstWork * firstCharge);
        double secondCost = (secondWork * secondCharge);
        //Write an if else statement for the output and add two decimal places.
        if (firstCost < secondCost) {
            System.out.println(firstName + " is the winner with " + String.format("%.2f", firstCost));
        } else if (secondCost < firstCost) {
            System.out.println(secondName + " is the winner with " + String.format("%.2f", secondCost));
        }
        if (firstCost == secondCost && firstWork < secondWork) {
            System.out.println(firstName + " is the winner with " + String.format("%.2f", firstCost) + " and " + firstWork);
        } else if (firstCost == secondCost && secondWork < firstWork) {
            System.out.println(secondName + " is the winner with " + String.format("%.2f", secondCost) + " and " + secondWork);
        }
        if (firstCost == secondCost && secondWork == firstWork) {
            System.out.println(firstName + " and " + secondName + " have identical bids with " + firstCharge + " per hour and " + firstWork + " hours worked and a total cost of " + firstCost);
        }
    }

}
