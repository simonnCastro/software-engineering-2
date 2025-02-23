public class ItemSelectedState implements VendingMachineState {

    @Override
    public void selectItem(VendingMachine machine, String item) {
        System.out.println("Item already selected. Please insert coins.");
    }

    @Override
    public void insertCoin(VendingMachine machine, double amount) {
        machine.addBalance(amount);
        System.out.println("Coin inserted: " + amount);
        if (machine.getBalance() >= machine.getItemPrice()) {
            machine.setCurrentState(new DispensingState());
            machine.dispenseItem();
        }
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Please insert enough coins first.");
    }

    @Override
    public void setOutOfOrder(VendingMachine machine) {
        machine.setCurrentState(new OutOfOrderState());
        System.out.println("Vending machine is now out of order.");
    }
}
