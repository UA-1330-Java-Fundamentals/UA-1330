package com.softserve.io.homework;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ApplTask1 {
    public static void main(String[] args) throws FileNotFoundException {
        int max = 0;
        String maxString = "";
        String birthdayData = "";
        String nameData = "" ;
        String fileName = "C:\\Users\\Acer\\ua1330tasks\\src\\com\\softserve\\io\\homework\\from.txt";
        String fileToWrite = "C:\\Users\\Acer\\ua1330tasks\\src\\com\\softserve\\io\\homework\\to.txt";
        List<String> list = new ArrayList<>();

        try (BufferedReader br = Files.newBufferedReader(Paths.get(fileName))) {
            String str;
            list = br.lines().collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        list.forEach(System.out::println);

        System.out.println("Number of lines in file is:" + list.size());
        for (String lstIntem : list){
           if(lstIntem.length() > max){
               maxString = lstIntem;
           }
        }
        System.out.println("The longest line in file is:" + maxString);
        String birthday = "birthdate";
        for (String lstIntem : list){
            if(lstIntem.toLowerCase().indexOf(birthday) > 0){
                birthdayData =lstIntem.substring(lstIntem.toLowerCase().indexOf(birthday));
                System.out.println(lstIntem.substring(lstIntem.toLowerCase().indexOf(birthday)));
            }
        }

        String name = "name";
        String comma = String.valueOf(',');
        for (String lstIntem : list){
            if(lstIntem.toLowerCase().indexOf(name) > 0){
               int indexofComma =lstIntem.toLowerCase().indexOf(comma);
                nameData = lstIntem.substring(lstIntem.toLowerCase().indexOf(name),indexofComma);
                System.out.println(lstIntem.substring(lstIntem.toLowerCase().indexOf(name),indexofComma));
            }
        }


    try (BufferedWriter br = Files.newBufferedWriter(Paths.get(fileToWrite))) {
          br.write(list.size() +"\n");
          br.write(maxString + "\n");
          br.write(birthdayData + "\n");
          br.write(nameData + "\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

