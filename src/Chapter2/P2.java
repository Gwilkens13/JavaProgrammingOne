
package Chapter2;
import java.util.Scanner;


/**
 * Write a program that prompts a user to enter a price for the meal. Then it will calculate the tax for the meal.
 * 
 * @author Gavin Wilkens
 */

public class P2 {
    /**
     * Main Method
     * 
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        //Declare the variables.
        double meal,
         drink,
         dessert,
         tax,
         tip,
         total,
         taxTotal,
         mealNotax,
         mealTotal;
        //Add the scanner and ask for the amounts.
        Scanner input = new Scanner(System.in) ;
        System.out.print("Enter the amount for the meal, drink, and dessert." );
        meal = input.nextDouble() ;
        drink = input.nextDouble();
        dessert = input.nextDouble();
        tax = .10;
        mealNotax = meal + drink + dessert;
        taxTotal = ((meal + drink + dessert) * tax);
        mealTotal = meal + drink + dessert + taxTotal;
        tip = mealTotal * .15;
        total = mealTotal + tip;
        //Display the results.
        System.out.println("meal: $" + mealNotax);
        System.out.println("tax: $" + taxTotal );
        System.out.println("meal with tax: $" + mealTotal );
        System.out.println("tip: $" + tip);
        System.out.println("meal total: $" + total);
    }
}
