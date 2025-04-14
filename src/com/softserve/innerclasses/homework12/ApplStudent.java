package com.softserve.innerclasses.homework12;

public class ApplStudent {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student1 = new Student(new FullName("Jack","Black"),25,5);
        Student student2 = new Student(new FullName("Anne","Clock"),17,1);

        System.out.println(student1.info() + " " +  student1.activity());
        System.out.println(student2.info() + " " +  student1.activity());

        Person student3 = student2.clone();
        student3.setFullName(new FullName("Maggie", "Smith"));
        System.out.println("Clone of Anne: " + student3.info());
    }

}
