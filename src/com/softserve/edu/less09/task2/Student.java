package com.softserve.edu.less09.task2;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

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

@Data
@AllArgsConstructor
public class Student {
    private String name;
    private int course;
    private String group;
    private Map<Subject, List<Integer>> grades;
}
