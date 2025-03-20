/*
Create a method readNumber(int start, int end), that read from console integer number
and return it, if it is in the range [start...end]. If an invalid number or non-number text is
read, the method should throw an exception.
Using this method write a method main(), that must enter 10 numbers:
a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100
*/

package HomeWorkFromPDF.HomeWorkFromPDF12;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class HomeWork2 {
    public static int readNumber(int start, int end) throws IllegalArgumentException{
        Scanner sc = new Scanner(System.in);
        int current = 0;

        while (true){
            try {
                System.out.println("Введіть число, для перевірки чи воно входить в межі:");
                current = Integer.parseInt(sc.nextLine());

                if (current < start || current > end) {
                    throw new IllegalArgumentException("Число повинно бути в межах [" + start + ", " + end + "]");
                }
                return current;
            } catch (NumberFormatException e){
                System.out.println("Ви ввели не число: " + "<" +e.getMessage() + ">");
            } catch (IllegalStateException | NoSuchElementException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Введіть 10 чисел у межах [1, 100]:");

        for (int i = 0; i < 10; i++) {
            try {
                numbers[i] = readNumber(1, 100);
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }

        System.out.println("\nВведені числа:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
