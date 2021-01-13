package HW.volkov.praktika.Game;

public class ManPlayer extends Player{
    @Override
    public WarUnit makeUnit(){
        return new Man();
    }
}
