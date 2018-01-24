package Chapter8;

import java.util.Scanner;

/**
 * Write a program that prompts the user to enter the employee ID, then asks for
 * the day and sales amount. It will ask the user to continue or not. Finally,
 * it will display the results in a table.
 *
 * @author Gavin Wilkens
 */
public class P8 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] salesChart = {
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0}};
        String id = "";
        String day = "";
        do {
            System.out.print("Enter salesmen ID as A, B, C, or D.");
            id = input.next();
        } while (!(id.equalsIgnoreCase("A")) && !(id.equalsIgnoreCase("b")) && !(id.equalsIgnoreCase("c")) && !(id.equalsIgnoreCase("d")));
        do {
            System.out.print("Enter the day as M, T, W, H, or F.");
            day = input.next();
        } while (!(day.equalsIgnoreCase("m")) && !(day.equalsIgnoreCase("t")) && !(day.equalsIgnoreCase("w")) && !(day.equalsIgnoreCase("h")) && !(day.equalsIgnoreCase("f")));
        do {
            System.out.print("Enter the amount of the sale for " + id + " on " + day + "\t");
            double money = input.nextDouble();
            if (id.equalsIgnoreCase("a") && day.equalsIgnoreCase("m")) {
                salesChart[0][0] = money + salesChart[0][0];
            }
            if (id.equalsIgnoreCase("a") && day.equalsIgnoreCase("t")) {
                salesChart[0][1] = money + salesChart[0][1];
            }
            if (id.equalsIgnoreCase("a") && day.equalsIgnoreCase("w")) {
                salesChart[0][2] = money + salesChart[0][2];
            }
            if (id.equalsIgnoreCase("a") && day.equalsIgnoreCase("h")) {
                salesChart[0][3] = money + salesChart[0][3];
            }
            if (id.equalsIgnoreCase("a") && day.equalsIgnoreCase("f")) {
                salesChart[0][4] = money + salesChart[0][4];
            }
            if (id.equalsIgnoreCase("b") && day.equalsIgnoreCase("m")) {
                salesChart[1][0] = money + salesChart[1][0];
            }

            if (id.equalsIgnoreCase("b") && day.equalsIgnoreCase("t")) {
                salesChart[1][1] = money + salesChart[1][1];
            }
            if (id.equalsIgnoreCase("b") && day.equalsIgnoreCase("w")) {
                salesChart[1][2] = money + salesChart[1][2];
            }
            if (id.equalsIgnoreCase("b") && day.equalsIgnoreCase("h")) {
                salesChart[1][3] = money + salesChart[1][3];
            }
            if (id.equalsIgnoreCase("b") && day.equalsIgnoreCase("f")) {
                salesChart[1][4] = money + salesChart[1][4];
            }
            if (id.equalsIgnoreCase("c") && day.equalsIgnoreCase("m")) {
                salesChart[2][0] = money + salesChart[1][0];
            }

            if (id.equalsIgnoreCase("c") && day.equalsIgnoreCase("t")) {
                salesChart[2][1] = money + salesChart[1][1];
            }
            if (id.equalsIgnoreCase("c") && day.equalsIgnoreCase("w")) {
                salesChart[2][2] = money + salesChart[1][2];
            }
            if (id.equalsIgnoreCase("c") && day.equalsIgnoreCase("h")) {
                salesChart[2][3] = money + salesChart[1][3];
            }
            if (id.equalsIgnoreCase("c") && day.equalsIgnoreCase("f")) {
                salesChart[2][4] = money + salesChart[1][4];
            }
            if (id.equalsIgnoreCase("d") && day.equalsIgnoreCase("m")) {
                salesChart[3][0] = money + salesChart[1][0];
            }

            if (id.equalsIgnoreCase("d") && day.equalsIgnoreCase("t")) {
                salesChart[3][1] = money + salesChart[1][1];
            }
            if (id.equalsIgnoreCase("d") && day.equalsIgnoreCase("w")) {
                salesChart[3][2] = money + salesChart[1][2];
            }
            if (id.equalsIgnoreCase("d") && day.equalsIgnoreCase("h")) {
                salesChart[3][3] = money + salesChart[1][3];
            }
            if (id.equalsIgnoreCase("d") && day.equalsIgnoreCase("f")) {
                salesChart[3][4] = money + salesChart[1][4];
            }
            System.out.print("More data? Enter Y for more or N to stop. ");
            String yesOrNo = input.next();
            if (yesOrNo.equalsIgnoreCase("n")) {
                break;
            }
            if (yesOrNo.equalsIgnoreCase("y")) {
                continue;
            }
        } while (true);

        System.out.println("\t" + "\t" + "Mon" + "\t" + "Tue" + "\t" + "Wed" + "\t" + "Thur" + "\t" + "Fri" + "\t");
        for (int row = 0; row < salesChart.length; row++) {
            System.out.print("\nID:" + row);
            for (int column = 0; column < salesChart[row].length; column++) {
                System.out.print("\t" + salesChart[row][column]);

            }
        }

    }
}
