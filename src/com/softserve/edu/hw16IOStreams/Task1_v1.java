package com.softserve.edu.hw16IOStreams;
/*
Create file1.txt file with a text about your career.
Read context from file into array of strings. Each array item contains one line from file.
Write in to the file2.txt
   1) number of lines in file1.txt.
   2) the longest line in file1.txt.
   3) your name and birthday date.
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task1_v1 {
    public static void main(String[] args) {
        String filename1 = "/Users/elena/Desktop/file1.txt";
        String filename2 = "/Users/elena/Desktop/file2.txt";

        try {
            var path1 = Path.of(filename1);

            if (Files.exists(path1)) {
                String[] lines = Files.readAllLines(path1).toArray(String[]::new);

                //print file1.txt
                System.out.println("File1.txt:");
                for (String line : lines) {
                    System.out.println(line);
                }

                // Finding the longest line in file1.txt
                String longestLine = Arrays.stream(lines)
                        .max(Comparator.comparing(String::length))
                        .orElse("No content found");

                // Finding the number of lines in file1.txt
                int numberOfLines = lines.length;

                //Notice about name and birthday date
                String nameAndBirthday = " Olena, date of birth 28.09";

                // Write the result to the file2.txt
                StringBuilder result = new StringBuilder();
                result.append("1. Number of lines in file1.txt: ").append(numberOfLines).append("\n");
                result.append("2. The longest line in file1.txt: ").append(longestLine).append("\n");
                result.append("3. My name and birthday: ").append(nameAndBirthday).append("\n");
                Files.write(Path.of(filename2), result.toString().getBytes());

                //Read file2.txt and print
                List<String> file2 = Files.readAllLines(Path.of(filename2));
                System.out.println("\n File2.txt: ");
                for (String line : file2) {
                    System.out.println(line);
                }
            } else {
                System.out.println("file1.txt does not exist");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
