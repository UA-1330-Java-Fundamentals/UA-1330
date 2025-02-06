/*
Enter three numbers from the console. Determine and output the result of how many of them are odd. Output the
result to the console.
*/

package HomeWorkFromPDF.HomeWorkFromPDF3;

import java.util.Scanner;

public class practicalTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть перше число: ");
        int firstNumber = sc.nextInt();
        System.out.println("Введіть друге число: ");
        int secondNumber = sc.nextInt();
        System.out.println("Введіть третє число: ");
        int thirdNumber = sc.nextInt();

        if (firstNumber % 2 == 0){
            System.out.println( firstNumber + " є парним числом");
        }

        if (secondNumber % 2 == 0){
            System.out.println( secondNumber + " є парним числом");
        }

        if (thirdNumber % 2 == 0){
            System.out.println( thirdNumber + " є парним числом");
        }
    }
}
