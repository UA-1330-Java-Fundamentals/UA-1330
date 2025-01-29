/*Calculate the Perimeter and Area of a Flower Bed
The flower bed is circular in shape. Your task is to write a program that calculates the perimeter (circumference) and area of the flower bed based on a given radius.

Steps:
Create a class named FlowerBedCalculator.
In the main() method, declare an int variable radius and assign it a value (for example, 10).
Calculate the perimeter of the circle using the formula:
perimeter = 2 * Math.PI * radius.
The perimeter should be of type double since it involves floating-point numbers.
Calculate the area of the circle using the formula:
area = Math.PI * radius * radius
The area should also be of type double for the same reason.
Output the radius, perimeter, and area to the console using simple messages like:
"Flower bed radius is 10."
"Perimeter is 62.83185307179586."
"Area is 314.1592653589793."
*/

package HomeWorkFromAcademy.HomeWorkFromAcademy1_2;

public class Task2 {
    public static void main(String[] args){

        int radius = 10;
        System.out.println("Flower bed radius is " + radius);

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Perimeter is " + perimeter);
        System.out.println("Area is " + area);
    }
}
