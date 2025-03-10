package com.softserve.edu.homework9_Collections_Part1.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionUtil {

    public static void swapMinMax(List<Integer> list) {
        Integer min, max;
        int minPosition, maxPosition;

        min = Collections.min(list);
        minPosition = list.indexOf(min);

        max = Collections.max(list);
        maxPosition = list.indexOf(max);

        Collections.swap(list, minPosition, maxPosition);
    }

    public static void addRandomNumberBeforeFirstNegative(List<Integer> list) {

        int randomThreeDigitNumber = (int) ((Math.random() * (999 - (100))) + (100));
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                list.add(i, randomThreeDigitNumber);
                break;
            }
        }
    }

    public static void insertZeroBetweenDifferentSigns(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) * list.get(i + 1) < 0) {
                list.add(i + 1, 0);
                i++;
            }
        }
    }

    public static void copyElementsIntoSeparateLists(List<Integer> list, int k) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < list.size() - 1; i++) {
            if (i <= k - 1) {
                list1.add(list.get(i));
            } else {
                list2.add(list.get(i));
            }
        }

        System.out.println("List 1: " + list1);
        System.out.println("List 2 :" + list2);
    }

    public static void removeLastEvenElement(List<Integer> list) {
        boolean found = false;

        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No even element found.");
        }
    }

    public static void removeElementAfterFirstMin(List<Integer> list) {
        Integer min;
        int minPosition;

        min = Collections.min(list);
        minPosition = list.indexOf(min);

        if (minPosition != list.size() - 1) {
            list.remove(minPosition+1);
        }
    }

}
