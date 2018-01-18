
package Chapter2;
import java.util.Scanner;
/**
 * Write a program that reads the subtotal and the gratuity rate, then computes the gratuity and total
 * 
 * @author Gavin Wilkens
 */

public class C2_5 {
    /**
     * Main Method
     * 
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        double gratuityRate,
                gratuityTotal,
                total,
                subtotal;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the subtotal and gratuity rate: ");
        subtotal = input.nextDouble();
        gratuityRate = input.nextDouble();

        gratuityTotal = subtotal * gratuityRate * .01;
        total = subtotal + gratuityTotal;

        System.out.print("The gratuity is $" + gratuityTotal + " and total is $" + total);

    }

}
