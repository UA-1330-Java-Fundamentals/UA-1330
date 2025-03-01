package com.softserve.edu.homework_8;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("\nStudent #1: ");
        Student student1 = new Student(new FullName("Megan", "Fox"),21, 4);
        System.out.println(student1.info());
        System.out.println(student1.activity());

        System.out.println("\nStudent #2: ");
        Student student2 = new Student(new FullName("Jenna", "Coleman"),19, 2);
        System.out.println(student2.info());
        System.out.println(student2.activity());

        System.out.println("\nStudent #3: ");
        Student cloneStudent = student1.clone();
        cloneStudent.setCourse(1);
        System.out.println(cloneStudent.info());
        System.out.println(cloneStudent.activity());

        System.out.println("\nStudent #1: ");
        System.out.println(student1.info());
        System.out.println(student1.activity());
    }
}
