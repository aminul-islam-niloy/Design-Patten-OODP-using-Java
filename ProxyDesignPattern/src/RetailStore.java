// RetailStore class demonstrating the use of the warehouse system
public class RetailStore {
    public static void main(String[] args) {
        Warehouse warehouseProxy = new WarehouseProxy();

        // Adding products to the warehouse
        warehouseProxy.addProduct("Laptop", 30);
        warehouseProxy.addProduct("Smartphone", 100);

        // Shipping products from the warehouse
        warehouseProxy.shipProduct("Laptop", 20);
        warehouseProxy.shipProduct("Smartphone", 30);
        warehouseProxy.shipProduct("Tablet", 10);  // Product not added, so insufficient stock

        // Adding more products to the warehouse
        warehouseProxy.addProduct("Tablet", 50);

        // Shipping products again
        warehouseProxy.shipProduct("Laptop", 15);
        warehouseProxy.shipProduct("Smartphone", 40);
        warehouseProxy.shipProduct("Tablet", 20);

        // Demonstrating the proxy pattern for a retail store with warehousing
    }
}