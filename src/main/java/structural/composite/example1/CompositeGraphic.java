package structural.composite.example1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guz_us on 14.03.2017.
 */
public class CompositeGraphic implements Graphic {

    private List<Graphic> childGraphics = new ArrayList<>();

    public void print() {
        for (Graphic graphic : childGraphics) {
            graphic.print();
        }
    }

    public int getSum() {
        int sum = 0;
        for (Graphic graphic : childGraphics) {
            sum += graphic.getSum();
        }
        return sum;
    }

    public void addGraphic(Graphic graphic) {
        this.childGraphics.add(graphic);
    }

    public void remove(Graphic graphic) {
        this.childGraphics.remove(graphic);
    }


}
