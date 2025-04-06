package com.softserve.edu.less10.Collection.task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Malyhina", "Mariia");
        personMap.put("Malyhin", "Kostya");
        personMap.put("Zotin", "Orest");
        personMap.put("Malyhin", "Orest");
        personMap.put("Pupkina", "Klava");
        personMap.put("Zotina", "Klava");
        personMap.put("Malyhina", "Varvara");
        personMap.put("Andriychuk", "Sasha");
        personMap.put("Dummy", "Sveta");
        personMap.put("Malyhina", "Iryna");

        System.out.println(personMap);
        var scan = new Scanner(System.in);
        System.out.println("Enter the name of the person: ");
        String name = scan.nextLine().trim();
        if (personMap.containsValue(name)) {
            for (Map.Entry<String, String> entry : personMap.entrySet()) {
                if (name.equals(entry.getValue())) {
                    System.out.println(entry.getKey() + " " + entry.getValue());
                }
            }
        } else {
            System.out.println("We don't have that person " + name);
        }
        Iterator<Map.Entry<String, String>> it = personMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            if (name.equals(entry.getValue())) {
                it.remove();
            }
        }
        //personMap.values().removeIf(value -> name.equals(value));
        System.out.println(personMap);

        Collection<String> values = personMap.values();
        Integer valuesSize = values.size();
        HashSet<String> hashSet = new HashSet<>(values);
        if (hashSet.size() != valuesSize) {
            System.out.println("We have duplicate values");
        } else {
            System.out.println("We don't have duplicate values");
        }

        Iterator<Map.Entry<String, String>> deduplicate = personMap.entrySet().iterator();
        while (deduplicate.hasNext()) {
            Map.Entry<String, String> entry = deduplicate.next();
            if (personMap.equals(entry.getValue())) {

            }
        }
    }
}
