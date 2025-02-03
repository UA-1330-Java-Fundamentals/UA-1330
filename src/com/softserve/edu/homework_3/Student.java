package com.softserve.edu.homework_3;

public class Student {
    private String name;
    private double rating;

    static int count = 0;

    public Student() {
        this.name = "Name Surname";
        this.rating = 0.0;
        count++;
    }

    public Student(String name, double rating) {
        this.name = name;
        this.rating = rating;
        count++;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public static double avgRating(Student... students) {
        double sumOfRatings = 0;
        for (Student student: students) {
            sumOfRatings += student.rating;
        }
        return sumOfRatings / count;
    }

    public boolean betterStudent(Student otherStudent) {
        return this.rating > otherStudent.rating;
    }

    @Override
    public String toString() {
        return "\nName: " + name + ", Rating: " + rating;
    }
}
