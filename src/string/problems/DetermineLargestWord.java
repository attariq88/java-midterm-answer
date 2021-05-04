package string.problems;

import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {

    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s = "Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        //implement

        System.out.println(s);
        System.out.println(wordNLength);

    }

    public static Map<Integer, String> findTheLargestWord(String sentenceGiven) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";
        //implement
        String words[] = sentenceGiven.split(" ");
        int largestWordLen = 0;
        String largestWord = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int wordLength = word.length();
            if (wordLength > largestWordLen) {
                largestWordLen = wordLength;
                largestWord = word;
            }
        }
        map.put(largestWordLen, largestWord);

        return map;
    }
}
