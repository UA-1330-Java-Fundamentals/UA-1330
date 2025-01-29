import java.util.Scanner;

public class PhoneCallCostCalculator {
    public static void main(String[] args) {
        double c1; // Price for close East Europe - UAS 1.5 UAH
        double c2; // Price for EU - 5 UAH
        double c3; // Other countries - 30 UAH

        int t1, t2, t3;

        double totalCost;

        System.out.println("Please, provide cost/minute for East Europe calls");
        Scanner sc = new Scanner(System.in);
        c1 = sc.nextDouble();
        System.out.println("Please, provide cost/minute for EU and USA calls ");
        c2 = sc.nextDouble();
        System.out.println("Please, provide cost/minute for other countries");
        c3 = sc.nextDouble();

        System.out.println("Please set how many minutes take the call from East Europe :");
        t1 = sc.nextInt();
        System.out.println("Please set how many minutes take the call from EU or USA :");
        t2 = sc.nextInt();
        System.out.println("Please set how many minutes take the call from other countries :");
        t3 = sc.nextInt();

        double cost1 = c1 * t1;
        double cost2 = c2 * t2;
        double cost3 = c3 * t3;

        totalCost = cost1 + cost2 + cost3;

        System.out.println("Cost of each call equals:" + "\n"+
                " - East europe call cost = " + cost1+ " UAH" +"\n"+
                " - EU or USA call cost = "+ cost2+ " UAH" +"\n"+
                " - Other countries call cost = "+  cost3 +" UAH");
        System.out.println("Total coast = " + totalCost + " UAH");

    }
}
