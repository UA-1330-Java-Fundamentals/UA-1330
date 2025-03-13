package hw9.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static int findFirstNegativeIndex(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < 0) {
                return i;
            }
        }
        return -1;
    }

    public static void insertZeros(List<Integer> numbers) {
        for (int i = 0; i < numbers.size() - 1; i++) {
            if ((numbers.get(i) < 0 && numbers.get(i + 1) > 0) || (numbers.get(i) > 0 && numbers.get(i + 1) < 0)) {
                numbers.add(i + 1, 0);
            }
        }
    }

    public static void printSubLists(List<Integer> numbers, int k) {
        List<Integer> newList1 = numbers.subList(0, k);
        List<Integer> newList2 = numbers.subList(k, numbers.size());
        Collections.reverse(newList2);
        System.out.println(newList1);
        System.out.println(newList2);

    }

    public static void removeLastEven(List<Integer> numbers) {
        int lastEvenNumberIndex = -1;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                lastEvenNumberIndex = i;
            }
        }
        if  (lastEvenNumberIndex >= 0) {
            numbers.remove(lastEvenNumberIndex);
        }
        else
            System.out.println("The last element is not even.");
    }



    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>();
        myCollection.add(6);
        myCollection.add(99);
        myCollection.add(910);
        myCollection.add(666);
        myCollection.add(989);
        myCollection.add(-907);
        myCollection.add(68);
        myCollection.add(-199);
        myCollection.add(290);
        myCollection.add(-920);
        System.out.println(myCollection);

        Integer min = Collections.min(myCollection);
        int minIndex = myCollection.indexOf(min);

        Integer max = Collections.max(myCollection);
        int maxIndex = myCollection.indexOf(max);

        Collections.swap(myCollection, minIndex, maxIndex);
        System.out.println(myCollection);

        int negativeIndex = findFirstNegativeIndex(myCollection);
        myCollection.add(negativeIndex, 199);
        System.out.println(myCollection);

        insertZeros(myCollection);
        System.out.println(myCollection);

        printSubLists(myCollection, 5);

        removeLastEven(myCollection);
        System.out.println(myCollection);
    }
}
