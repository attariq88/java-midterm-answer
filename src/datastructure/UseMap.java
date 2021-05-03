package datastructure;

import java.util.*;

public class UseMap {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         * Use MySql Database to store data and retrieve data.
         */
        HashMap<String, String> passwords = new HashMap<>();

        //storing elements
        passwords.put("user1", "abc123");
        passwords.put("user2", "abc456");
        passwords.put("user3", "abc789");

        //retrieving elements
        System.out.println(passwords.get("user1"));

        //add list to map
        List<String> citiesOfNZ = new ArrayList<>();
        citiesOfNZ.add("Auckland");
        citiesOfNZ.add("Wellington");
        citiesOfNZ.add("Dunedin");
        citiesOfNZ.add("Christchurch");
        citiesOfNZ.add("Queenstown");

        List<String> citiesOfAustralia = new ArrayList<>();
        citiesOfAustralia.add("Sydney");
        citiesOfAustralia.add("Melbourne");
        citiesOfAustralia.add("Perth");
        citiesOfAustralia.add("Brisbane");
        citiesOfAustralia.add("Canberra");

        HashMap<String, List<String>> listOfCities = new HashMap<>();
        listOfCities.put("New Zealand", citiesOfNZ);
        listOfCities.put("Australia", citiesOfAustralia);

        //for each loop
        System.out.println("**************");
        for (String cityNames : listOfCities.keySet()) {
            System.out.println(cityNames + "- " + listOfCities.get(cityNames));
        }

        //while loop
        System.out.println("**************");
        Iterator<Map.Entry<String,List<String>>> iterator = listOfCities.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,List<String>> set = iterator.next();
            System.out.println(set.getKey()+"- "+set.getValue());
        }

    }

}
