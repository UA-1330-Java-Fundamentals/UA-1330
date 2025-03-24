package Task3;

import java.util.*;
import java.util.Arrays;

public class StudentsAppl {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Olivia", 3));
        students.add(new Student("Sophia", 5));
        students.add(new Student("Liam", 2));
        students.add(new Student("Isabella", 3));
        students.add(new Student("Isabella", 5));

        System.out.println("Students course 3 " + Student.printStudents(students, 3));
        System.out.println("Students course 5 " + Student.printStudents(students, 5));


        Collections.sort(students);
        System.out.println("Sorted compareTo " + students);

        Collections.sort(students, new Student.byName());
        System.out.println("Sorted by name " + students);

        Collections.sort(students, new Student.byCourse());
        System.out.println("Sorted by course " + students);

        Collections.sort(students, new Student.ByNameAndCourse());
        System.out.println("Sorted by name and course " + students);








    }



}
