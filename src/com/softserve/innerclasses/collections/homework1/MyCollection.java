package com.softserve.innerclasses.collections.homework1;

import java.util.*;

public class MyCollection {

    public static List<Integer> GenerateListValues(){
        Random rand = new Random();
        List<Integer> randomList = new ArrayList<>(10);
        for (int j = 0; j<10; j++)
        {
            randomList.add(rand.nextInt(100 * 2 + 1) - 100);
        }
        return randomList;
    }

public static void SwapMinMax(List<Integer> list){
    Integer maximum = Collections.max(list);
    Integer maximumIndex = list.indexOf(maximum);
    Integer minimum = Collections.min(list);
    Integer minimumIndex = list.indexOf(minimum);
    System.out.println("The Maximum is " + maximumIndex + "th list element:" + maximum );
    System.out.println("The Minimum is " + minimumIndex + "th list element:" + minimum );
    Collections.swap(list,maximumIndex,minimumIndex);
    System.out.println("List with swapped Maximum and Minimum:" + list);
}

    public static void InsertThreeDigitsNumber(List<Integer> list){
        Random rand = new Random();
        Integer threeDigitsNumber =  rand.nextInt(999);
        Integer firstNegativeIndex =0;
        System.out.println("The random three-digits number is:" + threeDigitsNumber);
        for (Integer i: list){
            if(i<0){
                firstNegativeIndex = list.indexOf(i);
                break;
            }
        }
        System.out.println("First negative number is present at " +  firstNegativeIndex + "element");
        if(firstNegativeIndex == 0){
            list.set((firstNegativeIndex),threeDigitsNumber);
        }
        else {
            list.set((firstNegativeIndex-1),threeDigitsNumber);
        }
        System.out.println("Resulting list:" + list);
    }

    public static void InsertZeroesBetweenValuesWithDifferentSigns(List<Integer> list){
       for (int i=0; i< list.size()-1; i++){
           if((list.get(i) > 0 && list.get(i+1)<0)||
                   (list.get(i) < 0 && list.get(i+1)>0)) {
               list.add(i+1,0);
           }
       }
        System.out.println("Zeroes inserted between numbers with different signs" + list);
    }
    public static void SplitListInTwo(List<Integer> list) {
        Scanner sc = new Scanner(System.in);
        List<Integer> fistPartOfLIst = new ArrayList<>();
        List<Integer> secondPartOfLIst = new ArrayList<>();
        System.out.print("Enter a number of elements you want to copy from initial list");
        int numberOfElements = sc.nextInt();
        if (numberOfElements < list.size()){
            for (int i=0; i<numberOfElements; i++){
                fistPartOfLIst.add(list.get(i));
            }
        }
        System.out.println("First part of list " + fistPartOfLIst);
         for (int j=numberOfElements +1; j < list.size(); j++){
             secondPartOfLIst.add(list.get(j));
        }
        Collections.reverse(secondPartOfLIst);
        System.out.println("Second part of list in reverse order " + secondPartOfLIst);
    }
    public static void RemoveLastEvenElement(List<Integer> list) {
        List<Integer>  even = new ArrayList<>();
        System.out.println("Initial list " + list);
        for (int i = 0; i < list.size() - 1; i++) {
            if ((list.get(i) % 2 == 0) &&(list.get(i)!=0)) {
                even.add(list.get(i));
            }
        }
        System.out.println("The last even element: " + even.get(even.size()-1) + " was removed");
        Integer toBeRemoved= even.get(even.size()-1);
        list.remove(toBeRemoved);
        System.out.println(list);
        if (even.size() == 0){
            System.out.println("No even numbers found");
        }
    }

    public static void RemoveElementNextToFirstMin(List<Integer> list) {
        Integer minimum = Collections.min(list);
        System.out.println("Initial list " + list);
        System.out.println("Number " + list.get(list.indexOf(minimum)+1) +
                " following by minimum: " + list.get(list.indexOf(minimum)) + " was removed");
        if (list.indexOf(minimum) < list.size()){
            list.remove(list.indexOf(minimum) +1);
        }
        System.out.println(list);
    }
}
