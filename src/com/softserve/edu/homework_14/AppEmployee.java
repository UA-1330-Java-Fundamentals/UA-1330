package com.softserve.edu.homework_14;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AppEmployee {
    public static Optional<String> mostPopularName(Stream<Employee> employees) {

        if (employees == null) {
            return Optional.empty();
        }

        return employees
                .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Comparator.comparingLong(Map.Entry::getValue))
                .map(Map.Entry::getKey);
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Bob"),
                new Employee("Din"),
                new Employee("Sam"),
                new Employee("Sam")
        );

        Optional<String> mostPopular = mostPopularName(employees.stream());

        System.out.print("The most popular name is: ");
        mostPopular.ifPresent(System.out::println);
    }
}
