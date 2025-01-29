/*
Task 2: Input and Output User Information (Easy)

Your goal is to create a Java application that interacts with the user by asking for their name and address, then displaying this information in a formatted output. The program should prompt the user to input their name and address directly from the console. This means the values for the variables: name and addressmust be obtained interactively, based on what the user types when prompted.
Steps:

Create a class named UserInfo.
In the main method, declare two String variables: name and address.
Output the question "What is your name?" and read the user's input into the name variable.
Output the next question: "Where do you live, [name]?" and read the user's input into the address variable.
Output the complete information in the format: "Name: [name], Address: [address]"
*/

package HomeWorkFromAcademy.HomeWorkFromAcademy1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name;
        String address;

        System.out.println("What is your name?");
        name = sc.nextLine();

        System.out.println("Where do you live, " + name + "?");
        address = sc.nextLine();

        System.out.println("Name: " + name + ", " + "Address: " + address);

        sc.close();
    }
}
