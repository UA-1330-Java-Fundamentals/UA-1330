package com.softserve.collections2.homeworks123;

import java.util.Map;
import java.util.Scanner;

public class MapMethods {
    public static Map<String, String> RemoveNameFromMap(Map<String, String> person){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a person's name you want to delete");
        String nameToDelete = scanner.nextLine();
        if(person.containsValue(nameToDelete)){
            person.values().remove(nameToDelete);
            System.out.println("List of persons after removal");
            MapMethods.PrintMap(person);
        }
        else {
            System.out.println("No person with such name was found");
        }
        return person;
    }
    public static void PrintMap(Map<String, String> person){
        for (Map.Entry<String, String> entry : person.entrySet()) {
            System.out.println("Person Last Name = " + entry.getKey() + " First Name = " + entry.getValue());
        }
    }

}
