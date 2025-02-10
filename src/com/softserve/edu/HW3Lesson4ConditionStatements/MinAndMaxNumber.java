package com.softserve.edu.HW3Lesson4ConditionStatements;

public class MinAndMaxNumber {

    public static int findMinNumberBetweenThree(int n1, int n2, int n3) {
        if (isAllEqual(n1, n2, n3)) {
            System.out.println("All numbers are equal");
            return n1;
        }
        if (n1 < n2 && n1 < n3) {
            return n1;
        } else if (n2 < n1 && n2 < n3) {
            return n2;
        } else {
            return n3;
        }

    }

    public static int findMaxNumberBetweenThree(int n1, int n2, int n3) {
        if (isAllEqual(n1, n2, n3)) {
            System.out.println("All numbers are equal");
            return n1;
        }
        if (n1 > n2 && n1 > n3) {
            return n1;
        } else if (n2 > n1 && n2 > n3) {
            return n2;
        } else {
            return n3;
        }
    }

    //ця перевірка додалася щоб скоротити роботу методів findMinNumberBetweenThree та findMaxNumberBetweenThree на випадок коли всі числа рівні
    private static boolean isAllEqual(int n1, int n2, int n3) {
        return n1 == n2 && n2 == n3;
    }
}
