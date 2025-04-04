package homework10.Task3;

import java.util.Iterator;
import java.util.List;

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
public class Student {
    private String name;
    private Integer course;

    public Student(String name, Integer course) {
        this.name = name;
        this.course = course;
    }
//print the names of the students from the list who are enrolled in the specified course to the console using an iterator
    public static void printStudents(List<Student> studentList, int courseNumber) {
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse().equals(courseNumber)) {
                System.out.println(student);
            }
        }
    }
/*
    public void printStudents(List<Student> studentList, int courseNumber){
        for( var student : studentList){
            if(student.getCourse()== courseNumber){
                System.out.println(student);
            }
        }
    }
 */
public static int compareByName(Student s1, Student s2) {
    return s1.getName().compareTo(s2.getName());
}

public static int compareByCourse(Student s1, Student s2) {
        return s1.getCourse().compareTo(s2.getCourse());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + ", course=" + course + '}';
    }
}
