package generating.prototype;

/**
 * Created by Yura on 16.01.2017.
 */
public class Cookie implements Cloneable {

    protected int weight;

    public Cookie(int weight) {
        this.weight = weight;
    }

    @Override
    public Cookie clone() throws CloneNotSupportedException {
        Cookie copy = (Cookie) super.clone();
        return copy;
    }

    @Override
    public String toString() {
        return String.valueOf(this.weight);
    }
}
