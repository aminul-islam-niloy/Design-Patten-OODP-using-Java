// RealWarehouse class implementing Warehouse interface
import java.util.HashMap;

class RealWarehouse implements Warehouse {
    private HashMap<String, Integer> stock;

    public RealWarehouse() {
        this.stock = new HashMap<>();
    }

    @Override
    public void shipProduct(String product, int quantity) {
        int currentStock = stock.getOrDefault(product, 0);
        if (currentStock >= quantity) {
            stock.put(product, currentStock - quantity);
            System.out.println(quantity + " units of " + product + " shipped from the warehouse.");
        } else {
            System.out.println("Insufficient stock of " + product + " in the warehouse.");
        }
    }

    @Override
    public void addProduct(String product, int quantity) {
        int currentStock = stock.getOrDefault(product, 0);
        stock.put(product, currentStock + quantity);
        System.out.println(quantity + " units of " + product + " added to the warehouse.");
    }
}
