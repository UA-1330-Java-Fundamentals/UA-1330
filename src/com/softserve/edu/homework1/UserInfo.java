import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {

        String name;
        String address;

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        name = sc.nextLine();
        System.out.println("Where do you live, " +name +" ?");
        address = sc.nextLine();
        System.out.println("Name: " + name +", Address: "+address);
    }
}
