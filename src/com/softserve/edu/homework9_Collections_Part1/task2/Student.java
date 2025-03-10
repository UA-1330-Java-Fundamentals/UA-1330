package com.softserve.edu.homework9_Collections_Part1.task2;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String group;
    private Integer course;

    List<Integer> grades = new ArrayList<>();

    public Student(String name, String group, Integer course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public Integer getCourse() {
        return course;
    }


    public Double getAvarageGrades() {
        Double sum = 0.00;
        for (int i = 0; i < grades.size(); i++) {
            sum += grades.get(i);
        }

        return sum / grades.size();

    }

    /*
    Write a methods that  removes students with a grade point average of less than 3.
    If a student's average score is 3 or higher, then they will be automatically promoted to the next course level.
     */
    public static void removeLowScorers(List<Student> students) {
        List<Student> usersToRemove = new ArrayList<>();

        for (Student student : students) {
            if (student.getAvarageGrades() < 3) {
                usersToRemove.add(student);
            } else {
                student.setCourse(student.getCourse() + 1);
            }
        }

        students.removeAll(usersToRemove);
    }

    /*
    This method should print out the names of the students who are enrolled in the specified course number to the console.
     */
    public static void printStudents(List<Student> students, int course) {

        boolean found = false;
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No students found in course " + course + ".");
        }
    }
}
