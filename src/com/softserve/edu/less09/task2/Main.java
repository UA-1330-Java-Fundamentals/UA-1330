package com.softserve.edu.less09.task2;

import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();
        Student student1 = new Student("Mariia", 1, "MM-12-3", generateSubgect());
        Student student2 = new Student("Mary", 2, "MM-12-2", generateSubgect());
        Student student3 = new Student("Kostia", 3, "MM-12-1", generateSubgect());
        students.add(student1);
        students.add(student2);
        students.add(student3);
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        students.removeIf(student -> avgGrade(student) < 3.0);
        System.out.println("\n");
        students.forEach(System.out::println);
        System.out.println("\n");
        System.out.println("avgGrade(student1) = " + avgGrade(student1));
        System.out.println("avgGrade(student2) = " + avgGrade(student2));
        System.out.println("avgGrade(student3) = " + avgGrade(student3));
        students.stream()
                .filter(student -> avgGrade(student) > 3.0)
                .forEach(student -> student.setCourse(student.getCourse() + 1));
        students.forEach(System.out::println);
        System.out.println("printStudents\n");
        printStudents(students,3);


    }

    public static Map<Subject, List<Integer>> generateSubgect() {
        Map<Subject, List<Integer>> grades = new HashMap<Subject, List<Integer>>();
        grades.put(Subject.Biology, generateGrade());
        grades.put(Subject.English, generateGrade());
        grades.put(Subject.Math, generateGrade());
        grades.put(Subject.Germany, generateGrade());
        grades.put(Subject.Geography, generateGrade());
        return grades;
    }

    public static double avgGrade(Student student) {
        int count = 0;
        int sum = 0;
        Map<Subject, List<Integer>> grades = student.getGrades();
        for (Map.Entry<Subject, List<Integer>> entry : grades.entrySet()) {
            Subject subject = entry.getKey();
            List<Integer> studentGrades = entry.getValue();
            for (Integer grade : studentGrades) {
                sum += grade;
                count++;
            }
        }
        return (double) sum / count;

    }

    public static List<Integer> generateGrade() {
        List<Integer> myGrade = new ArrayList<>();
        Random generateNumber = new Random();
        for (int i = 0; i < 5; i++) {
            int randNumber = generateNumber.nextInt(5) + 1;
            myGrade.add(randNumber);
        }
        return myGrade;
    }

    public static void printStudents(List<Student> students, int course){
        List<Student> collect = students.stream()
                .filter(student -> student.getCourse() == course)
                .collect(Collectors.toList());
        collect.forEach(System.out::println);
    }


}

