import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class SalesTracker {
    private final List<Product> soldProducts = new ArrayList<>();
    private final Map<String, Integer> productPopularity = new HashMap<>();

    public void addSale(Product product) {
        soldProducts.add(product);
        productPopularity.put(product.name, productPopularity.getOrDefault(product.name, 0) + 1);
    }

    public void printSoldProducts() {
        for (Product product : soldProducts) {
            System.out.println("Sold product: " + product.name + " at price: " + product.price);
        }
    }

    public double calculateTotalSales() {
        double total = 0;
        for (Product product : soldProducts) {
            total += product.price;
        }
        return total;
    }

    public String getMostPopularProduct() {
        String mostPopular = null;
        int maxSales = 0;
        for (Map.Entry<String, Integer> entry : productPopularity.entrySet()) {
            if (entry.getValue() > maxSales) {
                maxSales = entry.getValue();
                mostPopular = entry.getKey();
            }
        }
        return mostPopular;
    }
    public static void main(String[] args) {
        SalesTracker tracker = new SalesTracker();

        // Добавляем продажи
        tracker.addSale(new Product("Milk", 1.99));
        tracker.addSale(new Product("Bread", 2.49));
        tracker.addSale(new Product("Eggs", 3.99));
        tracker.addSale(new Product("Milk", 1.99));
        tracker.addSale(new Product("Milk", 1.99));

        // Выводим список проданных товаров
        tracker.printSoldProducts();

        System.out.println("Total sales: " + tracker.calculateTotalSales());
        System.out.println("Most popular product: " + tracker.getMostPopularProduct());
    }
}


