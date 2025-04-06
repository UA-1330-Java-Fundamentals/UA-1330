package com.softserve.edu.less10.Collection.task3;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

@AllArgsConstructor
@Data
public class Student implements Comparable<Student> {

    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }

    public static Comparator<Student> compareByName() {
        return Comparator.comparing(Student::getName);
    }

    public static Comparator<Student> compareByCourse() {
        return Comparator.comparing(Student::getCourse);
    }

    private String name;
    private Integer course;

    public static void printStudent(Integer courseNumber, List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse().equals(courseNumber)) {
                System.out.println(student.getName() + " " + student.getCourse());
            }
        }

    }

}





