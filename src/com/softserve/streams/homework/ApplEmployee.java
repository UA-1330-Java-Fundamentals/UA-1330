package com.softserve.streams.homework;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class ApplEmployee {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Jack"),
                new Employee("Din"),
                new Employee("Bob"),
                new Employee("Bob"),
                new Employee("Alice"),
                new Employee("Bob"),
                new Employee("Sam"),
                new Employee("Bob"),
                new Employee("Bob"),
                new Employee("Sam")
        );

        employees.stream().max(comparing(Employee::getName)).ifPresentOrElse(System.out::println,
                ()-> System.out.println("names not found"));

        Map<String, Long> popularName2 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));

        System.out.println(popularName2);

    }
}
