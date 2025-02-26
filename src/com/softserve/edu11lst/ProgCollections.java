package com.softserve.edu11lst;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ProgCollections {
    public static void main(String[] args) {
        /*
        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(1);
        list1.add(0);
        System.out.println("1. list1 = " + list1);
        list1.remove(Integer.valueOf(0));
        //list1.remove(0);
        System.out.println("2. list1 = " + list1);
        */
        /*
        List<String> list = new ArrayList<>();
        List<String> addList = List.of("add First", "add Second");
        list.add("First element");
        list.add("Second element");
        list.add("Third element");
        list.add("Fourth element");
        System.out.println("1. Original = " + list);
        list.add(0, "One more first element");
        // list.set(0, "One more first element");
        System.out.println("2. add 0 = " + list);
        list.addAll(2, addList);
        System.out.println("3. addAll 2 = " + list);
        //
        // removes list item or removes list element by index
        //list.remove("First element");
//        list.remove(1);
//        System.out.println("4. Removed: First element = " + list);
        //
        // removes all elements from the calling collection
//        List<String> removeElements = List.of("First element", "Fourth element");
//        list.removeAll(removeElements);
//        System.out.println("4. Removed: removeElements = " + list);
        //
        // removes all elements except those from the calling collection
        List<String> retainElements = List.of("First element", "Fourth element");
        list.retainAll(retainElements);
        System.out.println("4. Removed: another = " + list);
        */
        // /*
        List<String> list = Arrays.asList("second", "third", "fourth", "first", "first");
        System.out.println("Original = " + list);
        Collections.reverse(list);
        System.out.println("Reverse = " + list);

        // sorting
        Collections.sort(list);
        System.out.println("Sorted = " + list);

        //reverse sort order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Collections.reverseOrder() = " + list);

        // uses a binary search algorithm to find a specific element;
        // returns the element number or a negative number
        Collections.sort(list);
        System.out.println("sorted = " + list);
        System.out.println("binarySearch: second = " + Collections.binarySearch(list, "second"));

        //randomly reorders elements
        Collections.shuffle(list);
        System.out.println("After shuffling: " + list);

        // max value, min value,
        System.out.println("max = " + Collections.max(list));
        System.out.println("min = " + Collections.min(list));

        //cyclically shifts the elements passed to it by distance
        // positions forward (+) or backward (-)
        //Collections.sort(list);
        Collections.rotate(list, -1);
        System.out.println("rotate -1: " + list);

        // copy collection
        //List<String> listDestination = Arrays.asList("green", "black");
        List<String> listDestination = new ArrayList<>();
        listDestination.add("one");
        listDestination.add("two");
        Collections.copy(list, listDestination);
        System.out.println("copy = " + list);

        //eturns the total number of occurrences of the
        // specified element in the list
        System.out.println("frequency: first = " + Collections.frequency(list, "first"));
        // */
    }
}
