package homework9;
/*
Create a method that accepts two lists of type List<String> and returns a combined list of all elements from both lists without duplicates, sorted in lexicographical order.

Requirements:

The method should handle null lists gracefully by treating them as empty lists.
Elements that appear in both lists should only be present once in the resulting list.
The result should be sorted in lexicographical order (alphabetically).
Method Signature:

public static List<String> mergeAndSortLists(List<String> list1, List<String> list2)


Example:

Input:
list1: ["apple", "banana"]
list2: ["banana", "cherry"]
Output: ["apple", "banana", "cherry"]
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionMerger {

    public static List<String> mergeAndSortLists(List<String> list1, List<String> list2) {

        if (list1 == null){
            list1 = new ArrayList<>();
        }
        
        if (list2 == null){
            list2 = new ArrayList<>();
        }
        //The check can be replaced with a more concise one.
        //list1 = Objects.requireNonNullElse(list1, new ArrayList<>());
       //list2 = Objects.requireNonNullElse(list2, new ArrayList<>());

        List<String> mergedList = new ArrayList<>();

        for ( String i : list1){
            if(! mergedList.contains(i)){
                mergedList.add(i);
            }
        }
        for ( String k : list2){
            if(! mergedList.contains(k)){
                mergedList.add(k);
            }
        }
        Collections.sort(mergedList);

        return mergedList; // Placeholder return statement
    }
}

