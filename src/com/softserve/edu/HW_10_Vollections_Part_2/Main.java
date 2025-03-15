package com.softserve.edu.HW_10_Vollections_Part_2;

import java.util.*;

public class Main {


    public static void main(String[] args) {


        // 1. Develop parameterized methods union(Set set1, Set set2) and intersect(Set set1, Set set2),
        // realizing the operations of union and intersection of two sets. Test the operation
        //of these techniques on two pre-filled sets.
        System.out.println("\n--------------Task 1----------------------");
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);

        System.out.println("Множина 1: " + set1);
        System.out.println("Множина 2: " + set2);

        Set<Integer> unionSet = union(set1, set2);
        System.out.println("Об'єднання множин: " + unionSet);

        Set<Integer> intersectSet = intersect(set1, set2);
        System.out.println("Перетин множин: " + intersectSet);


        //2. Create a map called personMap and populate it with ten entries of type <String,
        //String>, where each entry corresponds to a person's last name and first name. Display
        //the contents of the map on the screen. Are there at least two persons with the same
        //first name among these ten people? Remove the person from the map whose first
        //name is "Orest" (or any other specified name). Print the resulting map after the
        //removal.
        System.out.println("\n--------------Task 2 ----------------------");
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Іваненко", "Іван");
        personMap.put("Петренко", "Петро");
        personMap.put("Сидоренко", "Олексій");
        personMap.put("Коваленко", "Марія");
        personMap.put("Шевченко", "Тарас");
        personMap.put("Бойко", "Олег");
        personMap.put("Кравченко", "Олег");
        personMap.put("Ткаченко", "Наталія");
        personMap.put("Мельник", "Орест");
        personMap.put("Лисенко", "Орест");

        System.out.println("Початковий Map:");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        boolean hasDuplicateFirstNames = hasDuplicateFirstNames(personMap);
        System.out.println("\nЧи є хоча б дві людини з однаковим ім'ям? " + hasDuplicateFirstNames);


        String nameToRemove = "Орест";
        removePersonByFirstName(personMap, nameToRemove);

        System.out.println("\nMap після видалення людини з ім'ям \"" + nameToRemove + "\":");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


        //3. Create a class named Student that stores information about the student's name and
        //course.
        //• The class should include properties to access these fields, a constructor with
        //parameters, and a method called printStudents that takes a List of students and an
        //Integer representing the course number as arguments.
        //• This method should print the names of the students from the list who are enrolled in
        //the specified course to the console using an iterator.
        //• Additionally, add methods to compare students by name and by course.
        //• In the main() method, create a List named "students" and add five different Student
        //objects to it. Then, display the list of students sorted by name and sorted by course.
        System.out.println("\n--------------Task 3 ----------------------");
        List<Student> students = new ArrayList<>();
        students.add(new Student("Іван", 2));
        students.add(new Student("Марія", 1));
        students.add(new Student("Олексій", 3));
        students.add(new Student("Наталія", 2));
        students.add(new Student("Олег", 1));

        System.out.println("Початковий список студентів:");
        students.forEach(System.out::println);

        Student.printStudents(students, 2);

        students.sort(Student.compareByName());
        System.out.println("\nСписок студентів, відсортований за ім'ям:");
        students.forEach(System.out::println);

        students.sort(Student.compareByCourse());
        System.out.println("\nСписок студентів, відсортований за курсом:");
        students.forEach(System.out::println);



    }

    private static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }
    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1); // Копіюємо першу множину
        result.addAll(set2); // Додаємо всі елементи другої множини
        return result;
    }

    private static void removePersonByFirstName(Map<String, String> personMap, String firstName) {
        personMap.entrySet().removeIf(entry -> entry.getValue().equals(firstName));
    }


    private static boolean hasDuplicateFirstNames(Map<String, String> personMap) {
        // Використовуємо Set для зберігання унікальних імен
        Set<String> firstNames = new HashSet<>();

        for (String firstName : personMap.values()) {
            if (!firstNames.add(firstName)) { // Якщо ім'я вже є в Set, повертаємо true
                return true;
            }
        }
        return false;
    }
}
