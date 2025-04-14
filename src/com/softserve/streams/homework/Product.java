package com.softserve.streams.homework;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

public class Product implements Comparable<Product> {
    public String manufactureCategory;
    public LocalDate manufactureDate;
    double price;
    Random rand= new Random();


    public Product(String manufactureCategory, LocalDate manufactureDate) {
        this.manufactureCategory = manufactureCategory;
        this.manufactureDate = manufactureDate;
        this.price = Math.round(1000.0 + (10000.0 - 1000.0) * rand.nextDouble());;
    }

    public String getManufactureCategory() {
        return manufactureCategory;
    }

    public void setManufactureCategory(String manufactureCategory) {
        this.manufactureCategory = manufactureCategory;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product: " +
                "manufactureCategory='" + manufactureCategory + '\'' +
                ", manufactureDate=" + manufactureDate +
                ", price=" + price;
    }

    @Override
    public int compareTo(Product p) {
        return (int)(this.getPrice() - p.getPrice());
    }
}
