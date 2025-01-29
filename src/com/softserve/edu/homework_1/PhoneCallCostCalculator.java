import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PhoneCallCostCalculator {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double c1, c2, c3;
        double t1, t2, t3;

        System.out.print("Input the cost per minute for the first call (c1): ");
        c1 =  Double.parseDouble(br.readLine());

        System.out.print("Input the cost per minute for the second call (c2): ");
        c2 =  Double.parseDouble(br.readLine());

        System.out.print("Input the cost per minute for the third call (c3): ");
        c3 =  Double.parseDouble(br.readLine());


        System.out.print("\nInput the duration for the first call (t1): ");
        t1 =  Double.parseDouble(br.readLine());

        System.out.print("Input the duration for the second call (t2): ");
        t2 =  Double.parseDouble(br.readLine());

        System.out.print("Input the duration for the third call (t3): ");
        t3 =  Double.parseDouble(br.readLine());

        double cost1 = c1 * t1;
        double cost2 = c2 * t2;
        double cost3 = c3 * t3;

        double totalCost = cost1 + cost2 + cost3;

        System.out.println("\nThe cost of the first call: " + cost1 + "\nThe cost of the second call: " + cost2 +
                "\nThe cost of the third call: " + cost3 + "\n\nTotal cost: " + totalCost);
    }
}
