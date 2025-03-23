/*
Create class Product with fields manufacture category, date of manufacture and price. Add all
needed methods
• Create list Product with 20 objects
• Obtain a sorted by the price list of products belong to category Phone with
price > 3000, and the date of manufacture was more then 1 year ago.
• Realize method
static Optional<String> mostPopularName(Stream< Employee> employees) {
return null; }
*/

package HomeWorkFromPDF.HomeWorkFromPDF14;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product {
    private String manufacture;
    private String category;
    private LocalDate dateOfManufacture;
    private int price;

    public Product(String manufacture, String category, LocalDate dateOfManufacture, int price) {
        this.manufacture = manufacture;
        this.category = category;
        this.dateOfManufacture = dateOfManufacture;
        this.price = price;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(LocalDate dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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

public class HomeWork1 {
    static Optional<String> mostPopularManufacture(Stream<Product> products) {
        return products
                .collect(Collectors.groupingBy(Product::getManufacture, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();

        productList.add(new Product("Apple", "Phone", LocalDate.of(2024, 3, 10), 5200));
        productList.add(new Product("Samsung", "Phone", LocalDate.of(2023, 12, 5), 1100));
        productList.add(new Product("Nike", "Clothing", LocalDate.of(2024, 1, 20), 200));
        productList.add(new Product("Adidas", "Clothing", LocalDate.of(2024, 2, 15), 14480));
        productList.add(new Product("Sony", "Phone", LocalDate.of(2022, 5, 30), 900));
        productList.add(new Product("LG", "Electronics", LocalDate.of(2023, 7, 10), 850));
        productList.add(new Product("Dell", "Computers", LocalDate.of(2023, 8, 25), 1500));
        productList.add(new Product("HP", "Computers", LocalDate.of(2024, 2, 10), 1400));
        productList.add(new Product("Lenovo", "Phone", LocalDate.of(2023, 9, 15), 1300));
        productList.add(new Product("Asus", "Phone", LocalDate.of(2022, 11, 5), 8450));
        productList.add(new Product("Xiaomi", "Electronics", LocalDate.of(2023, 6, 12), 500));
        productList.add(new Product("OnePlus", "Phone", LocalDate.of(2023, 4, 20), 700));
        productList.add(new Product("Bosch", "Home Appliances", LocalDate.of(2022, 12, 8), 400));
        productList.add(new Product("Philips", "Home Appliances", LocalDate.of(2023, 10, 14), 350));
        productList.add(new Product("Tefal", "Home Appliances", LocalDate.of(2023, 11, 21), 300));
        productList.add(new Product("Samsung", "Home Appliances", LocalDate.of(2022, 8, 19), 600));
        productList.add(new Product("Canon", "Cameras", LocalDate.of(2023, 3, 3), 800));
        productList.add(new Product("Nikon", "Cameras", LocalDate.of(2023, 2, 25), 900));
        productList.add(new Product("Panasonic", "Cameras", LocalDate.of(2022, 7, 7), 750));
        productList.add(new Product("GoPro", "Cameras", LocalDate.of(2024, 1, 1), 650));
        productList.forEach(System.out::println);

        LocalDate oneYearAgo = LocalDate.now().minusYears(1);

        List<Product> productListTask2 = productList.stream()
                .filter(p -> p.getCategory().equals("Phone"))
                .filter(p -> p.getPrice() > 3000)
                .filter(p -> p.getDateOfManufacture().isBefore(oneYearAgo))
                .sorted(Comparator.comparingInt(Product::getPrice))
                .toList();
        System.out.println("\n\n");
        productListTask2.forEach(System.out::println);
        System.out.println("\n\n");

        mostPopularManufacture(productList.stream()).ifPresent(System.out::println);
    }
}
