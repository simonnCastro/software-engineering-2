public class VendingMachineDemo {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        
        machine.selectItem("Soda");
        machine.insertCoin(1.00);
        machine.insertCoin(0.50);
        
        machine.setOutOfOrder();
        machine.selectItem("Chips");
    }
}
