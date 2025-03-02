package com.softserve.edu.hw8;

public class Student extends Person implements Cloneable{
    int course;

    public Student(int course, FullName fullName, int age) {
        super(fullName,age);
        this.course = course;

    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String activity() {
        return "I am a student";
    }

    @Override
    void info() {
      System.out.println("First name: " + fullName.firstName + ", Last name: " + fullName.lastName + ", Age: " + age + ", Course = " + course );
  }

    @Override
    public Student clone() throws CloneNotSupportedException {
        Student myClone = (Student) super.clone();
        myClone.setFullName(getFullName().clone());
        return myClone;
    }
}
