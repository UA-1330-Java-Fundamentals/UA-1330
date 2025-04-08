package homework16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Comparator;

/*
Create file1.txt file with a text about your career.
Read context from file into array of strings. Each array item contains one line from file.
Write in to the file2.txt
1) number of lines in file1.txt.
2) the longest line in file1.txt.
3) your name and birthday date.
 */
public class Task1 {
    public static void main(String[] args) throws IOException {
        String filename = "C:/Users/Карина/Desktop/pdf/file1.txt";
        var path = Path.of(filename);

        //System.out.println(Files.exists(path));
        String[] lines = Files.readAllLines(path)
                .toArray(String[]::new);

        String longestLine = Arrays.stream(lines)
                .max(Comparator.comparing(String::length))
                .orElse("No lines in file");

        String newFilename = "C:/Users/Карина/Desktop/pdf/file2.txt";
        var newPath = Path.of(newFilename);

        String name = "Karyna";
        String birthday = "18.10.1996";

        StringBuilder result = new StringBuilder();
        result.append("1) Number of lines in file1.txt: ").append(lines.length).append(System.lineSeparator());
        result.append("2) The longest line in file1.txt: ").append(longestLine).append(System.lineSeparator());
        result.append("3) Name: ").append(name).append(", Birthday: ").append(birthday).append(System.lineSeparator());



        Files.writeString(newPath, result.toString(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);

        System.out.println("Result is written to new file successfully!");
    }
}
