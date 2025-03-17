package com.softserve.edu.hw9;

import java.util.*;

public class Collection {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> myCollection = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
           myCollection.add(random.nextInt(201) - 100);
        }
        System.out.println("Original list " + myCollection);

        //
        int max = myCollection.indexOf(Collections.max(myCollection));
        int min = myCollection.indexOf(Collections.min(myCollection));
        Collections.swap(myCollection, max, min);
        System.out.println("list after swapping min and max values " + myCollection);

        //
        int randomNumber = random.nextInt(900) + 100;
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                myCollection.add(i, randomNumber);
                break;
            }
        }
        System.out.println("list after adding random number " + myCollection);

        //
        for (int i = 0; i < myCollection.size() - 1; i++) {
            if (myCollection.get(i) < 0 && myCollection.get(i + 1) > 0 || myCollection.get(i) > 0 && myCollection.get(i + 1) < 0) {
                myCollection.add(i + 1, 0);
                i++;
            }
        }
        System.out.println("list after adding 0 " + myCollection);

        //
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int k = 6;

        for (int i = 0; i < k; i++) {
            list1.add(myCollection.get(i));
        }
        System.out.println("list1 = " + list1);


        for (int i = myCollection.size() - 1; i > k-1; i--) {
            list2.add(myCollection.get(i));
        }
        System.out.println("list2 = " + list2);

        //
        int evenNumber = -1;
        for (Integer current : myCollection) {
            if (current % 2 == 0) {
                evenNumber = current;
            }
        }
        if (evenNumber != -1) {
            int index = myCollection.indexOf(evenNumber);
            myCollection.remove(index);
            System.out.println("list after removing the last even number" + myCollection);
        } else {
            System.out.println("There is no an even number in the list");
        }

        //
        for (int current : myCollection) {
            if (current < 0 && myCollection.indexOf(current) < myCollection.size() - 1) {
                myCollection.remove(myCollection.indexOf(current) + 1);
                break;
            }
        }
        System.out.println("list after removing the number after first min " + myCollection);
    }
}

