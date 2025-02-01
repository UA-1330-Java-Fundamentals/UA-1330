import java.util.Scanner;
import java.io.InputStreamReader;
public class PhoneCallCostCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Cost per minute of 1 call =  ");
        Double c1 = sc.nextDouble();
        System.out.print("Cost per minute of 2 call =  ");
        Double c2 = sc.nextDouble();
        System.out.print("Cost per minute of 3 call =  ");
        Double c3 = sc.nextDouble();

        System.out.print("Duration of 1 call =  ");
        Double t1 = sc.nextDouble();
        System.out.print("Duration of 2 call =  ");
        Double t2 = sc.nextDouble();
        System.out.print("Duration of 3 call =  ");
        Double t3 = sc.nextDouble();

        Double cost1 = c1 * t1;
        Double cost2 = c2 * t2;
        Double cost3 = c3 * t3;
        Double totalCost = cost1 + cost2 + cost3;

        System.out.print("Cost of 1 call = " + cost1 );
        System.out.print("Cost of 2 call = " + cost2 );
        System.out.print("Cost of 3 call = " + cost3 );
        System.out.print("Total cost = " + totalCost );









        //Double sum = c1 + c2 + c3;
        //System.out.print (sum);








    }
}
