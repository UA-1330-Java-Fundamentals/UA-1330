/*
Declare collection myCollectionof 10 integers and fill it (from the console or random).
• Swap the maximum and minimum elements in the list.
• Insert a random three-digit number before the first negative element of the list
• Insert a zero between all neighboring elements collection myCollectionwith different signs
• Copy the first k elements of the myCollectionto the list1 , in direct order, and the rest to the
list2in reverse order.
• In a list myCollectionremove the last even element (if there are even elements in the list). If
there is no such element, display a message.
• Remove from the list myCollectionthe element following the first minimum. If the minimum
element is the last one, nothing needs to be removed.
Use one or more of the next: List, ArrayList , LinkedList
*/

package HomeWorkFromPDF.HomeWorkFromPDF9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class MyArray{
    private ArrayList<Integer> myCollection2;
    private Scanner sc;

    public MyArray(Scanner scanner) {
        this.sc = scanner;
        myCollection2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.println("Введіть цифру на позицію " + i + " :");
            myCollection2.add(sc.nextInt());
        }
    }

    @Override
    public String toString() {
        return "MyArray{" +
                "myCollection2=" + myCollection2 +
                '}';
    }

    public void swapMaxAndMin(){
        Integer biggest = 0;
        Integer smallest = 0;

        for (int i = 0; i < 10; i++){
            if(myCollection2.get(i) > biggest){
                biggest = i;
            }

            if(myCollection2.get(i) < smallest){
                smallest = i;
            }
        }

        System.out.println(myCollection2);
        int temp = myCollection2.get(biggest);
        myCollection2.set(biggest, myCollection2.get(smallest));
        myCollection2.set(smallest, temp);
        System.out.println(myCollection2);
    }

    public void insertARandomThreeDigitNumber(){
        for (int i = 0; i < 10; i++){
            if(myCollection2.get(i) < 0 && i >= 3){
                myCollection2.set(i-1, (int) (Math.random() * 10));
                myCollection2.set(i-2, (int) (Math.random() * 10));
                myCollection2.set(i-3, (int) (Math.random() * 10));
            }
        }
    }

    public void insertAZeroBetweenAllNeighbors(int n){
        for (int i = 0; i < 10 * 2; i = i + 2){
            myCollection2.add(i+1, n);
        }
    }

    public void CopyElements(int k) {
        if (k < 0 || k > myCollection2.size()) {
            System.out.println("Некоректне значення k");
            return;
        }

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            list1.add(myCollection2.get(i));
        }

        for (int i = myCollection2.size() - 1; i >= k; i--) {
            list2.add(myCollection2.get(i));
        }

        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
    }

    public void removeTheLastEven(){
        int evenIndex = -1;
        for (int i = 0; i < myCollection2.size(); i++) {
            if(myCollection2.get(i) % 2 == 0){
                evenIndex = i;
            }
        }

        if(evenIndex == -1){
            System.out.println("Немає парних чисел!!!");
        } else {
            myCollection2.remove(evenIndex);
        }
    }

    public void removeTheFirstMinimum(){
        int minValue = Collections.min(myCollection2);
        int minIndex = myCollection2.indexOf(minValue);

        if (minIndex < myCollection2.size() - 1) {
            myCollection2.remove(minIndex + 1);
        } else {
            System.out.println("Мінімальний елемент є останнім!!(");
        }
    }
}

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyArray arr = new MyArray(sc);

        System.out.println(arr);
        arr.swapMaxAndMin();

        arr.insertARandomThreeDigitNumber();
        System.out.println(arr);

        arr.insertAZeroBetweenAllNeighbors(0);
        System.out.println(arr);

        arr.CopyElements(5);

        arr.removeTheLastEven();
        System.out.println(arr);

        arr.removeTheFirstMinimum();
        System.out.println(arr);

        sc.close();
    }
}
