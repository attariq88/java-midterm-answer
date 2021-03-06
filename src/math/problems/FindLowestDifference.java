package math.problems;

import java.util.Arrays;

public class FindLowestDifference {

    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};

        Arrays.sort(array1);
        Arrays.sort(array2);

        int difference = Integer.MAX_VALUE;     //Integer.Max_Value = 2147483647

        for (int i = 0; i < array1.length - 1; i++) {
            if (array1[i + 1] - array1[i] < difference) {
                difference = array1[i + 1] - array1[i];
            }

        }
        for (int i = 0; i < array2.length - 1; i++) {
            if (array2[i + 1] - array2[i] < difference) {
                difference = array2[i + 1] - array2[i];
            }
        }
        System.out.println(difference);

    }

}
