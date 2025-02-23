public class VendingMachine {

    private VendingMachineState currentState;
    private double balance;
    private double itemPrice = 1.50;
    private Map<String, Integer> inventory;

    public VendingMachine() {
        currentState = new IdleState();
        balance = 0;
        inventory = new HashMap<>();
        // Add some items to the inventory for testing
        inventory.put("Soda", 10);
        inventory.put("Chips", 5);
    }

    public void selectItem(String item) {
        currentState.selectItem(this, item);
    }

    public void insertCoin(double amount) {
        currentState.insertCoin(this, amount);
    }

    public void dispenseItem() {
        currentState.dispenseItem(this);
    }

    public void setOutOfOrder() {
        currentState.setOutOfOrder(this);
    }

    // Getters and Setters for balance, inventory, and state
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public boolean isItemAvailable(String item) {
        return inventory.containsKey(item) && inventory.get(item) > 0;
    }

    public void setCurrentState(VendingMachineState state) {
        this.currentState = state;
    }

    public void addBalance(double amount) {
        balance += amount;
    }
}