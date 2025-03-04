package com.softserve.collections2.homeworks123;
import java.util.Comparator;
import java.util.List;

public class Student  implements Comparable <Student>{
    private String name;
    private int course;

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

    public static void PrintStudents(List<Student> students, int course){
        int counter =0;
        if(course<1 || course > 5){
            System.out.println("Incorrect course number");
        }
        for (Student currentStudent : students){
            if(currentStudent.getCourse() == course){
                System.out.println("Student " + currentStudent.getName() +
                        " is studying on " + course + " course");
                counter++;
            }
        }
        if(counter ==0 ){
            System.out.println("Student with entered course was not found");
        }
    }

    @Override
    public int compareTo(Student student) {
        int byName = getName().compareTo(student.getName());
        return byName == 0 ? getCourse() - student.getCourse() : byName;

    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
