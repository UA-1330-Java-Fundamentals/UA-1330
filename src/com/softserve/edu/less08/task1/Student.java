package com.softserve.edu.less08.task1;

public class Student extends Person implements Cloneable {
    private int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String info() {
        return super.info() + ", course: " + getCourse();
    }

    @Override
    public String activity() {
        return "I study at the university";
    }

    @Override
    public Person clone() {
        try {
            Person copyofPerson = (Person) super.clone();
            copyofPerson.setFullName((FullName) copyofPerson.getFullName().clone());
            return copyofPerson;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
