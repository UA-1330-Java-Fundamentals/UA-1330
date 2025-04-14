package com.softserve.innerclasses.collections.homework2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Student {
    private String name;
    private String group;
    private int course;
    private List<Integer> grades = new ArrayList<>(5);

    public Student(String name, String group, int course) {
        Random rand = new Random();
        this.name = name;
        this.group = group;
        this.course = course;
        for (int j = 0; j<5; j++)
        {
            this.grades.add(rand.nextInt((5 - 1) + 1) + 1);
        }
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
    public double CalculateAverageGrade(){
        List<Integer> gradesToCheck = getGrades();
        double sum =0 ;
        double average = 1.0;
        for (Integer  i: gradesToCheck){
            sum+= i;
        }
        average = Math.round(sum/grades.size());
        return  average;
    }

    public static void PrintStudentInformation(List<Student> students){
        for (Student currentStudent: students){
            System.out.println("Student " + currentStudent.getName() +
                    ",from group: " + currentStudent.getGroup() +
                    " ,has next grades: " + currentStudent.getGrades() +
                    ", average grade:" + currentStudent.CalculateAverageGrade() +
                    " ,studying on " + currentStudent.getCourse() + " course");
        }
    }

    public static void RemoveStudentsWithLowGrades(List<Student> students){
        int counter =0;
        int course = 0;
        for (int i=0; i< students.size();i++){
            if(students.get(i).CalculateAverageGrade() < 3){
                counter++;
                System.out.println("Student " + students.get(i).getName() +
                        ", Has average grade less the 3: " + students.get(i).CalculateAverageGrade()
                        + " and will be removed.");
                students.remove(students.get(i));
            }
            else if(students.get(i).CalculateAverageGrade() > 3){
                counter++;

                course = students.get(i).getCourse();
                if (course<5) {
                    students.get(i).setCourse(course +1);
                }
                System.out.println("Student " + students.get(i).getName() +
                        ", Has average grade more that 3: " + students.get(i).CalculateAverageGrade()
                        + " and will be promoted to next course");
            }
        }
           if(counter ==0 ){
               System.out.println("Student with average grade less 3.0 was not found");
           }
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
    public String toString() {
        return "name='" + getName() +
                ", group='" + getGroup() + '\'' +
                ", course=" + course +
                ", grades=" + grades;
    }
}
