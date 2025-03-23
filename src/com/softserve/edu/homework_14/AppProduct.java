package com.softserve.edu.homework_14;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AppProduct {
    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
                new Product("Phone", LocalDate.of(2025, 3, 23), 3500),
                new Product("Phone", LocalDate.of(2024, 5, 10), 4500),
                new Product("Phone", LocalDate.of(2023, 3, 23), 2000),
                new Product("Phone", LocalDate.of(2024, 4, 15), 5000),
                new Product("Laptop", LocalDate.of(2021, 3, 23), 8000),
                new Product("Phone", LocalDate.of(2024, 6, 5), 3000),
                new Product("Phone", LocalDate.of(2022, 2, 28), 3500),
                new Product("Phone", LocalDate.of(2024, 7, 18), 6000),
                new Product("Phone", LocalDate.of(2023, 8, 10), 7000),
                new Product("Phone", LocalDate.of(2025, 1, 1), 3200),
                new Product("Tablet", LocalDate.of(2021, 6, 14), 2500),
                new Product("Phone", LocalDate.of(2020, 11, 30), 3300),
                new Product("Phone", LocalDate.of(2024, 8, 15), 3100),
                new Product("Phone", LocalDate.of(2024, 12, 25), 4000),
                new Product("Phone", LocalDate.of(2023, 9, 1), 3300),
                new Product("Phone", LocalDate.of(2022, 3, 22), 3500),
                new Product("Phone", LocalDate.of(2023, 7, 5), 3300),
                new Product("Phone", LocalDate.of(2023, 2, 28), 4200),
                new Product("Phone", LocalDate.of(2024, 11, 10), 3900)
        );

        List<Product> filteredProducts = products.stream()
                .filter(p -> p.getCategory().equals("Phone"))
                .filter(p -> p.getPrice() > 3000)
                .filter(p -> p.getDateOfManufacture().isBefore(LocalDate.now().minusYears(1)))
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .toList();

        System.out.println("Sorted and filtered list: ");
        filteredProducts.forEach(System.out::println);
    }
}
