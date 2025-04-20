package com.softserve.edu.hw14;
import java.time.LocalDate;
import java.util.Objects;

public class Product {
   private String category;
   private LocalDate date;
   private double price;

    public Product(LocalDate date, String category, double price) {
        this.date = date;
        this.category = category;
        this.price = price;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(price, product.price) == 0 && Objects.equals(category, product.category) && Objects.equals(date, product.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, date, price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "category='" + category + '\'' +
                ", date=" + date +
                ", price=" + price +
                '}';
    }
}
