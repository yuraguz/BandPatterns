package structural.proxy.image;

/**
 * Created by Yura on 29.01.2017.
 */
public class ProxyDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("test.png");

        // картинка будет загружена с диска
        image.display();
        System.out.println("");

        // картинка не будет загружена с диска
        image.display();
    }
}
