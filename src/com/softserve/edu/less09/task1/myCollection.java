package com.softserve.edu.less09.task1;

import java.util.*;
import java.util.stream.Collectors;


public class myCollection {
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>();
        Random generateNumber = new Random();
        for (int i = 0; i < 5; i++) {
            int randNumber = generateNumber.nextInt(100) + 1;
            myCollection.add(randNumber);
        }

        myCollection.forEach(System.out::println);
        System.out.println("Swap the maximum and minimum elements in the list");
        Integer min = myCollection.stream().min(Integer::compareTo).get();
        Integer max = myCollection.stream().max(Integer::compareTo).get();
        Collections.swap(myCollection, myCollection.indexOf(min), myCollection.indexOf(max));
        myCollection.forEach(System.out::println);

        System.out.println("Copy the first k elements of the myCollection to the list1, in direct order, and the rest to the list2 in reverse order.");
        List<Integer> list1 = new ArrayList<>(myCollection.subList(0, 3)
                .stream().toList());
        list1.forEach(System.out::println);
        System.out.println("\n");
        List<Integer> list2 = new ArrayList<>(myCollection.subList(4, 5)
                .stream().toList().reversed());
        list2.forEach(System.out::println);
        System.out.println("In a list myCollection remove the last even element (if there are even elements in the list). If\n" +
                "there is no such element, display a message");
        List<Integer> even = myCollection.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        even.forEach(System.out::println);
        System.out.println("\n");
        if (even.isEmpty()) {
            System.out.println("even is empty");
        } else {
            even.removeLast();
        }
        even.forEach(System.out::println);
        System.out.println("Remove from the list myCollection the element following the first minimum. If the minimum\n" +
                "element is the last one, nothing needs to be removed.");

        List<Integer> newCollection = new ArrayList<>();
        Random gNumber = new Random();
        for (int i = 0; i < 5; i++) {
            int randNumber = gNumber.nextInt(100) + 1;
            newCollection.add(randNumber);
        }
        newCollection.forEach(System.out::println);
        System.out.println("\n");
        min = newCollection.stream().min(Integer::compareTo).get();
        if (min.equals(myCollection.getLast())) {
            System.out.println("the minimum\n" +
                    "element is the last one");
        } else {
            int indexOfmin = newCollection.indexOf(min);
            Integer remove = newCollection.remove(++indexOfmin);
        }
        newCollection.forEach(System.out::println);

    }
}
