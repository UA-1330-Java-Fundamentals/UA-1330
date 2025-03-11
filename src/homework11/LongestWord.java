package homework11;

import java.util.Scanner;

/*
The task involves inputting a sentence of five words through the console. The following actions
must be performed:
• Identify the longest word in the sentence and display it on the console.
• Determine the number of letters in the longest word.
• Display the second word of the sentence in reverse order on the console.
 */
public class LongestWord {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        System.out.println("Enter sentence of five words: ");
        var sentence = scan.nextLine();
        String[] words = sentence.split("\\s+");

        //Identifying the longest word in the sentence
        String longestWord = "";
        for( String word : words){
            if( word.length() > longestWord.length()){
                longestWord = word;
            }
        }
        System.out.println("The longest word in the sentence: " + longestWord);

        System.out.println("The number of letters in the longest word: " + longestWord.length());

        if(words.length < 2){
            System.out.println("Error: Second word does not exist.");
        } else {
            String secondReverse = new StringBuilder(words[1]).reverse().toString();
            System.out.println("The second word of the sentence in reverse order: " + secondReverse);
        }

        scan.close();


    }
}
