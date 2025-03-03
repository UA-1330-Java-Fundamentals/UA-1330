package com.softserve.interfases.sorting;

import java.util.Arrays;
import java.util.Comparator;

public class ApplStudent {
    public static void main(String[] args) {
        Student[] students = new Student[7];
                students[0] = new Student("Oksana", 26);
                students[1] = new Student("Bogdan", 27);
                students[2] = new Student("Orest", 24);
                students[3] = new Student("Ira", 23);
                students[4] = new Student("Yarko", 21);
                students[5] = new Student("Bogdan", 30);
                students[6] = new Student("Bogdan", 22);

        System.out.println("Original array " + Arrays.toString(students));
       // Arrays.sort(students);
       // Arrays.sort(students, new Student.ByDestName());
      //  Arrays.sort(students, new Student().new ByAge());
      //  Arrays.sort(students, new Student.ByNameAndAge());
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student st1, Student st2) {
                int byName = st1.getName().compareTo(st2.getName());
                return byName == 0 ? st1.getAge() - st2.getAge() : byName;
            }
        });
        System.out.println("Sorted array " + Arrays.toString(students));
    }
}
