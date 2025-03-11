package com.softserve.edu.HW_8_Nested_And_Inner_Classes;

import com.softserve.edu.HW_8_Nested_And_Inner_Classes.Task1.FullName;
import com.softserve.edu.HW_8_Nested_And_Inner_Classes.Task2.Student;

public class Main {

    public static void main(String[] args) {
        /*
          1. Create a FullName class with the firstName and lastName fields of type String, which
             would correspond to the principle of encapsulation.
             • Create an abstract Person class with fullName field of type FullName and age of type int.
             • In the Person class, create:
               o a constructor public Person(FullName fullName, int age);
               o info() method, which will return a string in the format
                 "First name: <firstName>, Last name: <lastName>, Age: <age>"
               o an abstract public activity() method with a String return type


  2. Create a Student class with an int field that matches the course the student is taking.
     • In the Student class:
       o create a constructor with parameters to initialize all fields in the class;
       o override the info() method (which would also add course information to the
         previous line);
       o override the activity() method from the Person class. The activity() method should
         return a string value that is the type of activity for the corresponding Person subtype,
         for example for a student - this could be the value "I study at university".
     • In the main() method, create two instances of the Student class and output information
       about them by calling the appropriate methods info() and activity().
     • Create one more instance of Student class by cloning the first student, change a course
       for this object and output full information about created students.
*/



        FullName name1 = new FullName("John", "Doe");
        FullName name2 = new FullName("Alice", "Smith");

        // Створення двох студентів
        Student student1 = new Student(name1, 20, 2);
        Student student2 = new Student(name2, 22, 3);

        // Виведення інформації про студентів
        System.out.println(student1.info());
        System.out.println(student1.activity());
        System.out.println(student2.info());
        System.out.println(student2.activity());

        // Клонування першого студента
        Student clonedStudent = student1.cloneStudent();
        clonedStudent.setCourse(4); // Зміна курсу у клонованого студента

        // Виведення інформації про всіх студентів
        System.out.println(clonedStudent.info());
        System.out.println(clonedStudent.activity());


    }
}
