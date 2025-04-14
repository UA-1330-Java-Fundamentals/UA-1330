package com.softserve.finalproject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.google.gson.Gson;


import java.util.ArrayList;
import java.util.List;


import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;


public class ApplFruits {
    public static void serializeToXML(Fruit fruit) throws JsonProcessingException {XmlMapper xmlMapper = new XmlMapper();
        String xml = xmlMapper.writeValueAsString(fruit);
        System.out.println(xml);
        Fruit fruitFromXML = xmlMapper.readValue(xml, Fruit.class);
        System.out.println("Name: " + fruitFromXML.getName());
        System.out.println("color: " + fruitFromXML.getColor());
    }

    public static void main(String[] args) {
        Fruit someFruit = new Fruit();
        List<Fruit> listOfFruits = new ArrayList<Fruit>();
        listOfFruits.add(new Fruit("apple", "red"));
        listOfFruits.add(new Citrus("tangerine", "orange" , 0.23));
        listOfFruits.add(new Citrus("lemon", "yellow" , 0.005));
        listOfFruits.add(new Fruit("kiwi", "green"));
        listOfFruits.add(new Fruit("banana", "yellow"));

        List<Fruit> yellowFruits = someFruit.findYellowFruit(listOfFruits);
        if (!yellowFruits.isEmpty()) {
            someFruit.print(yellowFruits);
        }
        System.out.println("Initial list of fruits:");
        someFruit.print(listOfFruits);

        System.out.println("Sorted list of fruits:");
        List<Fruit> sortedList = someFruit.sortListOfFruitsByNames(listOfFruits);
        someFruit.print(sortedList);

        someFruit.writeFruitsToFile(sortedList);

        System.out.println("Fruits read from file:");
        someFruit.readFruitsFromFile();

        Fruit newFruit = someFruit.input();
        System.out.println(newFruit);

        }
    }

