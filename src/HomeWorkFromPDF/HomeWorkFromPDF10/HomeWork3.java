/*
Create a class named Student that stores information about the student's name and
course.
• The class should include properties to access these fields, a constructor with
parameters, and a method called printStudents that takes a List of students and an
Integer representing the course number as arguments.
• This method should print the names of the students from the list who are enrolled in
the specified course to the console using an iterator.
• Additionally, add methods to compare students by name and by course.
• In the main() method, create a List named "students" and add five different Student
objects to it. Then, display the list of students sorted by name and sorted by course.
*/

package HomeWorkFromPDF.HomeWorkFromPDF10;

import java.util.*;

class Student implements Comparable<Student>{
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    //    public List<Student> printStudents(List<Student> students, Integer course){
//        List<Student> studentsOfCourseProvidedByUser = new LinkedList<>();
//
//        for (Student currentStudent : students){
//            if (currentStudent.getCourse() == course){
//                studentsOfCourseProvidedByUser.add(currentStudent);
//            }
//        }
//
//        return studentsOfCourseProvidedByUser;
//    }

    public static void printStudents(List<Student> students, Integer course){
        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()){
            Student curr = iterator.next();
            if (curr.getCourse() == course){
                System.out.println(curr.getName());
            }
        }
    }

    @Override
    public int compareTo(Student student){
        return this.name.compareTo(student.name);
    }

    public static Comparator<Student> byCourse() {
        return new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.getCourse(), s2.getCourse());
            }
        };
    }
}



public class HomeWork3 {
    public static void main(String[] args) {
        List<Student> students = new LinkedList<>();
        students.add(new Student("Bob", 1));
        students.add(new Student("Alice", 2));
        students.add(new Student("Charlie", 1));
        students.add(new Student("David", 3));

        System.out.println("Students in course 1:");
        Student.printStudents(students, 1);

        System.out.println("\nNot sorted by name: " + students);
        Collections.sort(students);
        System.out.println("\nSorted by name: " + students);

        students.sort(Student.byCourse());
        System.out.println("\nSorted by course: " + students);
    }
}
