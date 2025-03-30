package com.softserve.edu.hw10CollectPart2Task3;

import java.util.*;

public class Student implements Comparable<Student>{
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public static void printStudents (List<Student> students, int course) {
        Iterator<Student> iterator = students.iterator();
        List<String> studentsOnCourse = new ArrayList<>();

        while (iterator.hasNext()) {
            Student current = iterator.next();
            if (current.getCourse() == course) {
                studentsOnCourse.add(current.getName());
            }
        }
        if (!studentsOnCourse.isEmpty()) {
            System.out.println("Students with specified course " + course + " are found: ");
            for (String studentName : studentsOnCourse) {
                System.out.println(studentName);
            }
        } else {
            System.out.println("Any student with specified course " + course + " is not found");
        }
    }

    //method to compare by Student name
    @Override
    public int compareTo(Student other) {
        int nameCompare = this.name.compareTo(other.name);
        if (nameCompare != 0) {
            return nameCompare; //if different name -> sort by name
        }
        return Integer.compare(this.course, other.course); //if names are the same -> sort by course
    }

    //method to compare by Student course
    public static Comparator<Student> byCourse() {
        return new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.getCourse(), s2.getCourse());
            }
        };
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
