package com.softserve.collections2.homeworks123;

import java.util.*;

public class SetsMethods {
    public static Set<Integer> FillSetWithData(Set<Integer> set){
        Random rand = new Random();
        Set<Integer> randomList = new HashSet<>(5);
        for (int j = 0; j<5; j++)
        {
            randomList.add(rand.nextInt(10 * 2 + 1) - 10);
        }
        return randomList;
    }
    public static Set<Integer> SetsUnion(Set<Integer> set1,Set<Integer>set2){
        set1.addAll(set2);
        return set1;
    }
    public static Set<Integer> SetsIntersection(Set<Integer> set1,Set<Integer> set2){
        set1.retainAll(set2);
        return set1;
    }
}
