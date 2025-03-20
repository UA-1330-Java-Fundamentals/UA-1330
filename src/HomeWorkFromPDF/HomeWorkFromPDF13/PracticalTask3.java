/*
Write a method for sorting list of Strings using Java 8
*/

package HomeWorkFromPDF.HomeWorkFromPDF13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PracticalTask3 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 3, 2, 4, 5));
        System.out.println(arr);

        arr.sort(Comparator.naturalOrder());
        System.out.println(arr);

        //OR

//        List<Integer> arrSorted = arr.stream().sorted().collect(Collectors.toList());
//        System.out.println(arrSorted);
    }
}
