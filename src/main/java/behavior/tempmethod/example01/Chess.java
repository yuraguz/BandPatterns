package behavior.tempmethod.example01;

/**
 * Created by Iurii_Guz on 4/21/2017.
 */
public class Chess extends Game {

    @Override
    protected void initializeGame() {
        System.out.println("Initializing chess game");
    }

    @Override
    protected void playGame() {
        System.out.println("Playing chess game");
    }

    @Override
    protected void endGame() {
        System.out.println("Ending chess game");
    }

    @Override
    protected void printWinner() {
        System.out.println("Printing chess winner");
    }
}
