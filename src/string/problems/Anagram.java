package string.problems;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        System.out.println(isAnagram("ARMY","MARY"));

    }

    public static boolean isAnagram(String x, String y){
        boolean isAnagram = false;


        char[] charArrayOfx = x.toCharArray();
        char[] charArrayOfy = y.toCharArray();

        Arrays.sort(charArrayOfx);
        Arrays.sort(charArrayOfy);

        isAnagram = Arrays.equals(charArrayOfx,charArrayOfy);

        return isAnagram;
    }

}
