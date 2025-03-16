package com.softserve.edu.hw9;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collections;

public class Collection {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> myCollection = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            myCollection.add(random.nextInt(201) - 100);
        }
        System.out.println("Original list " + myCollection);

       int max = myCollection.indexOf(Collections.max(myCollection));
       int min = myCollection.indexOf(Collections.min(myCollection));
       Collections.swap(myCollection,max, min);
       System.out.println("list after swapping min and max values " + myCollection);

       int randomNumber = random.nextInt(900) + 100;
       for (int i = 0; i < myCollection.size(); i++) {
           if (myCollection.get(i) < 0) {
               myCollection.add(i, randomNumber);
               break;
           }
       }
        System.out.println("list after adding random number" + myCollection);

       for (int i = 0; i < myCollection.size() -1; i++) {
           if (myCollection.get(i) < 0 && myCollection.get(i +1) > 0 || myCollection.get(i) > 0 && myCollection.get(i +1) < 0) {
               myCollection.add(i+1, 0);
               i++;
               System.out.println(myCollection.size());
           }
       }
        System.out.println("list after adding 0 " + myCollection);
    }
}
