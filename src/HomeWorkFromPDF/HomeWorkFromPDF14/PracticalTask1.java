/*
Suppose you have next list
List<String> list = Arrays.asList("bla", "", "simp",
"", "second", "third", "third", "sec", "blablabla");
• Print how many empty strings are in this list
• Remove all empty Strings from list and print the result
• Convert String to uppercase and Join them with coma. Print the result
*/

package HomeWorkFromPDF.HomeWorkFromPDF14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PracticalTask1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("bla", "", "simp", "", "second", "third", "third", "sec", "blablabla");

        long countEmptySpaces = list.stream()
                .filter(st -> st.isEmpty())
                .count();
        System.out.println("У даному масиві є " + countEmptySpaces + " пустих стрічок");

        List<String> listWithoutEmptyStrings = list.stream()
                .filter(st -> !st.isEmpty())
                .toList();
        System.out.println("Список без пустих стрінгів: " + listWithoutEmptyStrings);

        String listUpperCase = list.stream()
                        .filter(st -> !st.isEmpty())
                        .map(st -> st.toUpperCase())
                        .collect(Collectors.joining(", "));
        System.out.println("Список без пустих стрінгів: " + listUpperCase);


    }
}
