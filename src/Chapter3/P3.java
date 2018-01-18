
package Chapter3;
import java.util.Scanner;
/**
 * Write a program to practice using the "if" statement.
 * 
 * @author Gavin Wilkens
 */

public class P3 {
    /**
     * Main Method
     * 
     * @param args arguments from command line prompt
     */
     public static void main(String[] args){
        //Add the scanner.
        Scanner input = new Scanner(System.in);
        //Ask for the numbers and declare the variables.
        System.out.print("Enter two numbers.");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        //Use the if statement for inequalities.
        if (number1 > number2){
            System.out.println(number1 + " is greater than " + number2);
        } else if (number1 < number2){
            System.out.println(number1 + " is less than " + number2);
        } else if (number1 == number2) {
            System.out.println(number1 + " is equal to " + number2);
        } if (number1 <= number2){
            System.out.println(number1 + " is less than or equal to " + number2);
        } if (number1 != number2){
            System.out.println(number1 + " is not equal to " + number2);
        }
        //Use the if statement for proper or improper fraction
        if (number2 == 0){
            System.out.println(" Cannot divide by zero");
        
        } else if (number1 / number2 < 1){
            System.out.println(" proper fraction ");
        } 
        // Use the if statement for the grade of the first number.
        
        if (number1 >= 90)
            System.out.println("A");
         else if (number1 >= 80)
            System.out.println("B");
         else if (number1 >= 70)
            System.out.println("C");
         else if (number1 >= 60)
            System.out.println("D");
         else  
            System.out.println("F");
        
        // Use the if statement to find the range of the second number.
        
        if (number2 >= 1 && number2 <= 100){
            System.out.println("In range");
        } else {
            System.out.println("Out of range");
        }
            
        
        
        }
}
