package Chapter8;

/**
 * Write a program that will create an array that will display each employee's
 * work hours per day.
 *
 * @author Gavin Wilkens
 */
public class C8_4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        int sum = 0;
        int[][] workHours = {
            {2, 4, 3, 4, 5, 8, 8},
            {7, 3, 4, 3, 3, 4, 4},
            {3, 3, 4, 3, 3, 2, 2},
            {9, 3, 4, 7, 3, 4, 1},
            {3, 5, 4, 3, 6, 3, 8},
            {3, 4, 4, 6, 3, 4, 4},
            {3, 7, 4, 8, 3, 8, 4},
            {6, 3, 5, 9, 2, 7, 9}};

        System.out.println("\t" + "\t" + "Sun" + "\t" + "Mon" + "\t" + "Tue" + "\t" + "Wed" + "\t" + "Thur" + "\t" + "Fri" + "\t" + "Sat" + "\t");
        for (int row = 0; row < workHours.length; row++) {
            System.out.print("\nEmployee:" + row);
            for (int column = 0; column < workHours[row].length; column++) {
                System.out.print("\t" + workHours[row][column]);

            }
        }
        int[] weeklyHours = new int[workHours.length];
        for (int i = 0; i < workHours.length; i++) {
            for (int j = 0; j < workHours[i].length; j++) {
                weeklyHours[i] += workHours[i][j];
            }
        }

        int[] indexList = new int[weeklyHours.length];

        sortIndex(weeklyHours, indexList);

        for (int i = weeklyHours.length - 1; i >= 0; i--) {
            System.out.println("\nEmployee " + indexList[i] + ": "
                    + weeklyHours[i]);
        }
    }

    /**
     * Sorting Method
     *
     * @param list list of work hours
     *
     * @param indexList list of employees
     */
    public static void sortIndex(int[] list, int[] indexList) {
        int currentMax;
        int currentMaxIndex;

        for (int i = 0; i < indexList.length; i++) {
            indexList[i] = i;
        }

        for (int i = list.length - 1; i >= 1; i--) {
            currentMax = list[i];
            currentMaxIndex = i;

            for (int j = i - 1; j >= 0; j--) {
                if (currentMax < list[j]) {
                    currentMax = list[j];
                    currentMaxIndex = j;
                }
            }

            if (currentMaxIndex != i) {
                list[currentMaxIndex] = list[i];
                list[i] = currentMax;

                int temp = indexList[i];
                indexList[i] = indexList[currentMaxIndex];
                indexList[currentMaxIndex] = temp;
            }
        }
    }

}
