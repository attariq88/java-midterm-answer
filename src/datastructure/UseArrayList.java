package datastructure;

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class UseArrayList {

    static ArrayList<String> names = new ArrayList<>();
    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         * Store all the sorted data into one of the databases.
         *
         */


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
        for (String nameList : names) {
            System.out.println(nameList);
        }

        // while loop with iterator
        System.out.println("*************");
        Iterator iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //sorted data
        System.out.println("*************");
        ArrayList<String> sortedData = sortedNames();
        System.out.println("After sorting: " + sortedData);

        //store sorted data in to database
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        List<String> lowestValue = new ArrayList<String>();

        try {
            connectToSqlDB.insertDataFromArrayListToSqlTable(names, "tbl_lowestNumber", "column_lowestNumber");
            lowestValue = connectToSqlDB.readDataBase("tbl_lowestNumber", "column_lowestNumber");

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Data is reading from the Table (tbl_lowestNumber) and displaying to the console");
        for (String st : lowestValue) {
            System.out.println(st);
        }

    }
    public static ArrayList<String> sortedNames(){
        Collections.sort(names);
        return names;
    }


}
