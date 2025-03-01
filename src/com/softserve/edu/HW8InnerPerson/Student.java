package com.softserve.edu.HW8InnerPerson;

public class Student extends Person {
    private int course;

    public Student(FullName fullname, int age, int  course) {
        super(fullname, age);
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String activity() {
        return "I study at university on the course: " + getCourse();
    }

    @Override
    protected Student clone() throws CloneNotSupportedException {
        Student studentClone = (Student) super.clone();
        studentClone.setFullName(getFullname().clone());
        studentClone.setCourse(this.getCourse());
        return studentClone;
    }

    @Override
    public String info() {
        return super.info() + "; " + activity();
    }
}
