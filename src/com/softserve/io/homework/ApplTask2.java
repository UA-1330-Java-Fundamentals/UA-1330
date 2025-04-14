package com.softserve.io.homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ApplTask2 {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\Acer\\ua1330tasks\\src\\com\\softserve\\io\\homework\\filewithcode.txt";
        String fileToWrite = "C:\\Users\\Acer\\ua1330tasks\\src\\com\\softserve\\io\\homework\\filewithrepovedpublic.txt";
        List<String> list = new ArrayList<>();
        List<String> processed = new ArrayList<>();
        String initialWord = "public";
        String newWord = "private";

        try (BufferedReader br = Files.newBufferedReader(Paths.get(fileName))) {
            String str;
            list = br.lines().collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String lstIntem : list){
            processed.add(lstIntem.replace(initialWord, newWord));
        }

        try (BufferedWriter writter = new BufferedWriter(new FileWriter(fileToWrite))) {
            for (String value : processed) {
                writter.write(value + "\n");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    }

