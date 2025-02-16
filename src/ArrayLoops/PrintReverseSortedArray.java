package ArrayLoops;

import java.util.Arrays;

public class PrintReverseSortedArray {
    public static void main(String[] args) {
        int[] array = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        printReverseSortedArray(array);
    }

    private static void printReverseSortedArray(int[] array) {
        //TODO
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
       for (int i = array.length - 1; i >= 0; i--) {
           System.out.print(array[i] + " ");
       }
    }


}
