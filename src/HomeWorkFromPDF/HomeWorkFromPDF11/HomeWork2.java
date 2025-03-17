/*
Іnput a sentence that contains words separated by more than one space on the console. The
goal is to replace all consecutive spaces with a single space. For instance, if you entered the
sentence "I am learning Java Fundamental", the expected result should be "I am learning
Java Fundamental "
*/

package HomeWorkFromPDF.HomeWorkFromPDF11;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        StringBuilder sb = new StringBuilder("");

        String[] sentenceSplited = sentence.split("[\\s]+");

        for(String word : sentenceSplited){
            sb.append(" " + word);
        }

        System.out.println(sb.toString().trim());
    }
}
