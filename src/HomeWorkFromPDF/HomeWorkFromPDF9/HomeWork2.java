/*
Create a class called Student which includes the following fields: name, group, course, and
grades in different subjects. Create a collection that holds all objects. Write a methods that:
o removes students with a grade point average of less than 3. If a student's average score is
3 or higher, then they will be automatically promoted to the next course level.
o printStudents(List<Student> students, int course) which takes a list of students and a
course number as inputs. This method should print out the names of the students who
are enrolled in the specified course number to the console.
• In main() method create collection and output result.
*/

package HomeWorkFromPDF.HomeWorkFromPDF9;

import java.util.*;

class Student{
    private String name;
    private String group;
    private int course;
    private Map<String, Integer> grades;

    public int getCourse() {
        return course;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "\nname='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", grades=" + grades +
                "\n}";
    }

    public Student(String name, String group, int course, Map<String, Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public int getAverage(){
        int sum = 0;
        for (int grade : grades.values()) {
            sum += grade;
        }
        return sum / grades.size();
    }
}

public class HomeWork2 {
    public static void removeStudentsWithGradeAverageLessThan3(List<Student> students){
        for (Student student : students){
            if (student.getAverage() < 3){
                students.remove(students.indexOf(student));
            }
        }
    }

    public static void printStudents(List<Student> students, int course){
        for (Student student : students){
            if (student.getCourse() == course){
                System.out.println("На курсі під номером " + course + " є студент на імя: " + student.getName());
            }
        }
    }

    public static void main(String[] args) {

        Map<String, Integer> grades1 = new HashMap<>();
        grades1.put("Math", 4);
        grades1.put("Physics", 3);
        grades1.put("History", 5);

        Student student1 =  new Student("Adam", "UA-1330", 2, grades1);



        Map<String, Integer> grades2 = new HashMap<>();
        grades2.put("Math", 2);
        grades2.put("Physics", 3);
        grades2.put("History", 1);

        Student student2 =  new Student("Bob", "UA-1330", 1, grades2);



        Map<String, Integer> grades3 = new HashMap<>();
        grades3.put("Math", 5);
        grades3.put("Physics", 5);
        grades3.put("History", 5);

        Student student3 =  new Student("Lora", "UA-1330", 5, grades3);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        System.out.println(students);
        removeStudentsWithGradeAverageLessThan3(students);
        System.out.println(students);

        printStudents(students, 2);
    }
}
