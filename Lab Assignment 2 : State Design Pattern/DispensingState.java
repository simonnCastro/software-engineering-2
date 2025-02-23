public class DispensingState implements VendingMachineState {

    @Override
    public void selectItem(VendingMachine machine, String item) {
        System.out.println("Cannot select item while dispensing.");
    }

    @Override
    public void insertCoin(VendingMachine machine, double amount) {
        System.out.println("Cannot insert coins while dispensing.");
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Dispensing item...");
        machine.setBalance(0);
        machine.setCurrentState(new IdleState());
        System.out.println("Item dispensed. Returning to idle state.");
    }

    @Override
    public void setOutOfOrder(VendingMachine machine) {
        machine.setCurrentState(new OutOfOrderState());
        System.out.println("Vending machine is now out of order.");
    }
}
