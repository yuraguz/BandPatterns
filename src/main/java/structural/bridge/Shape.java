package structural.bridge;

import structural.bridge.implementor.DrawAPI;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yura on 31.01.2017.
 */
public abstract class Shape {

    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    List<String> list = new ArrayList<>();

    public abstract void draw();
}
