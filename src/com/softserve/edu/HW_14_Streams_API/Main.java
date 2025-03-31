package com.softserve.edu.HW_14_Streams_API;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {


        //1. Create class Product with fields  manufacture category, date of manufacture and price. Add all needed methods
        //Create list Product with 20 objects
        //Obtain a sorted by the price list of products belong to category Phone with price > 3000, and the date of manufacture was more then 1 year ago.
        //Realize method
        //	static Optional<String> mostPopularName(Stream< Employee> employees) {
        //         		return null;     }

        System.out.println("------------Task 1------------");
        List<Product> products = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            products.add(new Product("Brand" + i, i % 2 == 0 ? "Phone" : "Laptop", LocalDate.now().minusMonths(i * 3), 2500 + i * 300));
        }
        System.out.println("\n Початковий список: ");
        products.forEach(System.out::println);

        System.out.println("\n Після фільтрації : ");
        List<Product> filteredProducts = products.stream()
                .filter(p -> p.getCategory().equals("Phone"))
                .filter(p -> p.getPrice() > 3000)
                .filter(p -> p.getDateOfManufacture().isBefore(LocalDate.now().minusYears(1)))
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .toList();

        filteredProducts.forEach(System.out::println);


        //2. For given a stream with objects of Employee class, return the optional, containing the most popular name.
        // If this stream is empty, Optional.empty should be returned. For example:
        //	empl1.name = “Bob”, empl2.name = “Din”,
        //	empl3.name = “Sam”, empl4.name = “Sam”
        //“Sam” should be returned.


        System.out.println("\n------------Task 2------------");
        System.out.println("\n Employee Name:");
        List<Employee> employees = Arrays.asList(
                new Employee("Bob"),
                new Employee("Din"),
                new Employee("Din"),
                new Employee("Sam")
        );

        employees.forEach(System.out::println);

        System.out.println("\n Most Popular Employee Name:");

        Optional<String> mostPopular = mostPopularName(employees.stream());
        mostPopular.ifPresent(System.out::println);

    }

    public static Optional<String> mostPopularName(Stream<Employee> employees) {
        return employees.collect(Collectors.groupingBy(Employee::getName, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }
}
