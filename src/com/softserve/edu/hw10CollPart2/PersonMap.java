package com.softserve.edu.hw10CollPart2;

import java.util.*;

public class PersonMap {
    public static void main(String[] args) {
        Map<String, List<String>> personMap = new LinkedHashMap<>();

        addToMap(personMap, "Smith", "John");
        addToMap(personMap, "Johnson", "Emily");
        addToMap(personMap, "Brown", "Michael");
        addToMap(personMap, "Williams", "Sarah");
        addToMap(personMap, "Jones", "David");
        addToMap(personMap, "Miller", "Emily");
        addToMap(personMap, "Davis", "Orest");
        addToMap(personMap, "Wilson", "Olivia");
        addToMap(personMap, "Anderson", "James");
        addToMap(personMap, "Smith", "Sophia");

        //Print original map
        System.out.println("Original Map:");
        printMap(personMap);

        //Check duplicating names
        checkDuplicateNames(personMap);
        System.out.println(" ");

        //Removing person with specified name: "Orest"
        removePersonByFirstName(personMap, "Orest");

        //Print Map after person removing
        System.out.println("\nMap after removal:");
        printMap(personMap);

    }

    //method to add person into map with ability add person with the same Last Name and different First Name
    public static void addToMap(Map<String, List<String>> map, String lastName, String firstName) {
        if (!map.containsKey(lastName)) {
            map.put(lastName, new ArrayList<>());
        }
        map.get(lastName).add(firstName);
    }

    //method to print Map
    public static void printMap(Map<String, List<String>> map) {
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            System.out.println("Last Name: " + entry.getKey());
            for (String firstName : entry.getValue()) {
                System.out.println("    First Name: " + firstName);
            }
        }
    }

    //method to check if there are two person with the same name
    public static void checkDuplicateNames(Map<String, List<String>> map) {
        Map<String, Integer> nameCount = new HashMap<>();

        for (List<String> names : map.values()) {
            for (String name : names) {
                // Check if the name is in the nameCount
                if (nameCount.containsKey(name)) {
                    nameCount.put(name, nameCount.get(name) + 1);
                } else {
                    nameCount.put(name, 1);
                }
            }
        }

        System.out.println("\nChecking for duplicates:");
        boolean hasDuplicateName = false;
        for (Map.Entry<String, Integer> entry : nameCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Duplicate name found: " + entry.getKey());
                hasDuplicateName = true;
            }
        }
        if (!hasDuplicateName) {
            System.out.println("No duplicate names found");
        }
    }

    //method to remove person with specified name
    public static void removePersonByFirstName(Map<String, List<String>> map, String firstName) {
        for (String lastName : map.keySet()) {
            List<String> names = map.get(lastName);
            // Если список имен содержит имя для удаления
            if (names.contains(firstName)) {
                names.remove(firstName);
                // Если после удаления список пустой, удаляем и саму фамилию
                if (names.isEmpty()) {
                    System.out.println("Person with last name: " + lastName + " and first name: " + firstName + " was deleted");
                    map.remove(lastName);
                }
                break;
            }
        }
    }
}