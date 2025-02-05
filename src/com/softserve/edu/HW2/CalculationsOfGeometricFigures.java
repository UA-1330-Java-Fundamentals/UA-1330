package com.softserve.edu.HW2;

import java.util.Scanner;

public class CalculationsOfGeometricFigures {

    public static void main(String[] args) {

        double s1, s2, s3;

        Scanner sc = new Scanner(System.in);

        System.out.println("Input size of all side of triange ");

        s1 = sc.nextDouble();
        s2 = sc.nextDouble();
        s3 = sc.nextDouble();

        sc.close();

        TriangleFormulas tf = new TriangleFormulas(s1,s2,s3);
        System.out.println(tf);


    }

}
