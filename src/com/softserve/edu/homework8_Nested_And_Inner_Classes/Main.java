package com.softserve.edu.homework8_Nested_And_Inner_Classes;

public class Main {
    public static void main(String[] args) {

        FullName fullName1 = new FullName("Alice", "Smith");
        FullName fullName2 = new FullName("Bob", "Johnson");

        Student student1 = new Student(fullName1, 20, 1);
        Student student2 = new Student(fullName2, 22, 2);

        System.out.println(student1.info());
        System.out.println(student1.activity());
        System.out.println(student2.info());
        System.out.println(student2.activity());

        //clone student
        Student student3 = student1.clone();
        student3.setCourse(3);

        System.out.println(student3.info());
        System.out.println(student3.activity());

    }
}
