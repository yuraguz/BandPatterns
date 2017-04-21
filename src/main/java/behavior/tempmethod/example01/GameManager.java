package behavior.tempmethod.example01;

/**
 * Created by Iurii_Guz on 4/21/2017.
 */
public class GameManager {

    public static void main(String[] args) {

        final GameCode gameCode = GameCode.CHESS;

        Game game = new Monopoly();
        game.playOneGame(2);

    }
}
