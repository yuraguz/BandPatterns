package generating.prototype;

/**
 * Created by Yura on 16.01.2017.
 */
public class AnotherCookie extends Cookie {

    private String name;

    public AnotherCookie(int weight, String name) {
        super(weight);
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString()
            + " " + name;
    }

}
