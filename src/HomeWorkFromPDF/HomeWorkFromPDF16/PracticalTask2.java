/*
Prepare a file with text:
1) find and output to the console all words starting with a vowel.
2) find and output to the console all words for which the last letter of one word
matches the first letter of the next word.
*/

package HomeWorkFromPDF.HomeWorkFromPDF16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class PracticalTask2 {
    public static void main(String[] args) throws IOException {
        List<String> array = new ArrayList<>();
        List<String> words = new ArrayList<>();

        Path myPath = Paths.get("src/HomeWorkFromPDF/HomeWorkFromPDF16/mytext.txt");
        if (Files.exists(myPath)) {
            List<String> lines = Files.readAllLines(myPath);
            System.out.println("Файл зчитано успішно!\n");

            for (String line : lines) {
                words.addAll(Arrays.asList(line.split("\\s+")));
            }

            words.forEach(System.out::println);
        } else {
            System.out.println("Файлу немає\n");
        }

        List<String> prefixes = Arrays.asList("A", "E", "I", "O", "U", "a", "e", "i", "o", "u");
        words.stream()
                .filter(word -> prefixes.stream().anyMatch(word::startsWith))
                .forEach(System.out::println);

        for (int i = 0; i < words.size() - 1; i++){
            String word1 = words.get(i);
            String word2 = words.get(i + 1);

            if ((word1.charAt(word1.length() - 1) ) ==  word2.charAt(0)){
                System.out.println(word1);
                System.out.println(word2);
            }
        }

    }
}
