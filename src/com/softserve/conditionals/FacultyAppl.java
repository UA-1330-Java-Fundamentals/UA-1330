package com.softserve.conditionals;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.Scanner;


public class FacultyAppl {
    public static void main(String[] args)  throws IOException{
        Faculty faculty = new Faculty();
        Faculty.CurrentSeason season ;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please the faculty name: ");
        String facultyName = br.readLine();

        System.out.print("Please enter the number of students: ");
        int numberStud = Integer.parseInt(br.readLine());

        faculty.setName(facultyName);
        faculty.setNumberOfStudents(numberStud);
        System.out.println(faculty.toString());

        System.out.print("Enter the current season name: ");


        String seasonName = br.readLine();
        season = Faculty.CurrentSeason.getBySeasonName(seasonName.toLowerCase());
        System.out.println("Now it's " + season.getSeasonName() + " which means " + season.getDescription() +
                        " for " + faculty.getName());
    }
}

