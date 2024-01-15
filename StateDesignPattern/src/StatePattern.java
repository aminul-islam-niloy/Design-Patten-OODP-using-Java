public class StatePattern {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.selectProduct(1);   // Select a product
        vendingMachine.insertTaka(10);     // Insert coins
        vendingMachine.dispenseProduct();  // Dispense the product
    }
}