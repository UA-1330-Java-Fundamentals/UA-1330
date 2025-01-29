import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class UserInfo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name;
        String address;

        System.out.print("What is your name? ");
        name = br.readLine();

        System.out.print("Where do you live, " + name + "? ");
        address = br.readLine();

        System.out.println("\nName: " + name + ", Address: " + address);
    }
}
