package math.problems;

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LowestNumber {

    public static void main(String[] args) {
        /*
         * Write java solution to find the lowest number from this array.
         * Use MySql Database to store and to retrieve.
         */
        int[] array = new int[]{211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};

        //find lowest number from the array

        int minimum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minimum) {
                minimum = array[i];
            }
        }

        System.out.println(minimum);

        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        int[] lowestValue = new int[array.length];
        lowestValue[0] = minimum;
        List<String> lv = new ArrayList<>();

        try {
            connectToSqlDB.insertDataFromArrayToSqlTable(lowestValue, "tbl_lowestNumber", "column_lowestNumber");
            lv = connectToSqlDB.readDataBase("tbl_lowestNumber", "column_lowestNumber");

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Data is reading from the Table (tbl_lowestNumber) and displaying to the console");
        for (String min : lv) {
            System.out.println(min);
        }
    }

}
