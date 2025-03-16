package com.softserve.edu.HW9Collection;

import java.util.ArrayList;
import java.util.List;

public class MainMyCollection {
    public static void main(String[] args) {
        //Call method of the collection creating and print initial collection
        List<Integer> myCollection = CollectionProcessing.fillingListRandomly(10);
        System.out.println("Original list " + myCollection);

        //call the method to swap Max and Min
        CollectionProcessing.swapMaxMin(myCollection);

        //call the method to insert random 3-digits number before the first negative
        CollectionProcessing.insertRandom(myCollection);

        //call the method to insert zero between two numbers with different signs
        CollectionProcessing.insertZero(myCollection);

        //call the method to split list into 2 list1 in direct order and list 2 in reverse order
        CollectionProcessing.copyKelementsdirectly(myCollection, 7);

        //call the method to remove the last even element (if it is there)
        CollectionProcessing.removeLastEvenEl(myCollection);

        //call the method to remove the last even element (if it is there)
        CollectionProcessing.removeAfterMin(myCollection);

    }
}
