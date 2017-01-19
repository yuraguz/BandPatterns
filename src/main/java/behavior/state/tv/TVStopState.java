package behavior.state.tv;

/**
 * Created by Yura on 17.01.2017.
 */
public class TVStopState implements State {

    @Override
    public void doAction() {
        System.out.println("TV is stopped");
    }

}
