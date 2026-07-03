import java.util.Arrays;
import java.util.Comparator;

public class SearchTest {

    public static void main(String[] args) {

        Product[] products = {
                new Product(103, "Keyboard", "Electronics"),
                new Product(101, "Laptop", "Electronics"),
                new Product(105, "Shoes", "Fashion"),
                new Product(102, "Mouse", "Electronics"),
                new Product(104, "Watch", "Accessories")
        };

        System.out.println("Linear Search");

        Product result1 = SearchOperations.linearSearch(products, 102);

        if (result1 != null)
            System.out.println(result1);
        else
            System.out.println("Product Not Found");

        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

        System.out.println("\nBinary Search");

        Product result2 = SearchOperations.binarySearch(products, 102);

        if (result2 != null)
            System.out.println(result2);
        else
            System.out.println("Product Not Found");
    }
}