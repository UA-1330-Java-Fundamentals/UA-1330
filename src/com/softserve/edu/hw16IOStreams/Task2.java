package com.softserve.edu.hw16IOStreams;
/*A file with java code is given. Read program text from file and all words public in
the declaration of class attributes and methods should be replaced with the word private.
Save the result to another previously created file.*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        String filename1 = "/Users/elena/Desktop/fileJava01.txt";
        String filename2 = "/Users/elena/Desktop/fileJava02.txt";

        try {
            var path1 = Path.of(filename1);

            if (Files.exists(path1)) {
                String[] lines = Files.readAllLines(path1).toArray(String[]::new);


                //print fileJava01.txt
                System.out.println("fileJava01.txt:");
                for (String line : lines) {
                    System.out.println(line);
                }

                // Replace public to the private
                String replaced = Arrays.stream(lines)
                        .map(line -> line.replace("public", "private"))
                        .collect(Collectors.joining("\n"));
                if (!replaced.contains("private")) {
                    System.out.println("'Public' text were not found");
                }

                // Write the result to the fileJava02.txt
                Files.write(Path.of(filename2), replaced.getBytes());

                //print fileJava02.txt
                List<String> file2 = Files.readAllLines(Path.of(filename2));
                System.out.println("\n fileJava02.txt: ");
                for (String line : file2) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}



