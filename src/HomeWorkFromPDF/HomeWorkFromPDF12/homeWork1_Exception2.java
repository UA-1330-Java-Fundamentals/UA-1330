/*
Write a program that prompts the user to input three float numbers. The program should check if all three numbers
fall within the range of -5 and 5 (inclusive). If all three numbers are within this range, the program should output a
message indicating that they belong to the range [-5, 5]. If any of the numbers are outside the specified range, the
program should output a message indicating that not all numbers belong to the range [-5, 5]. Please note that the range
includes the values -5 and 5 as well.
*/

package HomeWorkFromPDF.HomeWorkFromPDF12;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class homeWork1_Exception2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
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
        } catch (IllegalStateException e) {
            System.out.println("Помилка: Scanner було закрито передчасно.");
        } catch (InputMismatchException e) {
            System.out.println("Помилка: Введіть Integer.");
        } catch (NoSuchElementException e) {
            System.out.println("Помилка: не вдалося прочитати введені дані.");
        } finally {
            sc.close();
        }
    }
}
