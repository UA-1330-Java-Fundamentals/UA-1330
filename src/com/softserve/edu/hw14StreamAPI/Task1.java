package com.softserve.edu.hw14StreamAPI;
//Create class Product with fields  manufacture category, date of manufacture and price.
// Add all needed methods
//Create list Product with 20 objects
//Obtain a sorted by the price list of products belong to category Phone with
// price > 3000, and the date of manufacture was more then 1 year ago.

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        List<String> categories = Arrays.asList("Phone", "Laptop", "TV", "Tablet");

        //Creating the list of Products with 20 objects
        List<Product> products = IntStream.range(0, 20)
                .mapToObj(i -> new Product(
                        categories.get(random.nextInt(categories.size())),
                        LocalDate.now().minusDays(random.nextInt(1095)), // range about 3 years
                        1000 + random.nextDouble() * 5000 // от 1000 до 6000
                ))
                .toList();
        System.out.println("Initial generated product list: ");
        products.forEach(product -> System.out.printf(
                "\t%s, %s, %.2f%n",
                product.getManufactureCategory(),
                product.getDate(),
                product.getPrice()
        ));


        // Sorted by the price list of products belong to category Phone with price > 3000
        // & the date of manufacture was more then 1 year ago
        System.out.println("\t      Sorted by the price filtered list: ");
        List<Product> filtered = products.stream()
                .filter(p -> p.getManufactureCategory().equals("Phone"))
                .filter(p -> p.getPrice() > 3000)
                .filter(p -> p.getDate().isBefore(LocalDate.now().minusYears(1)))
                .sorted((p1, p2) -> p1.getPrice().compareTo(p2.getPrice()))
                .toList();
        filtered.forEach(filteredProduct -> System.out.printf(
                "\t%s, %s, %.2f%n",
                filteredProduct.getManufactureCategory(),
                filteredProduct.getDate(),
                filteredProduct.getPrice()
        ));
    }
}
