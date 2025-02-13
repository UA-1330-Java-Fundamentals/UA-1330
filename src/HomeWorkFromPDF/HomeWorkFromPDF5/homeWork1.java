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

package HomeWorkFromPDF.HomeWorkFromPDF5;

import java.util.Scanner;

public class homeWork1 {

    public static int monthNumber(int monthByUser, int[] months){
        if (monthByUser >= 1 && monthByUser <= 12) {
            System.out.println("Кількість днів у місяці під номером " + monthByUser + " складає: " + months[monthByUser - 1]);
            return months[monthByUser - 1];
        } else {
            System.out.println("Невірний номер місяця.");
            return 0;
        }
    }

    public static int numbersAndCalculatesTheSum(int[] tenNumbers){
        int sum = 0;
        int prod = 1;
        for (int i = 0; i < 5; i++) {
            if (tenNumbers[i] > 0) {
                sum += tenNumbers[i];
            } else {
                sum = 0;
                break;
            }
        }

        if (sum == 0) {
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
                    System.out.println("Число під індексом " + i + " є другим позитивним числом");
                    return i;
                }
            }
        }

        return -1;
    }

    public static int[] minimumValue(int[] fiveNumbers) {
        int min = fiveNumbers[0];
        int minPos = 0;
        for (int i = 0; i < fiveNumbers.length; i++){
            if (fiveNumbers[i] < min){
                min = fiveNumbers[i];
                minPos = i;
            }
        }
        System.out.println("Найменше число є " + min + " під інексом " + minPos);
        return new int[]{min, minPos};
    }

    public static int product(int[] fiveNumbers){
        int prodEven = 1;

        for(int num : fiveNumbers){
            if (num % 2 == 0){
                prodEven *= num;
            }
        }
        System.out.println("Усі парні цифри помножені між собою: " + prodEven);
        return prodEven;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] tenNumbers = new int[10];
        int[] fiveNumbers = new int[5];

        /// ///
        System.out.println("Введіть номер місяця року, щоб дізнатись кількість днів у ньому: ");
        int monthByUser = sc.nextInt();
        monthNumber(monthByUser, months);
        /// ///


        /// ///
        System.out.println("Введіть 10 чисел:");
        for (int i = 0; i < tenNumbers.length; i++) {
            System.out.print("Число під індексом " + i + ": ");
            tenNumbers[i] = sc.nextInt();
        }
        numbersAndCalculatesTheSum(tenNumbers);
        /// ///


        /// ///
        System.out.println("Введіть 5 чисел:");
        for (int i = 0; i < fiveNumbers.length; i++){
            System.out.print("Число під індексом " + i + ": ");
            fiveNumbers[i] = sc.nextInt();
        }

        secondPositive(fiveNumbers);
        minimumValue(fiveNumbers);
        product(fiveNumbers);
        /// ///
    }
}
