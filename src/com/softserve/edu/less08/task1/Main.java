package com.softserve.edu.less08.task1;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
       Student student1 = new Student(new Person.FullName("Mariia","Malyhina"),28,5);
       System.out.println(student1.info());
       Student student2 = new Student(new Person.FullName("Kostia","Malyhin"),17,3);
       System.out.println(student2.info());
       Student student3 = (Student) student1.clone();
       student3.setCourse(2);
       System.out.println(student3.info());

    }
}
