package com.softserve.finalproject;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@JacksonXmlRootElement(localName = "Fruit")
public class Fruit implements  Comparator<Fruit> {
    @JacksonXmlProperty(localName = "FruitName")
    private String name;
    @JacksonXmlProperty(localName = "FruitColor")
    private String color;

    public Fruit() {
    }

    public Fruit(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return Objects.equals(name, fruit.name) && Objects.equals(color, fruit.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int compare(Fruit f1, Fruit f2) {
        return f1.getName().compareTo(f2.getName());
    }

    public Fruit input() {
        Fruit newFruit = new Fruit();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter a fruit name:");
            String fruitName = reader.readLine().toLowerCase();
            newFruit.setName(fruitName);
            System.out.print("Enter a fruit color:");
            String fruitColor = reader.readLine().toLowerCase();
            newFruit.setColor(fruitColor);
        } catch (IOException ex) {
            System.out.println("You've entered incorrect value");
            throw new RuntimeException(ex);
        }
        return newFruit;
    }

    public void print(List<Fruit> listOfFruits) {
        listOfFruits
                .forEach(System.out::println);
    }

    public List<Fruit> findYellowFruit(List<Fruit> listOfFruits){
        System.out.println("Yellow fruits present in list:");
        List<Fruit> yellowFruits =  listOfFruits.stream()
                .filter(fruit -> "yellow".equals(fruit.getColor()))
                .toList();
        return yellowFruits;
    }

    public List<Fruit> sortListOfFruitsByNames(List<Fruit> listOfFruits){
        List<Fruit> sortedList =  listOfFruits.stream()
                   .sorted(Comparator.comparing(Fruit::getName))
                   .toList();
        return sortedList;
    }

    public void writeFruitsToFile( List<Fruit> sortedList){
        String fileToWrite = "C:\\Users\\Acer\\ua1330tasks\\src\\com\\softserve\\finalproject\\result.txt";
        try (PrintWriter pw = new PrintWriter(new FileOutputStream(fileToWrite))){
            for (Fruit fruitSorted : sortedList){
                pw.println(fruitSorted);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFruitsFromFile(){
        String fileName = "C:\\Users\\Acer\\ua1330tasks\\src\\com\\softserve\\finalproject\\fruits.txt";
        List<String> list = new ArrayList<>();
        try (BufferedReader br = Files.newBufferedReader(Paths.get(fileName))) {
            String str;
            list = br.lines().collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        list.forEach(System.out::println);
    }


    @Override
    public String toString() {
        return "Fruit:" + name +" color:" + color;
    }
}
