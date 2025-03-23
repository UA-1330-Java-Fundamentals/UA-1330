package homework14.task1;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> manufactureCategories = Arrays.asList("Phone", "Laptop", "TV", "KitchenTechnic" );
        Random random = new Random();

        List<Product> products = new ArrayList<>();

        for( var i = 0; i < 20; i++){
            String randomCategory = manufactureCategories.get(random.nextInt(manufactureCategories.size()));
            int randomPrice = random.nextInt(4901) + 100;
            LocalDate randomDate = LocalDate.now().minusDays(random.nextInt(365 * 5));
            Product product = new Product(randomCategory, randomDate, randomPrice);
            products.add(product);
        }
        System.out.println(products);

        List<Product> filteredProducts = products.stream()
                .filter( product -> product.getPrice() > 3000)
                .filter( product -> "Phone".equals(product.getManufactureCategory()))
                .filter(product -> product.getDateOfManufacture().isBefore(LocalDate.now().minusYears(1)))
                .sorted(Comparator.comparing(Product::getPrice).reversed())
                .toList();  // or .collect(Collectors.toList());

        System.out.println("Filtered products ");
        filteredProducts.forEach(System.out::println);



    }
}
