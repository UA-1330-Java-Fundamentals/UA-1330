package com.softserve.edu.hw14StreamAPI;

import java.time.LocalDate;
import java.util.Objects;

public class Product {
    private String manufactureCategory;
    private LocalDate date;
    private Double price;

    public Product(String manufactureCategory, LocalDate date, Double price) {
        this.manufactureCategory = manufactureCategory;
        this.date = date;
        this.price = price;
    }

    public String getManufactureCategory() {
        return manufactureCategory;
    }

    public LocalDate getDate() {
        return date;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(manufactureCategory, product.manufactureCategory) && Objects.equals(date, product.date) && Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufactureCategory, date, price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "manufactureCategory='" + manufactureCategory + '\'' +
                ", date=" + date +
                ", price=" + price +
                '}';
    }
}
