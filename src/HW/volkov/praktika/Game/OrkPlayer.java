package HW.volkov.praktika.Game;

public class OrkPlayer extends Player{
    @Override
    public WarUnit makeUnit(){
        return new ArmoredWarUnitDecorator(new Ork());
    }
}
