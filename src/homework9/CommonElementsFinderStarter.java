package homework9;
/*
Create a Java program that finds the common elements between two lists of integers. After finding the common elements, determine the maximum value among them.

You should implement three methods:

findCommonElements(List<Integer> list1, List<Integer> list2): This method takes two List<Integer> arguments and returns a new list containing all the common elements between the two lists without duplicates.
findMaxValue(List<Integer> list): This method takes a list and returns the maximum value from that list, or null if the list is empty.
Write a main method to demonstrate these methods using example lists.
Requirements:

Handle cases where one or both lists are empty.
Use only standard list operations; do not use Sets.
Ensure there are no duplicate elements in the resulting list of common elements.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CommonElementsFinderStarter {

    //This method takes two List<Integer> arguments and returns a new list containing all the common elements between the two lists without duplicates.
    public static List<Integer> findCommonElements(List<Integer> list1, List<Integer> list2) {
        if (list1 == null || list2 == null){
            return new ArrayList<>();
        }

        if (list1.isEmpty() || list2.isEmpty()){
           return new ArrayList<>();
       }

       List<Integer> commonElements = new ArrayList<>();

       for ( Integer i : list1){
           if( list2.contains(i) && ! commonElements.contains(i)){
               commonElements.add(i);
           }
       }

        return commonElements; // Placeholder return statement
    }
    //This method takes a list and returns the maximum value from that list, or null if the list is empty.
    public static Integer findMaxValue(List<Integer> list) {
        if (list.isEmpty()){
            return null;
        }
        return Collections.max(list); // Placeholder return statement
    }

    public static void main(String[] args) {
        // Example lists to be used
        List<Integer> list1 = List.of(1, 2, 3, 5, 7, 8, 10);
        List<Integer> list2 = List.of(2, 3, 4, 5, 9);

        List<Integer> commonElements = findCommonElements(list1, list2);
        System.out.println("Common elements: " + commonElements);

        Integer maxValue = findMaxValue(commonElements);
        if (maxValue != null) {
            System.out.println("Maximum value among common elements: " + maxValue);
        } else {
            System.out.println("No common elements to determine the maximum value.");
        }

    }
}

