public class GameApp{
    private StrategyType strategyType;

    public GameApp(StrategyType strategyType){
        this.strategyType = strategyType;
    }

    public void attack(){
        strategyType.attack();
    }    
    public void defend(){
        strategyType.defend();
    }
}