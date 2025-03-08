package com.softserve.edu.homework8_Nested_And_Inner_Classes;

public class Student extends Person implements Cloneable {
    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    private int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    @Override
    public String info() {
        return super.info() + ", Course: " + course;
    }

    @Override
    public String activity() {
        return "I study at university";
    }

    @Override
    public Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }

}
