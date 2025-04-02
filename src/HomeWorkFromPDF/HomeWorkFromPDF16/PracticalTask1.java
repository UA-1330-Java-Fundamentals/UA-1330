/*
Prepare mytext.txt file with a lot of text inside.
Read context from file into array of strings.
Each array item contains one line from file.
Complete next tasks:
1) count and write the number of symbols in every line.
2) find the longest and the shortest line.
3) find and write only that lines, which consist of word «var»
*/

package HomeWorkFromPDF.HomeWorkFromPDF16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PracticalTask1 {
    public static void main(String[] args) throws IOException {
        List<String> array = new ArrayList<>();

        Path myPath = Paths.get("src/HomeWorkFromPDF/HomeWorkFromPDF16/mytext.txt");
        if (Files.exists(myPath)) {
            array = Files.readAllLines(myPath);
            System.out.println("Файл зчитано успішно!\n");
        } else {
            System.out.println("Файлу немає\n");
        }

        array.forEach(System.out::println);

        List<Integer> arrayLen = new ArrayList<>();
        System.out.print("\n");
        array.forEach(line -> arrayLen.add(line.length()));
        arrayLen.forEach(line -> System.out.print(line + " "));

        Optional<Integer> maxLen = arrayLen.stream().max(Integer::compareTo);
        maxLen.ifPresent(max -> System.out.println("\nМаксимальна довжина рядка: " + max));

        Optional<Integer> minLen = arrayLen.stream().min(Integer::compareTo);
        minLen.ifPresent(min -> System.out.println("\nМінімальна довжина рядка: " + min));

        List<String> containsVar = array.stream().filter(line -> line.contains("var")).toList();
        containsVar.forEach(System.out::println);
    }
}
