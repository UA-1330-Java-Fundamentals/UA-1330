/*
For given collection
List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
calculate count, min, max, sum, for numbers and print all results
*/

package HomeWorkFromPDF.HomeWorkFromPDF14;

import java.util.Arrays;
import java.util.List;

public class PracticalTask2 {
    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);

        long count = primes.stream()
                .count();
        System.out.println("Count:" + count);


        int min = primes.stream()
                .min(Integer::compareTo)
                .orElseThrow();
        System.out.println("Min:" + min);

        int max = primes.stream()
                .max(Integer::compareTo)
                .orElseThrow();
        System.out.println("Max:" + max);

        int sum = primes.stream()
                .reduce(0, (total, current) -> total + current);
        System.out.println("Sum:" + sum);
    }
}
