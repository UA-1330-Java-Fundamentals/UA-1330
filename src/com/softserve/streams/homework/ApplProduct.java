package com.softserve.streams.homework;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ApplProduct {
    public static void main(String[] args) {
        Random rand= new Random();
        double randomValue = Math.round(1000.0 + (20000.0 - 1000.0) * rand.nextDouble());
        List<Product> products = Arrays.asList(
                new Product("Phone", LocalDate.now().minusMonths(6)),
                new Product("Laptop", LocalDate.now().minusYears(2)),
                new Product("Monitor", LocalDate.now().minusMonths(2)),
                new Product("Keyboard", LocalDate.now().minusMonths(30)),
                new Product("Mouse", LocalDate.now().minusYears(3)),
                new Product("Phone", LocalDate.now().minusDays(10)),
                new Product("Laptop", LocalDate.now().minusMonths(8)),
                new Product("Monitor", LocalDate.now().minusDays(30)),
                new Product("Keyboard", LocalDate.now().minusMonths(3)),
                new Product("Mouse",  LocalDate.now().minusDays(10)),
                new Product("Phone", LocalDate.now().minusMonths(2)),
                new Product("Laptop", LocalDate.now().minusDays(30)),
                new Product("Monitor",  LocalDate.now().minusMonths(2)),
                new Product("Keyboard", LocalDate.now().minusDays(30)),
                new Product("Mouse", LocalDate.now().minusMonths(3)),
                new Product("Phone", LocalDate.now().minusYears(5)),
                new Product("Laptop", LocalDate.now().minusDays(10)),
                new Product("Monitor", LocalDate.now().minusMonths(2)),
                new Product("Keyboard", LocalDate.now().minusDays(30)),
                new Product("Mouse",LocalDate.now().minusMonths(3))
        );
        System.out.println("Original products list:");
        products.forEach(System.out::println);

        List<Product> productsSorted = products.stream()
                .filter(p -> p.getManufactureCategory().equals("Phone"))
                .filter(p -> p.getPrice() > 3000.0)
                .filter(p -> p.getManufactureDate().isBefore(LocalDate.now().minusYears(1)))
                .toList();

       if (productsSorted.isEmpty()) {
           System.out.println("We don't have phones with price more than 3000.0 manufactured more that year ago");
       } else {
           System.out.println("Sorted products list:");
           productsSorted.forEach(System.out::println);
       }
    }
}
