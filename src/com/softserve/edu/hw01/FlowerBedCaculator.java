package com.softserve.edu.hw01;

public class  FlowerBedCaculator {
    public static void main(String[] args) {
        
        int radius = 10;
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        
        
        System.out.println(" Flower bed radius is " + radius + ".");
        System.out.println(" Perimeter is " + perimeter + ".");
        System.out.println(" Area is " + area + ".");
        
    }
}