package math.problems;

public class Pattern {

    public static void main(String[] args) {
        /* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
         * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
         *
         *
         */
        int number = 100;

        for (int i = number; i > 90; i--) {
            System.out.print(i + ",");
        }
        for (int i = number - 10; i > 70; i = i - 2) {
            System.out.print(i + ",");
        }
        for (int i = number - 30; i > 40; i = i - 3) {
            System.out.print(i + ",");
        }
        for (int i = number - 60; i >= 0; i = i - 4) {
            if (i == 0) {
                System.out.println(i + "");
            } else {
                System.out.print(i + ",");
            }
        }
    }
}
