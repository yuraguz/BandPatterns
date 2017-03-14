package structural.composite.example1;

/**
 * Тестовое приложение
 *
 * Created by guz_us on 14.03.2017.
 */
public class Demo {

    public static void main(String[] args) {
        new Demo();
    }

    public Demo() {

        Ellipse ellipse1 = new Ellipse("1", 5);
        Ellipse ellipse2 = new Ellipse("2", 10);
        Ellipse ellipse3 = new Ellipse("3", 15);

        CompositeGraphic graphic = new CompositeGraphic();
        graphic.addGraphic(ellipse2);
        graphic.addGraphic(ellipse3);


        CompositeGraphic graphic1 = new CompositeGraphic();
        graphic1.addGraphic(ellipse1);

        CompositeGraphic graphic2 = new CompositeGraphic();
        graphic2.addGraphic(ellipse2);

        CompositeGraphic graphic3 = new CompositeGraphic();
        graphic3.addGraphic(ellipse3);

        graphic.addGraphic(graphic1);
        graphic.addGraphic(graphic2);
        graphic.addGraphic(graphic3);

        graphic.print();
        System.out.println(graphic.getSum());


    }
}
