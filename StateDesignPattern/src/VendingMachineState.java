// VendingMachineState interface representing the states
interface VendingMachineState {
    void selectProduct(int productId);
    void insertTaka(int amount);
    void dispenseProduct();
}