package generating.factorymethod;

import generating.factorymethod.USSRTanks.KV1_Tank;
import generating.factorymethod.USSRTanks.T34_Tank;
import generating.factorymethod.interfaces.Tank;
import generating.factorymethod.interfaces.TankCreator;

/**
 * Created by guz_us on 28.12.2016.
 */
public class USSRTankCreator implements TankCreator {

    public Tank getTank(String name) {

        if ("t34".equals(name)) {
            return new T34_Tank();
        } else if ("kv1".equals(name)) {
            return new KV1_Tank();
        }

        return null;

    }
}
