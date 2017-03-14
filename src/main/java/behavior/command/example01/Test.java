package behavior.command.example01;

/**
 * Created by guz_us on 30.01.2017.
 */
public class Test {
    public static void main(String[] args) {
        new Test();
    }

    public Test() {

        Light light = new Light();

        Switch sw = new Switch(new TurnOnCommand(light), new TurnOffCommand(light));

        sw.flipUp();
        sw.flipDown();
        sw.flipDown();
        sw.flipUp();
        sw.flipUp();

        sw.execute();

    }
}
