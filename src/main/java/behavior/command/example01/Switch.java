package behavior.command.example01;


import java.util.List;
import java.util.Stack;

/**
 * Created by guz_us on 30.01.2017.
 */
public class Switch {
    private TurnOffCommand turnOffCommand;
    private TurnOnCommand turnOnCommand;

    private Stack<Command> commands;

    public Switch(TurnOnCommand turnOnCommand, TurnOffCommand turnOffCommand) {
        this.turnOnCommand = turnOnCommand;
        this.turnOffCommand = turnOffCommand;
        commands = new Stack<>();
    }

    public void execute() {
        while (commands.size() > 0) {
            commands.pop().execute();
        }
    }

    public void flipUp() {
        commands.push(turnOnCommand);
    }

    public void flipDown() {
        commands.push(turnOffCommand);
    }
}
