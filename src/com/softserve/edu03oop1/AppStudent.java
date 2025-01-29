package com.softserve.edu03oop1;

//public class AppStudent extends Object {
public class AppStudent {

    //public AppStudent(int i) {}

    // Overload
    public void printMessage() {
        System.out.println("No message provided");
    }

    // Overload
    public void printMessage(String message) {
        System.out.println("Message: " + message);
    }

    // Overload
    public void printMessage(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Message: " + message);
        }
    }

    public static void print(String welcomeMessage, Object... messages) {
        System.out.print(welcomeMessage);
        for (Object msg : messages) {
            System.out.print(msg);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        print("Hello ", "world ", 2025, " next ", 2026);
        //
        Student student = new Student("Ivan", "Ivanov", 21);
        Student student2 = new Student();
        //Student student3 = new Student();
        //
        System.out.println("Student:\t firstName: " + student.getFirstName()
                + "\t lastName: " + student.getLastName()
                + "\t age: " + student.getAge());
        //
        student.setAge(55);
        System.out.println("Student:\t firstName: " + student.getFirstName()
                + "\t lastName: " + student.getLastName()
                + "\t age: " + student.getAge());
        //
        System.out.println("Students count = " + student.getCount());
        //
        System.out.println("Student = " + student); // student.toString();
        //
        AppStudent app = new AppStudent();
        app.printMessage();
        app.printMessage("Hello");
    }
}
