package behavior.state.tv;

/**
 * Created by Yura on 17.01.2017.
 */
public class App {
    public static void main(String[] args) {
        new App();
    }

    public App() {

        TVContext tvContext = new TVContext();

        // TV turn ON
        tvContext.setState(new TVStartState());
        tvContext.doAction();

        // TV turn OFF
        tvContext.setState(new TVStopState());
        tvContext.doAction();

    }
}
