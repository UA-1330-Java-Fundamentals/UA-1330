package hw14.Streams;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;


public class Product {
    public Product(String manufactureCategory, LocalDate dateOfManufacture, int price) {
        this.manufactureCategory = manufactureCategory;
        this.dateOfManufacture = dateOfManufacture;
        this.price = price;
    }

    String manufactureCategory;
    LocalDate dateOfManufacture;
    int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(LocalDate dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public String getManufactureCategory() {
        return manufactureCategory;
    }

    public void setManufactureCategory(String manufactureCategory) {
        this.manufactureCategory = manufactureCategory;
    }

    @Override
    public String toString() {
        return "Product{manufactureCategory = '" + manufactureCategory + "', dateOfManufacture = " + dateOfManufacture + ", price = " + price + "}";
    }

    public static class Main {
        public static void main(String[] args) {

            List<Product> products = new ArrayList<>();
            products.add(new Product("Phone", LocalDate.of(2023,3, 1), 3500));
            products.add(new Product("Phone", LocalDate.of(2022, 10, 1), 3750));
            products.add(new Product("Notebook",LocalDate.of(2022, 3, 1), 23500));
            products.add(new Product("Phone",LocalDate.of(2022, 2, 1), 3050));
            products.add(new Product("Notebook",LocalDate.of(2023, 1, 1), 63500));
            products.add(new Product("Phone",LocalDate.of(2023, 5, 1), 3800));
            products.add(new Product("Notebook",LocalDate.of(2023, 4, 1), 23500));
            products.add(new Product("Phone",LocalDate.of(2024, 4, 1),3050));
            products.add(new Product("Notebook",LocalDate.of(2024, 4, 1), 46500));
            products.add(new Product("Phone",LocalDate.of(2023, 10, 1), 12000));
            products.add(new Product("Phone", LocalDate.of(2023, 6, 1), 3500));
            products.add(new Product("Phone", LocalDate.of(2023, 6, 1), 3750));
            products.add(new Product("Notebook",LocalDate.of(2022, 7, 1), 23500));
            products.add(new Product("Phone",LocalDate.of(2021, 10, 1), 3050));
            products.add(new Product("Notebook",LocalDate.of(2021, 10, 1), 63500));
            products.add(new Product("Phone",LocalDate.of(2021, 1, 1), 3800));
            products.add(new Product("Phone",LocalDate.of(2022, 1, 1), 25500));
            products.add(new Product("Phone",LocalDate.of(2023, 12, 1), 2760));
            products.add(new Product("Phone",LocalDate.of(2022, 9, 1), 1500));
            products.add(new Product("Phone",LocalDate.of(2023, 3, 1), 1200));

            LocalDate now = LocalDate.now();
            LocalDate yearAgo = now.minusYears(1);
            List<Product> filtered = products.stream()
                    .filter(product -> product.getManufactureCategory().contains("Phone"))
                            .filter(product -> product.getDateOfManufacture().isBefore(yearAgo))
                            .filter(person -> person.getPrice() > 3000)
                            .toList();
            filtered.forEach(System.out::println);
        }
      }
    }



