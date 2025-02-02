/*Write Java console application with method to
calculate the area of a triangle.*/

package HomeWorkFromPDF.HomeWorkFromPDF2;

import java.util.Scanner;

public class homeWork1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть першу сторону трикутника:");
        int firstSide = sc.nextInt();
        System.out.println("Введіть другу сторону трикутника:");
        int secondSide = sc.nextInt();
        System.out.println("Введіть третю сторону трикутника:");
        int thirdSide = sc.nextInt();
        sc.close();

        double area = calculateArea(firstSide, secondSide, thirdSide);

        System.out.println("Площа трикутника: " + area);
    }

    public static double calculateArea(int firstSide, int secondSide, int thirdSide) {
        double s = (firstSide + secondSide + thirdSide) / 2.0;
        return Math.sqrt(s * (s - firstSide) * (s - secondSide) * (s - thirdSide));
    }
}

