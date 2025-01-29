/*
Create Console Application project in Java.
In main() method write code for solving next tasks:
1) 1. Define integer variables a and b. Read values a and b from Console and calculate:
• a + b
• a - b
• a * b
• a / b .
Output obtained results.
*/

package HomeWorkFromPDF.HomeWorkFromPDF1;

import java.util.Scanner;

public class HomeWorkFromPDF3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть a: ");
        int a = sc.nextInt();

        System.out.println("Введіть b: ");
        int b = sc.nextInt();

        int add = a + b;
        System.out.println("Результат додавання a та b: " + add);

        int subtract = a - b;
        System.out.println("Результат віднімання b від a: " + subtract);

        int multiply = a * b;
        System.out.println("Результат множення a та b: " + multiply);

        int devide = a / b;
        System.out.println("Результат ділення а на b: " + devide);

        sc.close();
    }
}

