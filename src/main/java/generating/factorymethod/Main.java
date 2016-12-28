package generating.factorymethod;

import generating.factorymethod.interfaces.Tank;
import generating.factorymethod.interfaces.TankCreator;

import java.util.Map;

/**
 * Created by guz_us on 28.12.2016.
 */
public class Main {
    public static void main(String[] args) {

        TankCreator tankCreator = new USSRTankCreator();

        Tank tank = tankCreator.getTank("t34");
        System.out.println(tank.getDescription());

        tank = tankCreator.getTank("kv1");
        System.out.println(tank.getDescription());


    }


}
