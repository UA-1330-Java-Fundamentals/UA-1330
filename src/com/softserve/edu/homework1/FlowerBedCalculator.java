import java.util.Scanner;

public class FlowerBedCalculator {

    public static void main(String[] args) {

        int radius;
        double perimeter;
        double area;

        System.out.println("Please input the radius of the flower bed : ");
        Scanner scan = new Scanner(System.in);
        radius = scan.nextInt();
        perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter of the flower bed = " + perimeter);
        area = Math.PI * radius * radius;
        System.out.println("Area of the flower bed = " + area);
    }
}
