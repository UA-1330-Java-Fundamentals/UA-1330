package com.softserve.collections2.homeworks123;

import java.util.*;


public class ApplMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Black", "Jack");
        personMap.put("Smith", "Anne");
        personMap.put("Snow", "John");
        personMap.put("Green", "Kate");
        personMap.put("Brown", "Bob");
        personMap.put("Tyson", "Mike");
        personMap.put("Reacher", "Jack");
        personMap.put("Johansson", "Anne");
        personMap.put("James", "Jessie");
        personMap.put("Jonson", "Alice");
        System.out.println("The list of persons");
        MapMethods.PrintMap(personMap);
        MapMethods.RemoveNameFromMap(personMap);
    }
}

