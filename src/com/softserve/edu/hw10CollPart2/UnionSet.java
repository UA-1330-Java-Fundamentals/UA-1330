package com.softserve.edu.hw10CollPart2;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class UnionSet {
    //method to union two set without duplicating
    public <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Objects.requireNonNull(set1, "Set1 can not be Null");
        Objects.requireNonNull(set2, "Set2 can not be null");
        Set<T> setUnion = new HashSet<>(set1);
        setUnion.addAll(set2);
        return setUnion;
    }
//method of intersection of two sets
    public <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Objects.requireNonNull(set1, "Set1 can not be Null");
        Objects.requireNonNull(set2, "Set2 can not be null");

        Set<T> setIntersect = new HashSet<>(set1);
        setIntersect.retainAll(set2);
        return setIntersect;
    }

    public static void main(String[] args) {
        UnionSet setUnionOrIntersect = new UnionSet();

        Set<String> set1 = new HashSet<>();
        Collections.addAll(set1, "first", "second", "Six");
        System.out.println("Inintial set1 " + set1);

        Set<String> set2 = new HashSet<>();
        Collections.addAll(set2, "six", "five", "second");
        System.out.println("Inintial set2 " + set2);

        //lowercase for comparison result = one object regardless of lowercase or uppercase
        Set<String> lowerSet1 = new HashSet<>();
        for (String s : set1) {
            lowerSet1.add(s.toLowerCase());
        }
        Set<String> lowerSet2 = new HashSet<>();
        for (String s : set2) {
            lowerSet2.add(s.toLowerCase());
        }

        try {
            Set<String> unionResultSet = setUnionOrIntersect.union(lowerSet1, lowerSet2);
            System.out.println("Union set is: " + unionResultSet);
        } catch (NullPointerException e) {
            System.out.println("Error while doing Union operation:" + e.getMessage());
        }

        try {
            Set<String> intersectResultSet = setUnionOrIntersect.intersect(lowerSet1, lowerSet2);
            System.out.println("Intersect set is: " + intersectResultSet);
        } catch (NullPointerException e) {
            System.out.println("Error while doing Intersection operation:" + e.getMessage());
        }

        System.out.println(" ");

        //testing Null exception
        try {
            setUnionOrIntersect.union(null, set2);
        } catch (NullPointerException e) {
            System.out.println("Test with Null in Union method: " + e.getMessage());
        }

        try {
            setUnionOrIntersect.intersect(set1, null);
        } catch (NullPointerException e) {
            System.out.println("Test with Null in Intersection method: " + e.getMessage());
        }
    }
}
