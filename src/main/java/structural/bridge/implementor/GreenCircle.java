package structural.bridge.implementor;

/**
 * Created by Yura on 31.01.2017.
 */
public class GreenCircle implements DrawAPI {

    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing GREENG circle with radius " + radius + " and x,y: " + x + " " + y);
    }
}
