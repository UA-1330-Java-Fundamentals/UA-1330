package com.softserve.edu11lst;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("second", "third", "fourth", "first", "first");
        System.out.println("Original: " + list);
        Collections.reverse(list);
        System.out.println("Reverse: " + list);

        // sorting
        Collections.sort(list);
        System.out.println("sort(list): " + list);

        //reverse sort order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("sort_reverseOrder: " + list);

        // uses a binary search algorithm to find a specific element;
        // returns the element number or a negative number
        Collections.sort(list);
        System.out.println("sort(list): " + list);
        System.out.println("binarySearch pos = " + Collections.binarySearch(list, "second"));

        //randomly reorders elements
        Collections.shuffle(list);
        System.out.println("sort_shuffle: " + list);

        // max value, min value,
        System.out.println("max = " + Collections.max(list));
        System.out.println("min = " + Collections.min(list));

        // cyclically shifts the elements passed to it by distance
        // positions forward (+) or backward (-)
        Collections.rotate(list, -1);
        System.out.println("sort_rotate -1: " + list);

        // copy collection
        List<String> listDestination = Arrays.asList("green", "black");
        Collections.copy(list, listDestination);
        System.out.println("Copy = " + list);

        // returns the total number of occurrences of the
        // specified element in the list
        System.out.println("frequency first = " + Collections.frequency(list, "first"));
    }
}
