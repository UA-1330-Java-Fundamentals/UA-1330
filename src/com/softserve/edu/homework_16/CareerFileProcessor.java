package com.softserve.edu.homework_16;

import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CareerFileProcessor {

    public static void main(String[] args) {
        String inputFile = "src/com/softserve/edu/homework_16/files/file1.txt";
        String outputFile = "src/com/softserve/edu/homework_16/files/file2.txt";

        try {

            Path path = Paths.get(inputFile);

            if (!Files.exists(path)) {
                System.out.println("The file 'file1.txt' does not exist.");
                return;
            }

            String[] lines = Files.readAllLines(path).toArray(new String[0]);

            BufferedWriter writer = getBufferedWriter(lines, outputFile);

            writer.close();

            System.out.println("All works are done! Check the file2.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static @NotNull BufferedWriter getBufferedWriter(String[] lines, String outputFile) throws IOException {

        int numberOfLines = lines.length;

        String longestLine = "";
        for (String line : lines) {
            if (line.length() > longestLine.length()) {
                longestLine = line;
            }
        }

        String name = "Anastasiia Shpak";
        String birthday = "January 4, 2001";

        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

        writer.write("Number of lines in file1.txt: " + numberOfLines);
        writer.newLine();

        writer.write("The longest line in file1.txt: " + longestLine);
        writer.newLine();

        writer.write("My name: " + name + ", my birthday: " + birthday);
        writer.newLine();
        return writer;
    }
}
