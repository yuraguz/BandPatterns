package behavior.tempmethod.example01;

/**
 * Created by Iurii_Guz on 4/21/2017.
 */
public class Monopoly extends Game {

    @Override
    protected void initializeGame() {
        System.out.println("Initializing monopoly game");
    }

    @Override
    protected void playGame() {
        System.out.println("Playing monopoly game");
    }

    @Override
    protected void endGame() {
        System.out.println("Ending monopoly game");
    }

    @Override
    protected void printWinner() {
        System.out.println("Printing monopoly winner");
    }

}
