package datastructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class DataReader {

    public static void main(String[] args) {
        /*
         * User API to read the below textFile and print to console.
         * Use BufferedReader class.
         * Use try....catch block to handle Exception.
         *
         * Use MySql Database to store data and retrieve data.
         *
         * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
         * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
         * order from LinkedList and retrieve as FILO order from Stack.
         *
         * Demonstrate how to use Stack that includes push,peek,search,pop elements.
         * Use For Each loop/while loop/Iterator to retrieve data.
         */

        String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car";

        String tempContainer;
        String finalContainer = "";

        try {
            FileReader fileReader = new FileReader(textFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((tempContainer = bufferedReader.readLine()) != null) {
                if (finalContainer.equals("")) {
                    finalContainer = finalContainer + tempContainer;
                } else {
                    finalContainer = finalContainer + tempContainer + "\n";
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(finalContainer);

        //Store each words into LinkedList
        System.out.println("-------------");
        LinkedList<String> wordList = new LinkedList<>();
        String[] arrayOfIndividualWords = finalContainer.replace(".", "").replace(",", "").split(" ");
        for (String individulaWords : arrayOfIndividualWords) {
            wordList.add(individulaWords);
        }
        System.out.println(wordList);

        //Demonstrate of Stack
        System.out.println("-------------");
        Stack<String> items = new Stack<>();

        //push
        items.push("Bottom");
        items.push("Fourth");
        items.push("Third");
        items.push("Second");
        items.push("Top");

        //peek
        System.out.println(items.peek());

        //pop
        System.out.println(items.pop());

        //search
        System.out.println(items.search("Third"));

        //for each loop
        System.out.println("-----------");
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i));
        }

        //while loop
        System.out.println("-------------");
        Iterator iterator = items.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

}
