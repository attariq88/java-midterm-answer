package math.problems;

public class Fibonacci {

    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */

        int number1 = 0;
        int number2 = 1;
        int sum;
        int count = 40;

        for (int i = 0; i < count; i++) {
            System.out.print(number1+" ");
            sum = number1 + number2;
            number1 = number2;
            number2 = sum;
        }
    }
}
