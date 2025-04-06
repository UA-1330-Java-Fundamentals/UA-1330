package com.softserve.edu.homework_16;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JavaFileModifier {

    public static void main(String[] args) {
        String inputFile = "src/com/softserve/edu/homework_16/ClassWithPublicDeclarations.java";
        String outputFile = "src/com/softserve/edu/homework_16/ClassWithPrivateDeclarations.java";

        try {
            Path path = Paths.get(inputFile);
            if (!Files.exists(path)) {
                System.out.println("The file '" + inputFile + "' does not exist.");
                return;
            }

            System.out.println("Reading the Java file...");
            String[] lines = Files.readAllLines(path).toArray(new String[0]);


            StringBuilder modifiedContent = new StringBuilder();

            for (String line : lines) {
                line = line.replaceAll("\\bpublic\\b", "private");
                line = line.replaceAll("\\bClassWithPublicDeclarations\\b", "ClassWithPrivateDeclarations");
                modifiedContent.append(line).append(System.lineSeparator());
            }

            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            writer.write(modifiedContent.toString());
            writer.close();

            System.out.println("Processing completed. The modified code has been saved to '" + outputFile + "'.");

        } catch (IOException e) {
            System.out.println("An error occurred during file operation.");
            e.printStackTrace();
        }
    }
}
