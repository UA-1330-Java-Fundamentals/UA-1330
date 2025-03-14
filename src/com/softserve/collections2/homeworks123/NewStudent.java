package com.softserve.collections2.homeworks123;

public class NewStudent implements Comparable<NewStudent>{

    public String name;

    public NewStudent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

   @Override
    public int compareTo(NewStudent st){
        return -st.getName().compareTo(this.name);
   }
}