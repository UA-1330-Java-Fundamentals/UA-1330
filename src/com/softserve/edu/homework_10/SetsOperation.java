package com.softserve.edu.homework_10;

import java.util.HashSet;
import java.util.Set;

public class SetsOperation {
    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        if (set1 != null && set2 != null) {
            Set<T> resultSet = new HashSet<>();
            resultSet.addAll(set1);
            resultSet.addAll(set2);
            return resultSet;
        } else {
            return new HashSet<>();
        }
    }

    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        if (set1 != null && set2 != null) {
            Set<T> resultSet = new HashSet<>();
            for (T item1 : set1) {
                for (T item2 : set2) {
                    if (item1 == item2) {
                        resultSet.add(item2);
                    }
                }
            }
            return resultSet;
        } else {
            return new HashSet<>();
        }
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(45);
        set1.add(167);
        set1.add(23);
        set1.add(2);
        System.out.println("First set: " + set1);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(45);
        set2.add(1);
        set2.add(23);
        set2.add(4);
        System.out.println("Second set: " + set2);

        /*
        Set<String> set1 = new HashSet<>();
        set1.add("First");
        set1.add("Second");
        set1.add("Third");
        System.out.println("First set: " + set1);

        Set<String> set2 = new HashSet<>();
        set2.add("Fourth");
        set2.add("Fifth");
        set2.add("First");
        System.out.println("Second set: " + set2);
        */

        System.out.println("\nThe union of two sets: " + union(set1, set2));
        System.out.println("The intersection of two sets: " + intersect(set1, set2));
    }
}
