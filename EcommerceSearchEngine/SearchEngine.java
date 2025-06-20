
import java.util.*;

public class SearchEngine {
    public static void main(String[] args) {
        // Sample product list (can be extended or loaded from a database)
        List<String> products = Arrays.asList(
            "Laptop", "Smartphone", "Shoes", "Shirt", "Watch",
            "Camera", "Tablet", "Backpack", "Sunglasses", "Headphones"
        );

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter search keyword: ");
        String keyword = scanner.nextLine().toLowerCase();

        System.out.println("\nSearch Results:");
        boolean found = false;
        for (String product : products) {
            if (product.toLowerCase().contains(keyword)) {
                System.out.println("- " + product);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching products found.");
        }

        scanner.close();
    }
}
