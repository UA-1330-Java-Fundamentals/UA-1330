package com.softserve.edu.HW_9_Collections_P_1;

import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private String group;
    private int course;
    private final List<Integer> grades;

    // Конструктор
    public Student(String name, String group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        //this.grades = grades;
        this.grades = new ArrayList<>(Objects.requireNonNull(grades, "Grades cannot be null"));
    }

    // Геттери та сеттери
    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public List<Integer> getGrades() {
       // return grades;
        return new ArrayList<>(grades); // Повертаємо копію
    }

    // Метод для обчислення середнього балу
    public double getAverageGrade() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    // Метод для видалення студентів з середнім балом менше 3 та підвищення курсу
    public static void removeUnderperformingStudents(List<Student> students) {
        students.removeIf(student -> {
            double averageGrade = student.getAverageGrade();
            if (averageGrade < 3.0) {
                return true; // Видалити студента
            } else {
                // Підвищити курс
                student.setCourse(student.getCourse() + 1);
                return false; // Залишити студента
            }
        });
    }

    // Метод для виведення студентів за курсом
    public static void printStudents(List<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    // Перевизначення методу toString для зручного виведення
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", grades=" + grades +
                '}';
    }
}

