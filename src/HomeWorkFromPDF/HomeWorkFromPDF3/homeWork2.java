/*
Write a program that prompts the user to input three integer numbers. The program should determine the
maximum and minimum values among the three numbers and output them to the console.
*/

package HomeWorkFromPDF.HomeWorkFromPDF3;

import java.util.Scanner;

public class homeWork2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть перше число: ");
        int firstNumber = sc.nextInt();
        System.out.println("Введіть друге число: ");
        int secondNumber = sc.nextInt();
        System.out.println("Введіть третє число: ");
        int thirdNumber = sc.nextInt();

        int minNumber = firstNumber;
        if (secondNumber < minNumber){
            minNumber = secondNumber;
        }
        if (thirdNumber < minNumber){
            minNumber = thirdNumber;
        }
        System.out.println("Найменше число є: " + minNumber);

        int maxNumber = firstNumber;
        if (secondNumber > maxNumber){
            maxNumber = secondNumber;
        }
        if (thirdNumber > maxNumber){
            maxNumber = thirdNumber;
        }
        System.out.println("Найбільше число є: " + maxNumber);

    }
}
