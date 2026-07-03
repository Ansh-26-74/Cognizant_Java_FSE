public class InventoryTest {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        inventory.addProduct(new Product(101, "Laptop", 10, 65000));
        inventory.addProduct(new Product(102, "Mouse", 50, 500));
        inventory.addProduct(new Product(103, "Keyboard", 20, 1200));

        System.out.println("\nInventory:");

        inventory.displayProducts();

        System.out.println("\nUpdating Product...\n");

        inventory.updateProduct(102, "Wireless Mouse", 60, 700);

        inventory.displayProducts();

        System.out.println("\nDeleting Product...\n");

        inventory.deleteProduct(101);

        inventory.displayProducts();
    }

}
