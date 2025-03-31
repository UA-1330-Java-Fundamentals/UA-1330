package com.softserve.edu.HW_14_Streams_API;

import java.time.*;


public class  Product {
    private final String manufacture;
    private final String category;
    private final LocalDate dateOfManufacture;
    private final double price;

    public Product(String manufacture, String category, LocalDate dateOfManufacture, double price) {
        this.manufacture = manufacture;
        this.category = category;
        this.dateOfManufacture = dateOfManufacture;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "manufacture='" + manufacture + '\'' +
                ", category='" + category + '\'' +
                ", dateOfManufacture=" + dateOfManufacture +
                ", price=" + price +
                '}';
    }
}
