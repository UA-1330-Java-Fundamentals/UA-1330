package com.softserve.edu.HW8InnerPerson;

public class MainCloneStudent {
    public static void main(String[] args) throws Exception {
        Student student1 = new Student(new FullName("Petrov", "Nick"), 35, 4);
        Student student2 = new Student(new FullName("Petrenko", "Ganna"), 25, 6);

        System.out.println("Student 1: " + student1.info());
        System.out.println("Student 2: " + student2.info());

        Student student3 = student1.clone();
        student3.setCourse(1);
        student3.setAge(20);
        System.out.println("Student 3: " + student3.info());
        //student3.getFullname().setFirstName("Boris");
        //student3.getFullname().setLastName("Nesterenko");

        student3.setFullName(new FullName("Alice", "Wonderland"));
        System.out.println("Student 3 (updated Name and FullName): " + student3.info());

    }
}
