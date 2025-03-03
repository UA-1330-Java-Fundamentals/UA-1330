package com.softserve.innerclasses.collections.homework1;

import java.util.*;

public class ApplCollection {
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>();
        myCollection.addAll(MyCollection.GenerateListValues());
        System.out.println("You have next list: " + myCollection);
        MyCollection.SwapMinMax(myCollection);
        MyCollection.InsertThreeDigitsNumber(myCollection);
        MyCollection.InsertZeroesBetweenValuesWithDifferentSigns(myCollection);
        MyCollection.SplitListInTwo(myCollection);
        MyCollection.RemoveLastEvenElement(myCollection);
        MyCollection.RemoveElementNextToFirstMin(myCollection);
    }
}
