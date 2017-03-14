package behavior.command.example01;

/**
 * Created by guz_us on 30.01.2017.
 */
public class TurnOnCommand implements Command {

    private Light light;

    public TurnOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }

    @Override
    public void undo() {

    }
}
