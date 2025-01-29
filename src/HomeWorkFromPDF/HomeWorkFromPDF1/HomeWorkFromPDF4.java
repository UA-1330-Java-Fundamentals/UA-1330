/*Output question“How are you?“. Define string variable answer.
Read the value answer and output: “You are (answer)".*/

package HomeWorkFromPDF.HomeWorkFromPDF1;

import java.util.Scanner;

public class HomeWorkFromPDF4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How are you?");
        String answer = sc.nextLine();

        System.out.println("You are " + answer);

        sc.close();
    }
}

