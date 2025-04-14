package com.softserve.collections2.homeworks123;

import java.util.*;

public class SetsMethods {
    /*
  The parameter set is unused.  
  There is a possibility of returning a set with fewer than 5 elements due to the uniqueness constraint in  HashSet.
    */
    public static Set<Integer> FillSetWithData(Set<Integer> set){//fill...
        Random rand = new Random();
        Set<Integer> randomList = new HashSet<>(5);
        for (int j = 0; j<5; j++) {
            randomList.add(rand.nextInt(10 * 2 + 1) - 10);
        }
        return randomList;
    }
    /*
    The method modifies set1, which is a side effect. In mathematics and programming, set union typically does not modify the original sets but returns a new one.
     If set1 or set2 is null, a NullPointerException will occur.
    */
    public static Set<Integer> SetsUnion(Set<Integer> set1,Set<Integer>set2){
        set1.addAll(set2);
        return set1;
    }
    public static Set<Integer> SetsIntersection(Set<Integer> set1,Set<Integer> set2){
        set1.retainAll(set2);
        return set1;
    }
}
/*
public class SetsMethods {
    private static final Random RAND = new Random();

    public static Set<Integer> fillSetWithData() {
        Set<Integer> randomSet = new HashSet<>(5);
        for (int j = 0; j < 5; j++) {
            randomSet.add(RAND.nextInt(21) - 10); // -10 до 10
        }
        return randomSet;
    }

    public static Set<Integer> setsUnion(Set<Integer> set1, Set<Integer> set2) {
        if (set1 == null || set2 == null) {
            throw new IllegalArgumentException("Input sets cannot be null");
        }
        Set<Integer> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    public static Set<Integer> setsIntersection(Set<Integer> set1, Set<Integer> set2) {
        if (set1 == null || set2 == null) {
            throw new IllegalArgumentException("Input sets cannot be null");
        }
        Set<Integer> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }
*/
