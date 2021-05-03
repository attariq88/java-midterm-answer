package datastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         * Store all the sorted data into one of the databases.
         *
         */
        ArrayList<String> names = new ArrayList<>();

        //add
        names.add("Minhaz");
        names.add("Mohammad");
        names.add("Nazmuddin");
        names.add("Tariq");
        names.add("Aziz");
        names.add("Shakib");
        names.add("Mahmud");
        names.add("Kasef");
        names.add("Sadi");
        names.add("Tunan");


        //peek
        List startWithM = names.stream().filter(obj -> obj.startsWith("M")).peek(System.out::println).collect(Collectors.toList());

        //remove
        names.remove("Tariq");
        names.remove(7);

        //retrieve elements
        System.out.println("*************");
        System.out.println(names.get(3));

        //for each loop
        System.out.println("*************");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        // while loop with iterator
        System.out.println("*************");
        Iterator iterator = names.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //store sorted data
        System.out.println("*************");
        Collections.sort(names);
        System.out.println("After sorting: "+names);

    }

}
