package com.softserve.innerclasses.homework12;

public class Student extends Person implements Cloneable{
    private int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String info(){
        return  super.info() + " ,Course: " + course;
    }

    @Override
    public String activity(){
      return "I study at university";
    }

    @Override
    public Student clone() throws CloneNotSupportedException{
        Student myClone = (Student) super.clone();
        myClone.setFullName((FullName) getFullName().clone());
        return myClone;
    }
}
