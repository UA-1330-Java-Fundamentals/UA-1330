import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Product {
    private String name;
    private String manufactureCategory;
    private String dateOfManufacture;
    private int price;

    public Product(String name, String manufactureCategory, String dateOfManufacture, int price) {
        this.name = name;
        this.manufactureCategory = manufactureCategory;
        this.dateOfManufacture = dateOfManufacture;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getManufactureCategory() {
        return manufactureCategory;
    }

    public String getDateOfManufacture() {
        return dateOfManufacture;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", manufactureCategory='" + manufactureCategory + '\'' +
                ", dateOfManufacture='" + dateOfManufacture + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product("Samsung", "Phone", "2025", 10500),
                new Product("iPhone", "Phone", "2022", 28500),
                new Product("Dell", "Laptop", "2021", 21000),
                new Product("HP", "Laptop", "2020", 19000),
                new Product("Sony", "TV", "2023", 15000),
                new Product("LG", "TV", "2022", 14000),
                new Product("Xiaomi", "Phone", "2024", 9500),
                new Product("Lenovo", "Laptop", "2025", 20000),
                new Product("Panasonic", "Camera", "2021", 12000),
                new Product("Canon", "Camera", "2022", 13500),
                new Product("Asus", "Laptop", "2023", 22000),
                new Product("OnePlus", "Phone", "2023", 11000),
                new Product("Nikon", "Camera", "2020", 11000),
                new Product("Acer", "Laptop", "2022", 17500),
                new Product("Toshiba", "TV", "2021", 12500),
                new Product("Realme", "Phone", "2023", 8800),
                new Product("Motorola", "Phone", "2022", 9900),
                new Product("Philips", "TV", "2023", 13200),
                new Product("Fujifilm", "Camera", "2022", 14200),
                new Product("Microsoft", "Laptop", "2024", 25000));
        //products.forEach(System.out::println);
        List<Product> filteredProducts = products.stream()
                .sorted(Comparator.comparingInt(Product::getPrice))
                .filter(product -> product.getManufactureCategory().equalsIgnoreCase("Phone"))
                .filter(product -> product.getPrice() > 10000)
                .filter(product -> {
                    int manufactureYear = Integer.parseInt(product.getDateOfManufacture());
                    return 2025 - manufactureYear > 1;
                })
                .collect(Collectors.toList());

        filteredProducts.forEach(System.out::println);
    }
}
