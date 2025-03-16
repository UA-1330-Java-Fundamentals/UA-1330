package com.softserve.edu.homework10_Collections_Part2.task1;

/*
Develop parameterized methods union(Set set1, Set set2) and intersect(Set set1, Set
set2), realizing the operations of union and intersection of two sets. Test the operation
of these techniques on two pre-filled sets.
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetsUnionAndIntersection {

    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    public static <T> Set<T> intersection(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));


        Set<Integer> unionSet = union(set1, set2);
        System.out.println("Union: " + unionSet);

        Set<Integer> intersectSet = intersection(set1, set2);
        System.out.println("Intersection: " + intersectSet); // Output: [3,
    }
}
