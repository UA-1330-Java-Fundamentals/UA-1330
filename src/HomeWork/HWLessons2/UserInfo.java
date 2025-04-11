import java.util.Scanner;
public class UserInfo {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = sc.nextLine();
        System.out.print("Where do you live, " + name + "? ");
        String address = sc.nextLine();
        System.out.println("Name: " + name + ", " + "Address: " + address);

        sc.close();

    }
}
