package com.softserve.conditionals;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class DogAppl {
    public static void main(String[] args) throws IOException {
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        Dog d3 = new Dog();

        Dog.Breed dogsBreed;

        d1.addADog("Enter name for a first dog: " , "Enter age for a first dog:",
                "Enter a breed first dog:");
        d2.addADog("Enter name for a second dog: " , "Enter age for a second dog:",
                "Enter a breed second dog:");
        d3.addADog("Enter name for a third dog: " , "Enter age for a third dog:",
                "Enter a breed third dog:");

        if (d1.getName() == d2.getName()) {
            System.out.println("These two dogs have the same name : " +
                    d1.getName() + " and " +d2.getName());
        } else if (d2.getName() == d3.getName()) {
            System.out.println("These two dogs have the same name : " +
                    d2.getName() + " and " +d3.getName());;
        }
          else if (d3.getName() == d1.getName()) {
            System.out.println("These two dogs have the same name : " +
                    d3.getName() + " and " +d1.getName())
        }
          else {
            System.out.println("All dogs have unique names : " + d1.getName() +
                    " and " + d2.getName() + " and " + d3.getName());
        }

        int max = d1.getAge();
        if (d2.getAge() > max) {
            max = d2.getAge();
            System.out.println(" The oldest dog is " +d2.getName() + " with breed " +
                    Dog.Breed.getBreedName(d2.getName()) + " and age :" + d2.getAge());
        } else if (d3.getAge() > max) {
            max = d3.getAge();
            System.out.println(" The oldest dog is " +d3.getName() + " with breed " +
                    Dog.Breed.getBreedName(d3.getName()) + " and age :" + d3.getAge());
        }
        else if ( max> d2.getAge() && max> d3.getAge()) {
            System.out.println(" The oldest dog is " +d1.getName() + " with breed " +
                    Dog.Breed.getBreedName(d1.getName()) + " and age :" + d1.getAge());
        }
        else {
            System.out.println("Seems dogs have same age");
        }
    }

}
