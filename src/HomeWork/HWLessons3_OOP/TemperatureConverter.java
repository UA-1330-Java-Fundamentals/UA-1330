import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        System.out.println("How many degrees Fahrenheit?");

        Scanner sc = new Scanner(System.in);
        double fahrenheit = sc.nextDouble();

        double celsius = fahrenheitToCelsius(fahrenheit);
        System.out.println("Celsius = " + celsius);
        sc.close();
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (double) 5 / 9 * (fahrenheit - 32);

    }
}

