package Chapter5;

import java.util.Scanner;// import the Scanner

/**
 * Write a program that counts the number of every vote.
 *
 * @author Gavin Wilkens
 */
public class P5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);// apply the scanner
        //add the counter variables
        int countYesVotes = 0;
        int countNoVotes = 0;
        int countInvalidVotes = 0;
        //add the loop statement
        do {
            System.out.print("Enter y for yes, n for no(Enter q to stop)");
            String vote = input.next();
            if (vote.equals("y") || vote.equals("Y")) {
                countYesVotes++;
            }
            if (vote.equals("n") || vote.equals("N")) {
                countNoVotes++;
            }
            if (!vote.equalsIgnoreCase("n") && !vote.equalsIgnoreCase("y") && !vote.equalsIgnoreCase("q")) {
                countInvalidVotes++;
            }
            if (vote.equals("q") || vote.equals("Q")) {
                break;
            }
        } while (true);
        int total = countNoVotes + countYesVotes + countInvalidVotes;
        System.out.println("Yes votes:" + countYesVotes + " No votes:" + countNoVotes + " Invalid votes: " + countInvalidVotes + " Total vote:" + total);

    }

}
