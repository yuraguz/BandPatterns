package structural.bridge;

import structural.bridge.implementor.GreenCircle;
import structural.bridge.implementor.RedCircle;

/**
 * Created by Yura on 31.01.2017.
 */
public class BridgeDemo {
    public static void main(String[] args) {
        new BridgeDemo();
    }

    public BridgeDemo() {

        Shape redCirle = new Circle(10, 20, 10, new RedCircle());
        Shape greenCircle = new Circle(10, 20, 10, new GreenCircle());

        redCirle.draw();
        greenCircle.draw();

    }
}
