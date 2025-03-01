package com.softserve.edu.homework_9;

import java.util.*;

public class MyCollection {
    public static void main(String[] args) {
        //Declare collection and fill from the console
        Scanner scanner = new Scanner(System.in);

        //List<Integer> myCollection = new ArrayList<>(List.of(23, 1, -9, 5, 10, 12, 345, -3, 88, 1));
        List<Integer> myCollection = new ArrayList<>();
        System.out.println("Enter 10 integers (positive and negative numbers): ");
        for (int i = 0; i < 10; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            int number = scanner.nextInt();
            myCollection.add(number);
        }

        System.out.println("Initial collection: " + myCollection);

        //Swap the maximum and minimum elements in the list
        int maxNumber = Collections.max(myCollection);
        int minNumber = Collections.min(myCollection);

        int maxIndex = myCollection.indexOf(Collections.max(myCollection));
        int minIndex = myCollection.indexOf(Collections.min(myCollection));

        Collections.swap(myCollection, maxIndex, minIndex);

        System.out.println("Maximum element " + maxNumber + " and minimum element " + minNumber
                + " were swapped in collection: " + myCollection);

        //Insert a random three-digit number before the first negative element of the list
        Random rand = new Random();
        int randomThreeDigitNumber = rand.nextInt(100, 1000);

        for (Integer integer : myCollection) {
            if (integer < 0) {
                myCollection.add(myCollection.indexOf(integer), randomThreeDigitNumber);
                break;
            }
        }

        System.out.println("Updated collection with random three digit number " + randomThreeDigitNumber
                + " before the first negative number: " + myCollection);

        List<Integer> modifiedList = new ArrayList<>();

        for (int i = 0; i < myCollection.size() - 1; i++) {
            int current = myCollection.get(i);
            int next = myCollection.get(i + 1);

            modifiedList.add(current);

            if ((current >= 0 && next < 0) || (current < 0 && next >= 0)) {
                modifiedList.add(0);
            }
        }

        modifiedList.add(myCollection.getLast());
        myCollection = modifiedList;

        System.out.println("Modified List with zeros between different signs: " + myCollection);

        /* Copy the first k elements of the myCollection to the list1, in direct order, and the rest to the
         list2 in reverse order */
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int k = 5;

        for (int i = 0; i < k; i++) {
            list1.add(myCollection.get(i));
        }

        for (int i = myCollection.size() - 1; i >= k; i--) {
            list2.add(myCollection.get(i));
        }

        System.out.println("List 1 with first " + k + " elements in direct order: " + list1);
        System.out.println("List 2 with remaining elements in reverse order: " + list2);

        /* In a list myCollection remove the last even element (if there are even elements in the list). If
        there is no such element, display a message. */

        boolean foundEven = false;

        for (int i = myCollection.size() - 1; i >= 0; i--) {
            if (myCollection.get(i) % 2 == 0) {
                myCollection.remove(i);
                foundEven = true;
                break;
            }
        }

        if (!foundEven) {
            System.out.println("No even element found in the list.");
        }

        System.out.println("Modified list with the last even element removed: " + myCollection);

        /* Remove from the list myCollection the element following the first minimum. If the minimum
        element is the last one, nothing needs to be removed */
        minNumber = Collections.min(myCollection);
        minIndex = myCollection.indexOf(minNumber);

        if (!Objects.equals(myCollection.get(minIndex), myCollection.getLast())) {
            myCollection.remove(minIndex + 1);
        } else {
            System.out.println("The minimum element is the last element.");
        }

        System.out.println("Modified list with the element following the first minimum removed: " + myCollection);
    }
}
