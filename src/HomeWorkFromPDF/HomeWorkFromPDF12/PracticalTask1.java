/*
It is required to create a method named squareRectangle that takes two integer parameters "a" and "b" and
calculates the area of a rectangle: int squareRectangle (int a, int b),
In case the user enters negative values, the method should throw an exception. The values of "a" and "b" should be
taken as input from the console. It is recommended to check the correctness of the squareRectangle() method in the
main() method. Furthermore, it is necessary to verify that the input values are numeric and handle non-numeric
input accordingly.
*/

package HomeWorkFromPDF.HomeWorkFromPDF12;

import java.util.Scanner;

public class PracticalTask1 {
    public static int squareRectangle(int a, int b){
        if (a < 0 || b < 0){
            throw new IllegalArgumentException("Ви ввели негативні числа, виправіть це!");
        }
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Введіть число a: ");
            int a = Integer.parseInt(sc.nextLine());

            System.out.println("Введіть число b: ");
            int b = Integer.parseInt(sc.nextLine());

            int area = squareRectangle(a, b);
            System.out.println("Площа чотирикутника складає: : " + area);
        } catch (NumberFormatException e) {
            System.out.println("Введіть цифри а не інші значення в інпут");
        } catch (IllegalArgumentException e) {
            System.out.println("Помилка: " + e.getMessage());
        } finally {
            sc.close();
        }



    }
}
