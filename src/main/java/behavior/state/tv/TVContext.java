package behavior.state.tv;

/**
 * Created by Yura on 17.01.2017.
 */
public class TVContext implements State {

    private State state;

    public TVContext() {

    }

    public TVContext(State state) {
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override

    public void doAction() {
        this.state.doAction();
    }

}
