package HW.volkov.praktika.Game;

public class Game {
    private WarUnit un1,un2;
    private Player pl1, pl2;
    public Game(Player player1,Player player2){
        pl1=player1;
        pl2=player2;
    }
    public void battle(){
        un1=pl1.makeUnit();
        un2=pl2.makeUnit();
        System.out.println("B");
    }
//

}
