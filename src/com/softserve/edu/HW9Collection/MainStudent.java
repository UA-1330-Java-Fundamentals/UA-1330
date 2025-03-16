package com.softserve.edu.HW9Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainStudent {
    public static void main(String[] args) {
        //Student1
        Map<String, Integer> grades1 = new HashMap<>();
        grades1.put("Math", 7);
        grades1.put("English", 10);
        grades1.put("PE", 12);
        grades1.put("chemistry", 5);
        grades1.put("strength of material", 8);

        List<StudentAverageGrade> students = new ArrayList<>();
        students.add(new StudentAverageGrade("Irina", "Gr-23", 3, grades1));

        //Student2
        Map<String, Integer> grades2 = new HashMap<>();
        grades2.put("Math", 2);
        grades2.put("English", 9);
        grades2.put("PE", 3);
        grades2.put("chemistry", 5);
        grades2.put("strength of material", 8);
        students.add(new StudentAverageGrade("Petro", "Gr-23", 2, grades2));


        //Student3
        Map<String, Integer> grades3 = new HashMap<>();
        grades3.put("Math", 2);
        grades3.put("English", 3);
        grades3.put("PE", 2);
        grades3.put("chemistry", 2);
        grades3.put("strength of material", 2);
        students.add(new StudentAverageGrade("Ivanna", "Gr-25", 1, grades3));

        //Student4
        Map<String, Integer> grades4 = new HashMap<>();
        grades4.put("Math", 3);
        grades4.put("English", 3);
        grades4.put("PE", 3);
        grades4.put("chemistry", 3);
        grades4.put("strength of material", 3);
        students.add(new StudentAverageGrade("Kate", "Gr-21", 5, grades4));

        //Print initial student list
        PrintStudents.printInitialStList(students);
        System.out.println(" ");


        RemoveStLowGrades.removeStudentLowGrade(students);
        //Print Student list after the student removing withe grade below 3
        PrintStudents.printStudents(students);
    }
}

