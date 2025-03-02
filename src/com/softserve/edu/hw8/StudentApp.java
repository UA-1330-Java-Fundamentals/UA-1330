package com.softserve.edu.hw8;

public class StudentApp {
    public static void main(String[] args) throws CloneNotSupportedException {
        FullName fullName1 = new FullName("Kate","Ret");
        Student student = new Student(4, fullName1, 18 );
        student.info();
        System.out.println(student.activity());

        FullName fullName2 = new FullName("Peter","Red");
        Student student1 = new Student(1, fullName2, 20 );
        student1.info();
        System.out.println(student1.activity());

        Student student2 = student.clone();
        student2.setCourse(5);
        student2.info();
        System.out.println(student2.activity());
    }


}
