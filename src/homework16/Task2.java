package homework16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collectors;

/*
A file with java code is given. Read program text from file and all words public in the
declaration of class attributes and methods should be replaced with the word private.
Save the result to another previously created file.
 */
public class Task2 {
    public static void main(String[] args) throws IOException {
        String filename = "C:/Users/Карина/IdeaProjects/UA-1330/src/homework16/ForEditing.java";
        var path = Path.of(filename);

        //read
        List<String> lines = null;
        try {
            lines = Files.readAllLines(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //find "public" and change to "private"
        List<String> updatedLines = lines.stream()
                .map(line -> line.replace("public", "private"))
                .collect(Collectors.toList());

        String newFilename = "C:/Users/Карина/IdeaProjects/UA-1330/src/homework16/ForEditingUpdated.java";
        var newPath = Path.of(newFilename);

        //save to original file
        Files.write(newPath, updatedLines, StandardOpenOption.CREATE);

        System.out.println("Result is written to new file successfully!");



    }
}
