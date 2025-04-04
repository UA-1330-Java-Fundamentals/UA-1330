package homework10.Task3;

import java.util.*;

import static homework10.Task3.Student.printStudents;

public class Main {
    public static void main(String[] args) {
    List<Student> students = new ArrayList<>();
      students.add(new Student("Tom", 3));
      students.add(new Student("Alice", 1));
      students.add(new Student("Kate", 2));
      students.add(new Student("Joe", 3));
      students.add(new Student("Bruce", 1));

      int courseNumber = 3;
      System.out.println("List of students from course " + courseNumber + ":");
      printStudents(students,courseNumber);



        students.sort(Student::compareByName);
        System.out.println("Students compared by name: ");
        for(Student s : students){
            System.out.println(s);
        }

        students.sort(Student::compareByCourse);
        System.out.println("Students compared by course: ");
        for(Student s : students){
            System.out.println(s);
        }


    }
}
