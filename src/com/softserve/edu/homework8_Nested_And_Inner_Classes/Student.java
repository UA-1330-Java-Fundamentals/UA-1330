package com.softserve.edu.homework8_Nested_And_Inner_Classes;

public class Student extends Person {
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

    public Student(Student student) {
        super(student.getFullName(), student.getAge());
        this.course = student.course;
    }

    @Override
    public String info() {
        return super.info() + ", Course: " + course;
    }

    @Override
    public String activity() {
        return "I study at university";
    }

    public Student clone() {
        return new Student(this);
    }
}
