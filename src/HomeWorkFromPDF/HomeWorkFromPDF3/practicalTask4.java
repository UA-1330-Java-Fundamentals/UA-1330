/*
4.
* Create class called Product that has the following fields:
• String name, double price and int quantity.
In main() method create four instances of type Product:
• Output the name and quantity of the most expensive item;
• Output the name of the items, which has the biggest quantity.
*/

package HomeWorkFromPDF.HomeWorkFromPDF3;

import java.util.Objects;

class Product{
    String name;
    double price;
    int quantity;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(price, product.price) == 0 && quantity == product.quantity && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, quantity);
    }

    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}

public class practicalTask4 {
    public static void main(String[] args) {
        Product product1 = new Product("Milk", 122, 2);
        Product product2 = new Product("Coffee", 2, 5);
        Product product3 = new Product("Tea", 67, 4);
        Product product4 = new Product("Cheese", 1, 99);

        Product mostExpensive = product1;
        if (product2.price > mostExpensive.price) mostExpensive = product2;
        if (product3.price > mostExpensive.price) mostExpensive = product3;
        if (product4.price > mostExpensive.price) mostExpensive = product4;

        System.out.println("Найдорощим продуктом є: " + mostExpensive.name + ", кількість: " + mostExpensive.quantity);

        Product largestQuantity = product1;
        if (product2.quantity > largestQuantity.quantity) largestQuantity = product2;
        if (product3.quantity > largestQuantity.quantity) largestQuantity = product3;
        if (product4.quantity > largestQuantity.quantity) largestQuantity = product4;

        System.out.println("Найбільше продукту є з назвою: " + largestQuantity.name);
    }
}
