package com.softserve.edu.hw3;

public class Student {
    private String name;
    private double rating;
    private static double totalRating = 0;
    private static int studentCount = 0;
    
    public Student() { // default constructor
        this.name = "Unknown";
        this.rating = 0;
        studentCount++;
    }

    public Student (String name, double rating) { // constructor with parametres
        this.name = name;
        this.rating = rating;
        totalRating += rating;
        studentCount++;
    }

// properties to access data
    public String getName() { // getter for name
        return name;
    }

    public void setName(String name){ // setter for name
        this.name = name;
    }

    public double getRating() { // getter for rating
        return rating;
    }

    public void setRating(float rating){ // setter for rating
        this.rating = rating;
    }

    public void display(){ // method to display student info
        System.out.println("Student name: " + name);
        System.out.println("Student rating: " + rating);
    }

    public static double avgRating() {
        if (studentCount == 0) return 0;
        return (double) totalRating / studentCount;
    }

    public boolean betterStudent(Student s) {
        return this.rating > s.rating;
    }

    @Override
    public String toString(){
        return "Student Name: " + name + ", Rating: " + rating;
    }
}

