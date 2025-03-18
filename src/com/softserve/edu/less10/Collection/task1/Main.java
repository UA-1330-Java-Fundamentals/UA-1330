package com.softserve.edu.less10.Collection.task1;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        System.out.println(set1);
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(5);
        System.out.println(set2);
        Set<Integer> un = union(set1, set2);
        System.out.println(un);
        Set<Integer> in = intersection(set1, set2);
        System.out.println(in);


    }

    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> set = new HashSet<T>(set1);
        set.addAll(set2);
        return set;
    }

    public static <T> Set<T> intersection(Set<T> set1, Set<T> set2) {
        Set<T> set = new HashSet<T>(set1);
        set.retainAll(set2);
        return set;
    }

}
