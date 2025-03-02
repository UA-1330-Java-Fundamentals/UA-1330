package com.softserve.edu.homework_10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PersonMap {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Ortega", "Jenna");
        personMap.put("Munio", "Tania");
        personMap.put("Lebedenko", "Orest");
        personMap.put("Black", "Jack");
        personMap.put("Joseph", "Tyler");
        personMap.put("Boichuk", "Alice");
        personMap.put("Middleton", "Kate");
        personMap.put("Frankl", "Viktor");
        personMap.put("Ukrainka", "Lesya");
        personMap.put("Coleman", "Orest");

        //Print all people
        System.out.println("\nAll people: ");
        for (Map.Entry<String, String> m : personMap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        //Remove person with certain first name from map
        String firstName = "Orest";
        Iterator<Map.Entry<String, String>> iterator = personMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            if (entry.getValue().equals("Orest")) {
                iterator.remove();
            }
        }

        System.out.println("\nMap without a person with the first name " + firstName + ":");
        for (Map.Entry<String, String> m : personMap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
