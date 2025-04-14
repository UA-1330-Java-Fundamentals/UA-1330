package com.softserve.oop;



public class Student {
    private String name;
    private int rating;

   static int count = 0;

   public static double avgRating(Student ... students){
       int sum=0;
       for (Student stu: students){
           sum+=stu.rating;
       }
       return sum/count;
   }

    public static  boolean betterStudent(Student stu1, Student stu2){
        return stu1.rating > stu2.rating;
    }

    public Student() {
        System.out.println("Anonymous student was created");
        count++;
    }

    public Student(String name, int rating) {
        this.name = name;
        this.rating = rating;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }


}
