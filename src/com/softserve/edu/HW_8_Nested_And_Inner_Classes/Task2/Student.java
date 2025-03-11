package com.softserve.edu.HW_8_Nested_And_Inner_Classes.Task2;

import com.softserve.edu.HW_8_Nested_And_Inner_Classes.Task1.FullName;
import com.softserve.edu.HW_8_Nested_And_Inner_Classes.Task1.Person;

public class Student extends Person {
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

    // Метод для клонування студента
    public Student cloneStudent() {
        return new Student(new FullName(super.fullName.getFirstName(), super.fullName.getLastName()), super.age, this.course);
    }

    // Метод для зміни курсу
    public void setCourse(int course) {
        this.course = course;
    }
}