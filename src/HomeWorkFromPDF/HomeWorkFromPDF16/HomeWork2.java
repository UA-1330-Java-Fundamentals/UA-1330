/*
A file with java code is given. Read program text from file and all words public in the
declaration of class attributes and methods should be replaced with the word private.
Save the result to another previously created file.
*/

package HomeWorkFromPDF.HomeWorkFromPDF16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class HomeWork2 {
    public static void main(String[] args) throws IOException {
        Path myPath = Paths.get("src/HomeWorkFromPDF/HomeWorkFromPDF16/TEST.java");
        Path myPathDest = Paths.get("src/HomeWorkFromPDF/HomeWorkFromPDF16/TESTdest.java");
        List<String> arrOfLinesFromTEST = new ArrayList<>();

        if(Files.exists(myPath)){
            System.out.println("Файл найдено");
            arrOfLinesFromTEST = Files.readAllLines(myPath);
        } else {
            Files.createFile(myPath);
        }

        if(Files.exists(myPathDest)){
            System.out.println("Файл найдено");
        } else {
            Files.createFile(myPathDest);
        }

//        arrOfLinesFromTEST.forEach(System.out::println);
//        Files.write(myPathDest, arrOfLinesFromTEST, StandardOpenOption.TRUNCATE_EXISTING);

        List<String> newArrOfLinesFromTEST = new ArrayList<>();
        for(String elem : arrOfLinesFromTEST){
            if (elem.contains("public")){
                newArrOfLinesFromTEST.add( elem.replace("public", "private"));
            } else {
                newArrOfLinesFromTEST.add(elem);
            }
        }

        newArrOfLinesFromTEST.forEach(System.out::println);
        Files.write(myPathDest, newArrOfLinesFromTEST, StandardOpenOption.TRUNCATE_EXISTING);


    }
}
