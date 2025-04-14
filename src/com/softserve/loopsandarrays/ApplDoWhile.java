package com.softserve.loopsandarrays;

import java.util.Scanner;

public class ApplDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result;
        do {
            System.out.println(DoWhileWork.sumOfEnteredNumbers(sc));
            System.out.println("Do you want to calculate sum for new pair of numbers? yes/no");
            result = sc.next();
        } while (result.equals("yes"));

        sc.close();
    }

}
