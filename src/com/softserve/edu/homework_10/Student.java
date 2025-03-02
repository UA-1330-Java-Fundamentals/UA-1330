package com.softserve.edu.homework_10;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Student implements Comparable<Student> {

    public static class ByName implements Comparator<Student> {
        @Override
        public int compare(Student st1, Student st2) {
            return st1.getName().compareTo(st2.getName());
        }
    }

    public static class ByCourse implements Comparator<Student> {
        @Override
        public int compare(Student st1, Student st2) {
            return st1.getCourse() - st2.getCourse();
        }
    }

    public static class ByNameAndCourse implements Comparator<Student> {
        @Override
        public int compare(Student st1, Student st2) {
            int byName = st1.getName().compareTo(st2.getName());
            return byName == 0 ? st1.getCourse() - st2.getCourse() : byName;
        }
    }

    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public static void printStudents(List<Student> students, Integer course) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == course) {
                System.out.println("\tName: " + student.name + ", course: " + student.course);
            }
        }
    }

    public static void printAllStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println("\tName: " + student.name + ", course: " + student.course);
        }
    }

    @Override
    public String toString() {
        return "\tName: " + name + ", course: " + course;
    }

    @Override
    public int compareTo(@NotNull Student student) {// Default Sort
        //return name.compareTo(student.getName());
        return course - student.getCourse();
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(List.of(
                new Student("Kate Middleton", 1),
                new Student("Jenna Coleman", 4),
                new Student("Emma Chamberlain", 4),
                new Student("Jenna Ortega", 2),
                new Student("Megan Fox", 5)
        ));

        System.out.println("All students: ");
        printAllStudents(students);

        /*
        Print the names of the students from the list who are enrolled in
        the specified course to the console using an iterator
        */
        Integer course = 4;
        System.out.println("\nStudents from course " + course + ": ");
        printStudents(students, course);

        //Sort students using comparator
        System.out.println("\nSorted students by name:");
        students.sort(new ByName());
        printAllStudents(students);

        System.out.println("\nSorted students by course:");
        students.sort(new ByCourse());
        printAllStudents(students);

        System.out.println("\nSorted students by name and course:");
        students.sort(new ByNameAndCourse());
        printAllStudents(students);

        //Compare two students
        System.out.print("\nIs student " + students.get(0).getName()
                + " in the same course as " + students.get(1).getName() + "? ");
        System.out.println(students.get(0).compareTo(students.get(1)) == 0 ? "Yes." : "No.");
    }
}
