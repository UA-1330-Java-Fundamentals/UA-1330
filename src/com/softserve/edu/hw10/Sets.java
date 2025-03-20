package com.softserve.edu.hw10;

import java.util.HashSet;
import java.util.Set;

public class Sets {

    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> setUnion = new HashSet<>(set1);
        setUnion.addAll(set2);
        return setUnion;
    }

    public static Set<Integer> intersect(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> setIntersect = new HashSet<>(set1);
        setIntersect.retainAll(set2);
        return setIntersect;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(4);
        set1.add(3);
        set1.add(8);

        Set<Integer> set2 = new HashSet<>();
        set2.add(10);
        set2.add(8);

        Set<Integer> setUnion = union(set1,set2);
        Set<Integer> setIntersect = intersect(set1,set2);
        System.out.println(setUnion);
        System.out.println(setIntersect);


    }
}
