package Chapter7;

import java.util.Scanner;

/**
 * Prompt the user to enter 2 lists and let the program determine whether they
 * are identical or not.
 *
 * @author Gavin Wilkens
 */
public class C7_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list1: ");
        int[] list1 = new int[input.nextInt()];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }

        System.out.print("Enter list2: ");
        int[] list2 = new int[input.nextInt()];
        for (int i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();
        }

        System.out.println("Two lists are" + (equals(list1, list2) ? " " : " not ")
                + "strictly identical");
    }

    /**
     * Compare Method
     *
     * @param list1 first list
     *
     * @param list2 second list
     *
     * @return true or false
     */
    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length) {
            return false;
        }

        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) {
                return false;
            }
        }
        return true;
    }
}
