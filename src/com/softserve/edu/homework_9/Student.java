package com.softserve.edu.homework_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Student {
    private String name;
    private String group;
    private int course;
    private List<Integer> grades;

    public Student(String name, String group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    private double getAverageGrade() {
        double sum = 0.0;
        for (Integer grade : grades) {
            sum += grade;
        }

        return sum / grades.size();
    }

    public static void removeOrPromoteStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageGrade() < 3) {
                iterator.remove();
            } else {
                student.course++;
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("\nStudents that are enrolled in course #" + course + ":");
        for (Student student : students) {
            if (student.course == course) {
                System.out.println(student.name);
            }
        }
    }

    @Override
    public String toString() {
        String student = "\n\tName: " + name + ", group: " + group + ", course: " + course + ", grades {";
        for (Integer grade : grades) {
            student += (grade + ", ");
        }
        student += "}";
        return student;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Kate Middleton", "ET-12", 3, Arrays.asList(10, 10, 10, 10)));
        students.add(new Student("Jenna Coleman", "ET-12", 4, Arrays.asList(5, 7, 12, 6)));
        //average grade lower than 3
        students.add(new Student("Emma Chamberlain", "ET-12", 5, Arrays.asList(1, 4, 5, 1)));
        //average grade lower than 3
        students.add(new Student("Jenna Ortega", "ET-12", 6, Arrays.asList(1, 2, 3, 4)));
        students.add(new Student("Megan Fox", "ET-12", 4, Arrays.asList(12, 12, 12, 11)));

        System.out.println("All students: " + students);

        removeOrPromoteStudents(students);
        System.out.println("\nList without students with a grade point average of less than 3 " +
                "and list with remaining promoted students: " + students);

        printStudents(students, 4);
    }
}
