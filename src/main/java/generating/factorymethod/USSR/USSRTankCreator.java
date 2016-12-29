package generating.factorymethod.USSR;

import generating.factorymethod.USSR.tanks.KV1_Tank;
import generating.factorymethod.USSR.tanks.T34_Tank;
import generating.factorymethod.interfaces.Tank;
import generating.factorymethod.interfaces.TankCreator;

/**
 * Created by guz_us on 28.12.2016.
 */
public class USSRTankCreator implements TankCreator {

    public Tank createT34() {
        return new T34_Tank();
    }

    public Tank createKV1() {
        return new KV1_Tank();
    }

    public Tank getTank(String name) {

        if ("t34".equals(name)) {
            return new T34_Tank();
        } else if ("kv1".equals(name)) {
            return new KV1_Tank();
        }

        System.out.println("TEST");
        System.out.println("From master");
        System.out.println("From master 1");


        return null;

    }

    public void makeArmy() {
        System.out.println(createT34().getDescription());
        System.out.println(createKV1().getDescription());
        System.out.println(createKV1().getDescription());
        System.out.println(createKV1().getDescription());
    }

}
