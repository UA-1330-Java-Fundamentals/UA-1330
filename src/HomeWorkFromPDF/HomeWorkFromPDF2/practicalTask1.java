/*Write a Java console application with methods that accept two numbers as arguments and
have the following names:
• getTotal- returns their sum;
• getAverage- returns their average;
• (*) static getNumber(String prompt)- allows input of numbers using Scanner with
messages and return number
Call these methods from the main() method and print the results. For example:
*/

package HomeWorkFromPDF.HomeWorkFromPDF2;

import java.util.Scanner;

public class practicalTask1 {

    public static void main(String[] args) {
        int firstNumber = getNumber("Введіть перше число: ");
        int secondNumber = getNumber("Введіть друге число: ");
        int total = getTotal(firstNumber, secondNumber);
        double average = getAverage(firstNumber, secondNumber);
        System.out.println("Ваша сума цифер " + firstNumber + " і " + secondNumber + " складає: " + total +
                            "\nВаше середнє цифер " + firstNumber + " і " + secondNumber + " є: " + average);
    }

    public static int getTotal(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static double getAverage(int firstNumber, int secondNumber) {
        return getTotal(firstNumber, secondNumber) / 2.0;
    }

    public static int getNumber(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        int number = sc.nextInt();
        sc.close();
        return number;
    }
}
