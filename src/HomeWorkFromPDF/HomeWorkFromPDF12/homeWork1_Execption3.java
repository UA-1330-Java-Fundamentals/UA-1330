/*Write Java console application with method to
calculate the area of a triangle.*/

package HomeWorkFromPDF.HomeWorkFromPDF12;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class homeWork1_Execption3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Введіть першу сторону трикутника:");
            int firstSide = sc.nextInt();
            System.out.println("Введіть другу сторону трикутника:");
            int secondSide = sc.nextInt();
            System.out.println("Введіть третю сторону трикутника:");
            int thirdSide = sc.nextInt();

            double area = calculateArea(firstSide, secondSide, thirdSide);

            System.out.println("Площа трикутника: " + area);
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

    public static double calculateArea(int firstSide, int secondSide, int thirdSide) {
        double s = (firstSide + secondSide + thirdSide) / 2.0;
        return Math.sqrt(s * (s - firstSide) * (s - secondSide) * (s - thirdSide));
    }
}

