/*
Write Java console application with method
to find the smallest number among three integer numbers. Example of
output*/

package HomeWorkFromPDF.HomeWorkFromPDF2;

import java.util.Scanner;

public class homeWork2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть перше число:");
        double firstNumber = sc.nextDouble();
        System.out.println("Введіть друге число:");
        double secondNumber = sc.nextDouble();
        System.out.println("Введіть третє число:");
        double thirdNumber = sc.nextDouble();

        double smallestNumber = findSmallestNumber(firstNumber, secondNumber, thirdNumber);
        System.out.println("Найменше з усіх чисел є: " + smallestNumber);
        sc.close();
    }

    public static double findSmallestNumber(double firstNumber, double secondNumber, double thirdNumber) {
        double temp = firstNumber;

        if (secondNumber < temp) {// Я перепрошую за використання if, я знаю що ми щецього не брали, але я просто не зміг придумати іншого способу, крім цього, ще тільки посортувати список але його довше писати, тож зробив просто отаку перевірку, знаю що вона не правильна, бо можуть добавити ще число, і верівно список це найкраще рішення, але не знею як у джаві прайювати з списками, тож виористав цей спосіб)
            temp = secondNumber;
        }

        if (thirdNumber < temp) {
            temp = thirdNumber;
        }

        return temp;
    }
}
