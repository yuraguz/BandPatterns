package structural.proxy.image;

/**
 * Created by Yura on 29.01.2017.
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;

    }

    public void loadFromDisc(String fileName) {
        System.out.println("Loading from " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

}
