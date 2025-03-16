package com.softserve.edu.HW9Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

//method that create and fill a List
public class CollectionProcessing {
    public static List<Integer> fillingListRandomly(int size) {
        List<Integer> myCollection = new ArrayList<>();
        Random random = new Random();

        for (int i=0; i < size; i++) {
            myCollection.add(random.nextInt(201)-100);
        }
        return myCollection;
    }
    //method swap max with min
    public static void swapMaxMin (List<Integer> myCollection) {
        int max = Collections.max(myCollection);
        System.out.println("Max is: " + max);
        int min = Collections.min(myCollection);
        System.out.println("Min is: " + min);
        int indexMax = myCollection.indexOf(max);
        int indexMin = myCollection.indexOf(min);
        myCollection.set(indexMax, min);
        myCollection.set(indexMin, max);
        System.out.println("Updated collection with swap Max and Min: " + myCollection);
    }

    //method insert a random three-digit number before the first negative element of the list
    public static void insertRandom (List<Integer> myCollection) {
        boolean foundNegative = false;

        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                Random random = new Random();
                int randomThreeDigit = random.nextInt(100, 1000);
                myCollection.add(i, randomThreeDigit);
                foundNegative = true;
                System.out.println("New collection with a random 3-digit inserted number: " + myCollection);
                break;
            }
        }
        //condition when there is no negative numbers
        if (!foundNegative) {
            System.out.println("There is no negative numbers, so the random number is NOT inserted");
        }
    }

    //insert a zero between all neigboring elements collection myCollection with different signs
    public static void insertZero(List<Integer> myCollection) {
        boolean isNegative = false;

        for (int i = 0; i < myCollection.size()-1; ) {
            if (((myCollection.get(i) < 0) && (myCollection.get(i+1) > 0)) || ((myCollection.get(i) > 0) && (myCollection.get(i+1) < 0))) {
                myCollection.add(i+1, 0);
                i+=2;
            } else {
                i++;
            }
        }
        System.out.println("New collection with inserted zero: " + myCollection);
    }

    public static void copyKelementsdirectly(List<Integer> myCollection, int k ) {
        if (k < myCollection.size()) {
            List<Integer> list1 = new ArrayList<>(myCollection.subList(0, k));
            List<Integer> list2 = new ArrayList<>(myCollection.subList(k, myCollection.size()));
            Collections.reverse(list2);
            System.out.println("\t\tList1 in direct order up to k elements:" + list1);
            System.out.println("\t\tList2 in reverse order from k elements:" + list2);

        } else {
            System.out.println("You enter invalid k number. K number should be less " + myCollection.size());
        }
    }

    public static void removeLastEvenEl(List<Integer> myCollection) {
        boolean isEvenFound = false;
        for (int i = myCollection.size()-1; i >= 0; i--) {
            if (myCollection.get(i)%2 == 0) {
                myCollection.remove(i);
                System.out.println("My collection without last even element: " + myCollection);
                isEvenFound = true;
                break;
            }
        }
        if (!isEvenFound) {
            System.out.println("The are no even elements");
        }
    }

    public static void removeAfterMin(List<Integer> myCollection) {
        boolean isMinFound = false;
        int min = Collections.min(myCollection);
        System.out.println("First Min element is: " + min);
        int minIndex = myCollection.indexOf(min);
            if (minIndex != myCollection.size() - 1) {
                myCollection.remove(minIndex + 1);
                isMinFound = true;
                System.out.println("My collection with removed element after 1st Min: " + myCollection);
            }
        if (!isMinFound) {
            System.out.println("There is no needs to removed");
        }
    }
}
