package com.softserve.edu05arr;

import java.sql.Array;
import java.util.Arrays;

public class AppPerson {

    public static Person[] sort(Person[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].getAge() > arr[j + 1].getAge()) { // by age
                //if (arr[j].getName().compareTo(arr[j + 1].getName()) < 0) { // by name
                    var tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Person[] arr = {
                new Person("Alice", 17),
                new Person("Bob", 21),
                new Person("Jack", 18)
        };
        //
        System.out.println("Original:");
        for (var person : arr) {
            System.out.println("\t" + person);
        }
        //
        arr = sort(arr);
        //Arrays.sort(arr); // Compile Error
        //
        System.out.println("Sorted:");
        for (var person : arr) {
            System.out.println("\t" + person);
        }
    }
}
