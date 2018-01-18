package Chapter4;

import java.util.Scanner;

/**
 * Write a program that prompts the user to enter 2 characters and displays the
 * major status represented by their characters.
 *
 * @author Gavin Wilkens
 */
public class C4_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        String s;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter two characters: ");
            s = input.next();
        }

        String major = getMajor(s.charAt(0));
        String status = getSchoolYear(s.charAt(1));

        if (major == null || status == null) {
            System.out.println("Invalid input.");
            System.exit(0);
        }

        System.out.println(major + " " + status);
    }

    public static String getSchoolYear(char schoolYear) {

        switch (schoolYear) {
            case '1':
                return "Freshman";
            case '2':
                return "Sophomore";
            case '3':
                return "Junior";
            case '4':
                return "Senior";
            default:
                return null;
        }
    }

    public static String getMajor(char major) {

        major = Character.toUpperCase(major);
        switch (major) {
            case 'M':
                return "Mathematics";
            case 'C':
                return "Computer Science";
            case 'I':
                return "Information Technology";
            default:
                return null;
        }

    }

}
