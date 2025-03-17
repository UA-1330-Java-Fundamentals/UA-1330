/*
The task involves inputting a sentence of five words through the console. The following actions
must be performed:
• Identify the longest word in the sentence and display it on the console.
• Determine the number of letters in the longest word.
• Display the second word of the sentence in reverse order on the console.
*/

package HomeWorkFromPDF.HomeWorkFromPDF11;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть речення котре складається з 5 слів: ");
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        String longest = words[0];

        if (words.length != 5){
            System.out.println("Ваше речення має " + words.length + " а не 5 слів!");
            return;
        }

        for (String word : words){
            if (word.length() > longest.length()){
                longest = word;
            }
        }

        System.out.println("Найдовше слово: " + longest);
        System.out.println("Кількість букв в найдовшому слові: " + longest.length());
        StringBuilder sb = new StringBuilder(words[1]);
        System.out.println("Друге слово з речення в зворотньому порядку: " + sb.reverse());
    }
}
