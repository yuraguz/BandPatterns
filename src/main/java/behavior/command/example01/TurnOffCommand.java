package behavior.command.example01;

/**
 * Created by guz_us on 30.01.2017.
 */
public class TurnOffCommand implements Command {

    public Light light;

    public TurnOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }

    @Override
    public void undo() {

    }
}
