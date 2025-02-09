public class GameAppDemo{
    public static void main(String[] args){
        GameApp knight = new GameApp (new Knight());
        knight.attack();
        knight.defend();

        GameApp wizard = new GameApp(new Wizard());
        wizard.attack();
        wizard.defend();

        GameApp archer = new GameApp(new Archer());
        archer.attack();
        archer.defend();
    }
}