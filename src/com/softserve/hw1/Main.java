package com.softserve.hw1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException{

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String text = br.readLine();

       int age = Integer.parseInt(br.readLine());

       double temperature = Double.parseDouble(br.readLine());
        System.out.println("Text: " + text);
        System.out.println("Age: " + age);
        System.out.println("Temperature: " + temperature);

        System.out.print("Hello");
        System.out.println("World");
        }

    }
