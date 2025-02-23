public class IdleState implements VendingMachineState {

    @Override
    public void selectItem(VendingMachine machine, String item) {
        if (machine.isItemAvailable(item)) {
            machine.setCurrentState(new ItemSelectedState());
            System.out.println("Item selected: " + item);
        } else {
            System.out.println("Item not available.");
        }
    }

    @Override
    public void insertCoin(VendingMachine machine, double amount) {
        System.out.println("Cannot insert coins while idle. Please select an item first.");
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Please select an item first.");
    }

    @Override
    public void setOutOfOrder(VendingMachine machine) {
        machine.setCurrentState(new OutOfOrderState());
        System.out.println("Vending machine is now out of order.");
    }
}
