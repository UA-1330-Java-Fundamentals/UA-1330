package java.com.softserve.edu;

public class Appl {
    public static void main(String[] args) {
        boolean bool = 2 > 5;
        if (bool == true) {
            System.out.print("a");
        } else if (!bool) {
            System.out.print("b");
        }
        if (bool == false) {
            System.out.print("c");
        } else {
            System.out.print("d");
        }
    }
}
