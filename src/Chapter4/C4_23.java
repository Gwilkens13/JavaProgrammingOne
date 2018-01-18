package Chapter4;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * Write a program that reads information and prints a payroll statement.
 * 
 * @author Gavin Wilkens
 */

public class C4_23 {
    /**
     * Main Method
     * 
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee's name: ");
        String name = input.next();
        System.out.print("Enter number of hours worked in a week: ");
        double hours = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double hourlyRate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double fedTax = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double stateTax = input.nextDouble();

        double grossPay = hours * hourlyRate;
        
        double fedTaxWithholding = grossPay * fedTax;
        
        double stateTaxWithholding = grossPay * stateTax;
    
        double totalDeduction = fedTaxWithholding + stateTaxWithholding;
        
        double netPay = grossPay - totalDeduction;

        System.out.println("Employee Name: Smith" + name +
                "\nPay Rate: " + formatCurrency(hourlyRate) +
                "\nHours Worked: " + hours +
                "\nGross Pay: " + formatCurrency(grossPay) +
                "\nDeductions:" +
                "\n  Federal Withholding ("+ formatPercent(fedTax)+"): " + formatCurrency(fedTaxWithholding) +
                "\n  State Withholding ("+ formatPercent(stateTax)+"): " + formatCurrency(stateTaxWithholding) +
                "\n  Total Deduction: " + formatCurrency(totalDeduction) +
                "\nNet Pay: " + formatCurrency(netPay));
    }

    public static String formatCurrency(double money) {

        return  DecimalFormat.getCurrencyInstance().format(money);
    }
    public static String formatPercent(double percent) {

        return  DecimalFormat.getPercentInstance().format(percent);
    }

}
