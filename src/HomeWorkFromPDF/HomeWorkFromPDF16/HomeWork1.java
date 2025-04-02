/*
Create file1.txt file with a text about your career.
Read context from file into array of strings. Each array item contains one line from file.
Write in to the file2.txt
1) number of lines in file1.txt.
2) the longest line in file1.txt.
3) your name and birthday date.
*/

package HomeWorkFromPDF.HomeWorkFromPDF16;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class HomeWork1 {
    public static void main(String[] args) throws IOException{
        List<String> arrOfLinesFromFile1 = new ArrayList<>();

        Path myPath = Paths.get("src/HomeWorkFromPDF/HomeWorkFromPDF16/file1.txt");
        Path myPath2 = Paths.get("src/HomeWorkFromPDF/HomeWorkFromPDF16/file2.txt");

        if (Files.exists(myPath)){
            System.out.println("Файл 1 знайдено!");
            arrOfLinesFromFile1 = Files.readAllLines(myPath);
        } else {
            System.out.println("Файл 1 не знайдено(");
        }

        if (Files.exists(myPath2)){
            System.out.println("Файл знайдено!");
        } else {
            System.out.println("Файл не знайдено!");
            Files.createFile(myPath2);
        }

        int lineCount = arrOfLinesFromFile1.size();
        System.out.println("Кількість рядків: " + lineCount);

        String longestLine = arrOfLinesFromFile1.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse("Файл 1 порожній");

        System.out.println("Найдовший рядок: " + longestLine);

        String myInfo = "Ім'я: Адам Огороднік\nДата народження: 01.01.1990";

        List<String> file2Content = Arrays.asList(
                "Кількість рядків: " + lineCount,
                "Найдовший рядок: " + longestLine,
                myInfo
        );

        Files.write(myPath2, file2Content, StandardOpenOption.TRUNCATE_EXISTING);
        System.out.println("Дані записано у file2.txt!");


    }
}
