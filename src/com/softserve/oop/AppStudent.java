package com.softserve.oop;



public class AppStudent {
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student("Nick", 25);
        Student st3 = new Student("Maria" , 36);

        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);

        double avgResult = Student.avgRating(st1, st2,st3);

        System.out.println("The average rating of all " + Student.count  + " students is : " + avgResult);

        boolean best = Student.betterStudent(st2,st3);
        if (best) {
            System.out.println("Student " + st2.getName() + " is better than " + st3.getName());
        }
        else {
            System.out.println("Student " + st3.getName() + " is better than " + st2.getName());
        }

       int totalSum = st1.getRating() +st2.getRating() + st3.getRating();

        System.out.println("The total sum of student's rating is : " +  totalSum);

    }
}
