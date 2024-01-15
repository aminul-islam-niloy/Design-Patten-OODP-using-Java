// VendingMachine class representing the context
class VendingMachine {
    private VendingMachineState currentState;

    public VendingMachine() {
        currentState = new IdleState();
    }

    public void setState(VendingMachineState state) 
    {
        currentState = state;
    }

    public void selectProduct(int productId) {
        currentState.selectProduct(productId);
        if (currentState instanceof IdleState) {
            setState(new ProductSelectedState());
        }
    }

    public void insertTaka(int amount) {
        currentState.insertTaka(amount);
    }

    public void dispenseProduct() {
        currentState.dispenseProduct();
        if (currentState instanceof ProductSelectedState) {
            setState(new IdleState());
        }
    }
}