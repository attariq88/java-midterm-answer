package math.problems;

import java.util.Iterator;

public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */

        //Factorial using Iteration
        int number = 5;
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
            System.out.println(fact);
        }

        System.out.println("***************");
        System.out.println(factorial(5));

    }

    //Factorial using Recursion
    public static int factorial(int number) {
        if (number == 1) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }
}
