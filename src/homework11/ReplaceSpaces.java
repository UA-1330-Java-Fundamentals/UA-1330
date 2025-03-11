package homework11;

import java.util.Scanner;

/*
Іnput a sentence that contains words separated by more than one space on the console. The
goal is to replace all consecutive spaces with a single space. For instance, if you entered the
sentence "I  am  learning   Java  Fundamental", the expected result should be "I am learning
Java Fundamental".
 */
public class ReplaceSpaces {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        System.out.println("Enter your sentence: ");
        String sentence = scan.nextLine();

        //replacing all consecutive spaces with a single space
        String finalSentence = sentence.replaceAll("\\s+", " ");

        System.out.println(finalSentence);
        scan.close();


    }
}
