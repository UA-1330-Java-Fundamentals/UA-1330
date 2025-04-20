package com.softserve.edu.hw14;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductApp {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product(LocalDate.of(2021, 1, 15), "Phone", 534));
        products.add(new Product(LocalDate.of(2020, 5, 10), "Phone", 89));
        products.add(new Product(LocalDate.of(2022, 3, 20), "Laptop", 5324));
        products.add(new Product(LocalDate.of(2020, 8, 25), "Phone", 89));
        products.add(new Product(LocalDate.of(2021, 11, 30), "Tablet", 654));
        products.add(new Product(LocalDate.of(2019, 12, 1), "Phone", 4566));
        products.add(new Product(LocalDate.of(2023, 2, 15), "Laptop", 6455));
        products.add(new Product(LocalDate.of(2020, 7, 5), "Phone", 353));
        products.add(new Product(LocalDate.of(1990, 6, 10), "Phone", 8383));
        products.add(new Product(LocalDate.of(2021, 9, 20), "Phone", 6456));
        products.add(new Product(LocalDate.of(2020, 4, 15), "Laptop", 2355));
        products.add(new Product(LocalDate.of(2021, 3, 10), "Phone", 5453));
        products.add(new Product(LocalDate.of(2021, 5, 25), "Tablet", 545));
        products.add(new Product(LocalDate.of(2022, 8, 30), "Phone", 545));
        products.add(new Product(LocalDate.of(2020, 10, 5), "Laptop", 64565));
        products.add(new Product(LocalDate.of(2017, 11, 10), "Phone", 544));
        products.add(new Product(LocalDate.of(2020, 1, 20), "Tablet", 33));
        products.add(new Product(LocalDate.of(2029, 12, 25), "Phone", 37));
        products.add(new Product(LocalDate.of(2025, 7, 30), "Laptop", 7));
        products.add(new Product(LocalDate.of(2024, 4, 5), "Phone", 76));


    List<Product> filteredProducts = products.stream()
            .filter(product -> product.getPrice()>3000)
            .filter(product -> "Phone".equals(product.getCategory()))
            .filter(product -> product.getDate().getYear() < LocalDate.now().getYear() - 1)
            .collect(Collectors.toList());

    System.out.println(filteredProducts);
}}
