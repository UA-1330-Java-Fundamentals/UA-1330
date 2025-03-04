package com.softserve.collections2.homeworks123;

import java.util.HashSet;
import java.util.Set;

public class ApplSets {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> unionResult = new HashSet<>();
        Set<Integer> intersectionResult = new HashSet<>();
        set1 = SetsMethods.FillSetWithData(set1);
        System.out.println("Set 1:" + set1);
        set2 = SetsMethods.FillSetWithData(set2);
        System.out.println("Set 2:" + set2);
        unionResult = SetsMethods.SetsUnion(set1,set2);
        System.out.println("Resuls of sets union:" + unionResult);
        intersectionResult = SetsMethods.SetsIntersection(set1,set2);
        System.out.println("Resuls of sets intersection:" + intersectionResult);
    }
}
