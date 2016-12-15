package generating.abstractfactory.factories;

import generating.abstractfactory.MachineFactory;
import generating.abstractfactory.interfaces.Airplane;
import generating.abstractfactory.interfaces.Tank;
import generating.abstractfactory.machines.airplanes.allies.Pe2;
import generating.abstractfactory.machines.tanks.allies.T34;

/**
 * Created by guz_us on 15.12.2016.
 */
public class MachineFactoryAllias implements MachineFactory {

    public Tank createTank() {
        return new T34();
    }

    public Airplane createAirplane() {
        return new Pe2();
    }
}
