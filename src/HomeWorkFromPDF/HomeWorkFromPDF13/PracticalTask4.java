/*
Create array Integers which has 10 elements, create method count() that takes an array
of integers as the first parameter and functional interface as the second parameter,
that functional interface works with integers and defines a condition. Method count()
return count of elements in array that satisfy the condition defined by the second
argument.
*/

package HomeWorkFromPDF.HomeWorkFromPDF13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticalTask4 {
    @FunctionalInterface
    interface FunctionalInterfaceCount{
        Integer funcCount(List<Integer> array);
    }

    public static int count(List<Integer> array, FunctionalInterfaceCount f){
        return f.funcCount(array);
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0));

        int res = count(arr, new FunctionalInterfaceCount(){
            @Override
            public Integer funcCount(List<Integer> array){
                int sum = 0;
                for (int num : array){
                    sum += num;
                }
                return sum;
            }
        });

//        int res = count(arr, array -> {
//            int sum = 0;
//            for (int num : array){
//                sum += num;
//            }
//            return sum;
//        });

        System.out.println(res);
    }
}
