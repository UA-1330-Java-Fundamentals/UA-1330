package com.softserve.edu.HW_9_Collections_P_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {



//   1. Declare collection myCollection of 10 integers and fill it (from the console or random).

    //• Swap the maximum and minimum elements in the list.
    //• Insert a random three-digit number before the first negative element of the list
    //• Insert a zero between all neighboring elements collection myCollection with different signs
    //• Copy the first k elements of the myCollection to the list1, in direct order, and the rest to the
    //        list2 in reverse order.
    //• In a list myCollection remove the last even element (if there are even elements in the list). If
    //        there is no such element, display a message.
    //• Remove from the list myCollection the element following the first minimum. If the minimum
    //        element is the last one, nothing needs to be removed.
    //        Use one or more of the next: List, ArrayList, LinkedList


        System.out.println("----------------Завдання 1 ----------------------");

        ArrayList<Integer> myCollection  = new ArrayList<>();
        Random random = new Random();
//        for (int i = 0; i <10; i++) {
//            myCollection.add(random.nextInt(200) -100);
//        }
        myCollection.add(-20);
        myCollection.add(20);
        myCollection.add(100);
        myCollection.add(56);
        myCollection.add(0);
        myCollection.add(-11);
        myCollection.add(23);
        myCollection.add(55);
        myCollection.add(-99);
        myCollection.add(-13);
        myCollection.add(60);

        System.out.println("Original: " + myCollection);

        ArrayList<Integer> task1List  = new ArrayList<>(myCollection);
                swapMinMax(task1List);
        System.out.println("Swap Min Max: " + task1List);

        ArrayList<Integer> task2List  = new ArrayList<>(myCollection);
                insertBeforeFirstNegative(task2List , random);
        System.out.println("Insert before first negative: " + task2List );

        ArrayList<Integer> task3List  = new ArrayList<>(myCollection);
                insertZeroBetweenDifferentSigns(task3List);
        System.out.println("Insert zero between different signs: "  + task3List );


        // 4. Розділити колекцію на list1 (перші k елементів) та list2 (решта у зворотному порядку)

        int k = 6; // Наприклад, k = 5
        List<Integer> task4list1 = new ArrayList<>(myCollection.subList(0, k));
        List<Integer> task4list2 = new ArrayList<>(myCollection.subList(k, myCollection.size()));
        reverseList(task4list2);
        System.out.println("list1 (перші " + k + " елементів): " + task4list1);
        System.out.println("list2 (решта у зворотному порядку): " + task4list2);

        ArrayList<Integer> task5List = new ArrayList<>(myCollection);
        removeLastEven(task5List);

        ArrayList<Integer> task6List = new ArrayList<>(myCollection);
        removeAfterFirstMin(task6List);


        //2. Create a class called Student which includes the following fields: name, group, course, and
        //  grades in different subjects. Create a collection that holds all objects. Write a methods that:
        //• removes students with a grade point average of less than 3. If a student's average score is
        //  3 or higher, then they will be automatically promoted to the next course level.
        //• printStudents(List<Student> students, int course) which takes a list of students and a
        //  course number as inputs. This method should print out the names of the students who
        //  are enrolled in the specified course number to the console.
        //• In main() method create collection and output result.


        System.out.println("\n----------------Завдання 2 ----------------------");
        // Створення колекції студентів
        List<Student> students = new ArrayList<>();
        students.add(new Student("Іван Петренко", "Група 1", 1, List.of(4, 3, 5, 2)));
        students.add(new Student("Марія Іваненко", "Група 2", 2, List.of(5, 5, 5, 5)));
        students.add(new Student("Олексій Сидоров", "Група 1", 1, List.of(2, 2, 3, 2)));
        students.add(new Student("Анна Коваленко", "Група 3", 3, List.of(4, 4, 3, 4)));

        System.out.println("Початковий список студентів:");
        students.forEach(System.out::println);

        // Видалення студентів з середнім балом менше 3 та підвищення курсу
        Student.removeUnderperformingStudents(students);
        System.out.println("\nСписок студентів після видалення та підвищення курсу:");
        students.forEach(System.out::println);

        // Виведення студентів за курсом
        System.out.println("\nСтуденти на 2 курсі:");
        Student.printStudents(students, 2);


    }

    private static ArrayList<Integer> swapMinMax(ArrayList<Integer> list) {
        int minIndex = 0, maxIndex = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < list.get(minIndex)) minIndex = i;
            if (list.get(i) > list.get(maxIndex)) maxIndex = i;
        }
        if (minIndex != maxIndex) {
            int temp = list.get(minIndex);
            list.set(minIndex, list.get(maxIndex));
            list.set(maxIndex, temp);
        }
        return list;
    }

    private static ArrayList<Integer> insertBeforeFirstNegative(ArrayList<Integer> list, Random random) {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                list.add(i, 100 + random.nextInt(900)); // Випадкове тризначне число
                break;
            }
        }
        return list;
    }

    private static ArrayList<Integer> insertZeroBetweenDifferentSigns(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if ((list.get(i) >= 0 && list.get(i+1) < 0 )||(list.get(i) < 0  &&list.get(i+1) >= 0 )) {
                list.add(i + 1, 0);
                i++; // Пропустити наступний елемент, щоб уникнути безкінечного циклу
            }
        }
        return list;
    }
    private static void reverseList(List<Integer> list) {
        for (int i = 0, j = list.size() - 1; i < j; i++, j--) {
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }
    }

   private static void removeLastEven(List<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) % 2 == 0) {
                System.out.println("Removing last even element: " + list.get(i));
                list.remove(i);
                System.out.println("After removing last even: " + list);
                return;
            }
        }
        System.out.println("No even elements found.");
    }

    private static void removeAfterFirstMin(List<Integer> list) {
        if (list.isEmpty()) return;

        int minIndex = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < list.get(minIndex)) {
                minIndex = i;
            }
        }

        if (minIndex < list.size() - 1) {
            System.out.println("Removing element after first minimum: " + list.get(minIndex + 1));
            list.remove(minIndex + 1);
            System.out.println("After removing element after min: " + list);
        } else {
            System.out.println("Minimum element is the last one, nothing to remove.");
        }
    }
}
