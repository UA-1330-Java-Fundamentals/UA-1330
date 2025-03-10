package com.softserve.edu.homework9_Collections_Part1.task1;

import java.util.ArrayList;
import java.util.List;


import static com.softserve.edu.homework9_Collections_Part1.task1.CollectionUtil.*;
//import static com.softserve.edu.homework9_Collections_Part1.task1.CollectionUtil.swapMinMax;

public class Main {

    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            myCollection.add((int) ((Math.random() * (100 - (-100))) + (-100)));
        }

        System.out.println("Original collection: " + myCollection);

//        swapMinMax(myCollection);
//        System.out.println("Collection with swapped min and max numbers: " + myCollection);
//
//        addRandomNumberBeforeFirstNegative(myCollection);
//        System.out.println("Added number before negative: " + myCollection);
//
//        insertZeroBetweenDifferentSigns(myCollection);
//        System.out.println("Add 0 between positive and negative" + myCollection);

//        copyElementsIntoSeparateLists(myCollection, 4);

//        removeLastEvenElement(myCollection);
//        System.out.println(myCollection);

        removeElementAfterFirstMin(myCollection);
        System.out.println(myCollection);

    }




}
