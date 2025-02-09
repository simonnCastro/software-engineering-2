public class Knight implements StrategyType{
    public void attack(){
        System.out.println("Knight attacks with a sword!");
    }
    public void defend(){
        System.out.println("Knight uses a shield to defend!");
	    System.out.println("Knight dodges to avoid attack!");
        System.out.println("Knight creates a magic barrier for defense!");
    }
}