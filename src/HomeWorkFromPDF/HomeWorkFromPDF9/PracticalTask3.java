package HomeWorkFromPDF.HomeWorkFromPDF9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PracticalTask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> myCollection = new ArrayList<>(10);
        ArrayList<Integer> newCollection = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.println("Введіть цифру на позицію " + i + " :");
            Integer num = sc.nextInt();
            myCollection.add(num);
        }

        System.out.println(myCollection);

        //Закоментовано, так як для подальших операцій потрібен повний список, а тут є функції котрі  його обрізають
//        for (int i = 0; i < 10; i++) {
//            if (myCollection.get(i) > 5){
//                newCollection.add(myCollection.get(i));
//            }
//        }
//        System.out.println(newCollection);

//        for (int i = myCollection.size() - 1; i >= 0; i--) {
//            if (myCollection.get(i) > 20) {
//                myCollection.remove(i);
//            }
//        }
//        System.out.println(myCollection);

        myCollection.set(2, 1);
        myCollection.set(8, -3);
        myCollection.set(5, -4);

        for (int i = 0; i < 10; i++) {
            System.out.println("position - " + i + ", value of element - " + myCollection.get(i));
        }

        Collections.sort(myCollection);

        System.out.println("Відсортований список: " + myCollection);
    }
}
