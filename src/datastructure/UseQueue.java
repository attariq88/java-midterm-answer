package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         */
        Queue<String> patientLine = new LinkedList<>();

        //add
        patientLine.add("Mohammad");
        patientLine.add("Nazmuddin");
        patientLine.add("Tareq");
        patientLine.add("Aziz");
        patientLine.add("Hoque");
        patientLine.add("Yara");
        patientLine.add("Tahim");

        //peek
        System.out.println(patientLine.peek());

        //remove
        System.out.println("**********");
        patientLine.remove("Nazmuddin");
        System.out.println(patientLine);

        //poll
        System.out.println("**********");
        System.out.println("Before polling - "+patientLine);
        System.out.println(patientLine.poll());
        System.out.println(patientLine.poll());
        System.out.println("After polling - "+patientLine);

        //for loop
        System.out.println("**********");
        for (String nameList : patientLine) {
            System.out.println(nameList);
        }

        // while loop with iterator
        System.out.println("*************");
        Iterator iterator = patientLine.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
