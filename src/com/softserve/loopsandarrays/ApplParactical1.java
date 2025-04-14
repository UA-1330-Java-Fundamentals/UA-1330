package com.softserve.loopsandarrays;

public class ApplParactical1 {
    public static void main(String[] args) {
        int[] myArray = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        Practical1.sortAsc(myArray);
         
        for (int i :myArray){
            System.out.println(i);
        }
    }
}
