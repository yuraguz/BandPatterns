package structural.composite.example1;

/**
 * Подобъект компоновщика
 *
 * Created by guz_us on 14.03.2017.
 */
public class Ellipse implements Graphic {

    private String name;
    private int sum;

    public Ellipse(String name, int sum) {
        this.name = name;
        this.sum = sum;
    }

    public void print() {
        System.out.println("I am ellipse " + name);
    }

    public int getSum() {
        return this.sum;
    }

}
