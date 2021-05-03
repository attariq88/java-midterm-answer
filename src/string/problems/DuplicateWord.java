package string.problems;

import java.util.HashMap;

public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        HashMap<String, Integer> totalOccurences = new HashMap<>();
        HashMap<String, Integer> multipleOccurences = new HashMap<>();

        String[] arrayOfIndividualWords = st.toUpperCase().replace(".","").split(" ");

        for (String individualWords : arrayOfIndividualWords) {
            Integer previousCount = totalOccurences.get(individualWords);
            if (previousCount == null){
                previousCount = 0;
            }
            totalOccurences.put(individualWords,previousCount+1);

            if ((previousCount+1) >1){
                int totalCount = previousCount +1;
                multipleOccurences.put(individualWords,totalCount);
            }

        }

        System.out.println(totalOccurences);
        System.out.println(multipleOccurences);

    }

}


