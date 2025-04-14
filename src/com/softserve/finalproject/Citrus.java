package com.softserve.finalproject;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@JacksonXmlRootElement(localName = "Citrus")
public class Citrus extends Fruit implements Serializable{
    @JacksonXmlProperty(localName = "VitaminCGrams")
    double vitaminCGrams;

    public Citrus() {
        super();
        this.vitaminCGrams = 0.00;
    }

    public Citrus(String name, String color, double vitaminCGrams) {
        super(name, color);
        this.vitaminCGrams = vitaminCGrams;
    }

    public double getVitaminCGrams() {
        return vitaminCGrams;
    }

    public void setVitaminCGrams(double vitaminCGrams) {
        this.vitaminCGrams = vitaminCGrams;
    }

    @Override
    public String toString() {
        return  super.toString() +
                " vitaminCGrams:" + vitaminCGrams;
    }
   @Override
    public Fruit input(){
       Citrus newCitrus = new Citrus();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter a fruit name:");
            String fruitName = reader.readLine().toLowerCase();
            newCitrus.setName(fruitName);
            System.out.print("Enter a fruit color:");
            String fruitColor = reader.readLine().toLowerCase();
            newCitrus.setColor(fruitColor);
            System.out.print("Enter a grams of vitaminC:");
            double vitaminCGrams = reader.read();
            newCitrus.setVitaminCGrams(vitaminCGrams);
        } catch (IOException ex) {
            System.out.println("You've entered incorrect value");
            throw new RuntimeException(ex);
        }
        return newCitrus;
    }
}
