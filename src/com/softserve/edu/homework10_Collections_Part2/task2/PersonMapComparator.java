package com.softserve.edu.homework10_Collections_Part2.task2;

/*
Create a map called personMap and populate it with ten entries of type <String,
String>, where each entry corresponds to a person's last name and first name. Display
the contents of the map on the screen. Are there at least two persons with the same
first name among these ten people? Remove the person from the map whose first
name is "Orest" (or any other specified name). Print the resulting map after the
removal.
 */

import java.util.*;

public class PersonMapComparator {

    public static boolean CountPersonsWithSameName(Map<String, String> personMap) {

        Set<String> uniqueNames = new HashSet<>();
        for (String firstName : personMap.values()) {
            if (uniqueNames.contains(firstName)) {
             //   System.out.println("Duplicate name found: " + firstName);
                return true;
            } else {
                uniqueNames.add(firstName);
            }
        }
        return false;
    }


    public static void RemovePersonWithName(Map<String, String> map, String name) {
        Iterator<Map.Entry<String,String>> i = map.entrySet().iterator();

        while (i.hasNext()) {
            Map.Entry<String, String> entry = i.next();
            if (entry.getValue().equals(name)) {
                i.remove();
            }
        }

    }

    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Vovchok", "Marko");
        personMap.put("Vynnychenko", "Volodymyr");
        personMap.put("Ukrainka", "Lesia");
        personMap.put("Kobylyanska", "Olha");
        personMap.put("Shevchenko", "Taras");
        personMap.put("Serhii", "Zhadan");
        personMap.put("Kotliarevskii", "Ivan");
        personMap.put("Franko", "Ivan");
        personMap.put("Vyshnia", "Ostap");
        personMap.put("Pchilka", "Olena");

        System.out.println("Original map: " + personMap);

        System.out.println("Are there at least two persons with the same first name among these ten people?"
                + "\t ->\t"
                + CountPersonsWithSameName(personMap)
        );

        RemovePersonWithName(personMap, "Ostap");

        System.out.println("Map after removing user: " + personMap);

    }



}
