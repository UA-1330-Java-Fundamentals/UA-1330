package com.softserve.edu.HW9Collection;

import java.util.List;

public class RemoveStLowGrades {
    public static void removeStudentLowGrade(List<StudentAverageGrade> students) {
        students.removeIf(student -> student.getAverage() < 3);
    }
}
