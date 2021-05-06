package math.problems;

import java.util.ArrayList;

public class PrimeNumber {

    public static void main(String[] args) {
        /*
         * Find list of Prime numbers from number 2 to 1 million.
         * Try the best solution as possible.Which will take less CPU life cycle.
         * Out put number of Prime numbers on the given range.
         *
         *
         * Use MySql Database to store data and retrieve data.
         *
         */

        System.out.println(findPrimeNumbers(2, 1000000));

    }

    public static ArrayList<Integer> findPrimeNumbers(int start, int end) {
        ArrayList<Integer> primes = new ArrayList<>();

        for (int number = start; number <= end; number++) {
            boolean isPrime = true;

            for (int factor = 2; factor <= number / 2; factor++) {
                if (number % factor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes.add(number);
            }
        }

        return primes;
    }

}
