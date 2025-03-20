/*
Create a program (in different java documents) that prompts the user to enter:
• a month number and calculates the number of days in that month based on an array
that contains the number of days in each month.
• 10 integers numbers and calculates the sum of the first five elements if they are
positive, or the product of the last five elements if they are not and output the result.
• 5 integer numbers and find:
o position of second positive number;
o minimum value and its position in the array.
o calculate the product of all entered even numbers (exclude 0 from even if entered by
user).
*/

package HomeWorkFromPDF.HomeWorkFromPDF12;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class homeWork1_Exception5 {

    public static int monthNumber(int monthByUser, int[] months){
        if (monthByUser >= 1 && monthByUser <= 12) {
            System.out.println("Кількість днів у місяці " + monthByUser + ": " + months[monthByUser - 1]);
            return months[monthByUser - 1];
        } else {
            System.out.println("Помилка: Невірний номер місяця.");
            return -1;
        }
    }

    public static int numbersAndCalculatesTheSum(int[] tenNumbers){
        int sum = 0, prod = 1;
        boolean allPositive = true;

        for (int i = 0; i < 5; i++) {
            if (tenNumbers[i] > 0) {
                sum += tenNumbers[i];
            } else {
                allPositive = false;
                break;
            }
        }

        if (!allPositive) {
            sum = 0;
            for (int i = 5; i < 10; i++) {
                prod *= tenNumbers[i];
            }
            System.out.println("Добуток останніх п'яти чисел: " + prod);
            return prod;
        } else {
            System.out.println("Сума перших п'яти позитивних чисел: " + sum);
            return sum;
        }
    }

    public static int secondPositive(int[] fiveNumbers) {
        int count = 0;
        for (int i = 0; i < fiveNumbers.length; i++) {
            if (fiveNumbers[i] > 0) {
                count++;
                if (count == 2) {
                    System.out.println("Другий позитивний елемент має індекс: " + i);
                    return i;
                }
            }
        }
        System.out.println("Помилка: В масиві немає двох позитивних чисел.");
        return -1;
    }

    public static int[] minimumValue(int[] fiveNumbers) {
        int min = fiveNumbers[0], minPos = 0;

        for (int i = 1; i < fiveNumbers.length; i++){
            if (fiveNumbers[i] < min){
                min = fiveNumbers[i];
                minPos = i;
            }
        }
        System.out.println("Найменше число: " + min + ", індекс: " + minPos);
        return new int[]{min, minPos};
    }

    public static int product(int[] fiveNumbers){
        int prodEven = 1;
        boolean foundEven = false;

        for(int num : fiveNumbers){
            if (num % 2 == 0 && num != 0){
                prodEven *= num;
                foundEven = true;
            }
        }

        if (!foundEven) {
            System.out.println("У масиві немає парних чисел (без 0).");
            return 0;
        }

        System.out.println("Добуток парних чисел: " + prodEven);
        return prodEven;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            int[] tenNumbers = new int[10];
            int[] fiveNumbers = new int[5];

            /// ///
            try {
                System.out.println("Введіть номер місяця (1-12): ");
                int monthByUser = sc.nextInt();
                monthNumber(monthByUser, months);
            } catch (InputMismatchException e) {
                System.out.println("Помилка: Введіть ціле число від 1 до 12.");
                sc.next(); // очищення введених даних
            }

            /// ///
            System.out.println("Введіть 10 чисел:");
            for (int i = 0; i < tenNumbers.length; i++) {
                try {
                    System.out.print("Число " + (i + 1) + ": ");
                    tenNumbers[i] = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Помилка: Введіть коректне ціле число.");
                    sc.next();
                    i--; // повторне введення
                }
            }
            numbersAndCalculatesTheSum(tenNumbers);

            /// ///
            System.out.println("Введіть 5 чисел:");
            for (int i = 0; i < fiveNumbers.length; i++){
                try {
                    System.out.print("Число " + (i + 1) + ": ");
                    fiveNumbers[i] = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Помилка: Введіть коректне ціле число.");
                    sc.next();
                    i--; // повторне введення
                }
            }

            secondPositive(fiveNumbers);
            minimumValue(fiveNumbers);
            product(fiveNumbers);
        } catch (NoSuchElementException e) {
            System.out.println("Помилка: Неможливо прочитати введені дані.");
        } catch (IllegalStateException e) {
            System.out.println("Помилка: Scanner закрито передчасно.");
        } finally {
            sc.close();
        }
    }
}
