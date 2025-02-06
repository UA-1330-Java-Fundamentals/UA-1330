/*
Write a program that prompts the user to input three float numbers. The program should check if all three numbers
fall within the range of -5 and 5 (inclusive). If all three numbers are within this range, the program should output a
message indicating that they belong to the range [-5, 5]. If any of the numbers are outside the specified range, the
program should output a message indicating that not all numbers belong to the range [-5, 5]. Please note that the range
includes the values -5 and 5 as well.
*/

package HomeWorkFromPDF.HomeWorkFromPDF3;

import java.util.Scanner;

public class homeWork1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть перше число: ");
        float firstNumber = sc.nextInt();
        System.out.println("Введіть друге число: ");
        float secondNumber = sc.nextInt();
        System.out.println("Введіть третє число: ");
        float thirdNumber = sc.nextInt();

        if (firstNumber >= -5 && firstNumber <= 5 && secondNumber >= -5 && secondNumber <= 5 && thirdNumber >= -5 && thirdNumber <= 5) {
            System.out.println("Всі числа знаходяться в межах від -5 до 5");
        } else {
            System.out.println("Не всі числа знаходяться в межах від -5 до 5");
        }
    }
}
