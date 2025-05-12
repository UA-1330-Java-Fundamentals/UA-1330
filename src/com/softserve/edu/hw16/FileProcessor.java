package com.softserve.edu.hw16;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;

public class FileProcessor {
        public static void main(String[] args) {
            String fileName = "./file1.txt";
            var path = Path.of(fileName);
            //
            String data = "I believe that building a personal and professional network that is both strong and reliable is one of the most critical assets to possess.\n" +
                    "From my experience, I have discovered that the secret to building strong networks is helping others without expecting anything in return.\n"  +
                    "This results in impactful, strong relationships that not only present great opportunities but also build on personal growth.\n" +
                    "In addition, by interacting with people who are more knowledgeable in various fields, I have gained invaluable knowledge that has allowed me to travel and learn about different opportunities and career paths available.";
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
                System.out.println("Write data to file: " + fileName);
                    bw.write(data);
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                String[] lines  = Files.readAllLines(path)
                        .toArray(String[] :: new);
                String longestLine =
                Arrays.stream(lines)
                        .max(Comparator.comparing(String :: length))
                                .orElse("");

                String fileName2 = "./file2.txt";
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName2))) {

                    bw.write(lines.length + "\n");
                    bw.write(longestLine + "\n");
                    bw.write("My name is Daryna, birthday 04.02" + "\n");

                }
            } catch (Exception e) {
                e.printStackTrace();
        }
        }
}


