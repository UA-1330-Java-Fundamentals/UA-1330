package com.softserve.edu.HW8InnerPerson;

public abstract class Person implements Cloneable{
    private FullName fullname;
    private int age;

    public Person (FullName fullname, int age) {
        this.fullname = new FullName(fullname.getFirstName(), fullname.getLastName());
        this.age = age;
    }

    public FullName getFullname() {
        return fullname;
    }

    public int getAge() {
        return age;
    }

    public void setFullName (FullName fullname) {
        this.fullname = fullname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String info() {
        return "First name: " + fullname.getFirstName() + ", Last Name: " + fullname.getLastName() + ", Age: " + age;
    }

    public abstract String activity();

    @Override
    protected Person clone() throws CloneNotSupportedException {
        Person myClone = (Person) super.clone();
        myClone.setFullName(getFullname().clone());
        return myClone;
    }

/*    @Override
    public String toString() {
        return "Person{" +
                "fullname=" + fullname +
                ", age=" + age +
                '}';
    }*/
}


