// IdleState class representing the state when the machine is idle
class IdleState implements VendingMachineState 
{
    @Override
    public void selectProduct(int productId) {
        System.out.println("Product " + productId + " selected");
    }

    @Override
    public void insertTaka(int amount) {
        System.out.println(amount + " taka inserted");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Please select a product first");
    }
}