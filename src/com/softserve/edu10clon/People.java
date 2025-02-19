package com.softserve.edu10clon;

public class People implements Cloneable {
    private String name;
    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public People(People people) { // Constructor of Copy
        name = people.getName();
        age = people.getAge();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public People clone() throws CloneNotSupportedException {
        //return super.clone();
        People myClone = (People) super.clone();
        return myClone;
    }
}
