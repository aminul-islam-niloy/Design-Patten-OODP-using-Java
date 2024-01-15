// ProductSelectedState class representing the state when a product is selected
class ProductSelectedState implements VendingMachineState {
   
    private int selectedProduct;

    @Override
    public void selectProduct(int productId) {
        System.out.println("Product " + productId + " already selected");
    }

    @Override
    public void insertTaka(int amount) {
        System.out.println(amount + " taka inserted");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Dispensing product " + selectedProduct);
    }
}