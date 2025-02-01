import java.util.Scanner;

public class FlowerBedCalculator {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input radius = ");
        int radius = sc.nextInt();
        //System.out.println("radius = " + radius );
        double perimetr = 2*Math.PI*radius;
        System.out.println("perimetr = " +  perimetr);

        double area = Math.PI*radius*radius;
        System.out.println("area = " +  area);

        sc.close();
    }
}

