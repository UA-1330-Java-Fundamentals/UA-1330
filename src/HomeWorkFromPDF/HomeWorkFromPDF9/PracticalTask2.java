/*
Suppose, the user enters a set of numbers as a single string "1, 2, 3, 4, 4, 5, 6, 6, 7, 8" from
the console (can be other numbers):
• Remove of duplicate elements in a string.
• Output the result to the console.
*/

package HomeWorkFromPDF.HomeWorkFromPDF9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Arr{
    List<String> list = new ArrayList<String>();

    public Arr(String input){
        list.add(input);
    }

//    public void deleteDuplicates() {
//        List<String> newList = new ArrayList<>();
//        for (int i = 0; i < list.size()-1/2; i++) {
//            if (!newList.contains(item)) {
//                newList.add(item);
//            }
//            System.out.println(list.get(i));
//        }
//        list = newList;
//    }

    @Override
    public String toString() {
        return "Arr {" +
                "\nlist=" + list +
                "\n}";
    }
}

public class PracticalTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть числа через кому: ");
        String listOfNumbers = sc.nextLine();

        Arr arr = new Arr(listOfNumbers);
        System.out.println(arr);

//        arr.deleteDuplicates();
//        System.out.println(arr); на жаль не вийшло реалізувати цей метод, так як потрібно початковий стрінг розпарсити на цифри, але ми ще не брали роботу з стрінгами, тому не знаю як це коректно зробити(

    }
}
