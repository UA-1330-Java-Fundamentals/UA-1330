package com.softserve.edu.homework_9.tasks_from_quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionMerger {
    public static List<String> mergeAndSortLists(List<String> list1, List<String> list2) {
        // TODO: Implement logic to merge and sorts elements without duplicates
        if (list1 == null) list1 = new ArrayList<>();
        if (list2 == null) list2 = new ArrayList<>();

        List<String> mergedList = new ArrayList<>();
        mergedList.addAll(list1);
        mergedList.addAll(list2);

        List<String> resultList = new ArrayList<>();
        for (String element : mergedList) {
            if (!resultList.contains(element)) {
                resultList.add(element);
            }
        }

        //sort
        Collections.sort(resultList);

        return resultList;// Placeholder return statement
    }

    public static void main(String[] args) {
        List<String> list1 = List.of("apple", "banana");
        List<String> list2 = List.of("banana", "cherry");

        System.out.println(mergeAndSortLists(list1, list2));
    }
}
