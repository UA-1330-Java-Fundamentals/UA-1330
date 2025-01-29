import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FlowerBedCalculator {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int radius;

        System.out.print("Input the radius of the flower bed: ");
        radius =  Integer.parseInt(br.readLine());

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Perimeter of the flower bed is " + perimeter);
        System.out.println("Area of the flower bed is " + area);
    }
}