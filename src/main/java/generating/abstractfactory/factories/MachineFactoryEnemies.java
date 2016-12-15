package generating.abstractfactory.factories;

import generating.abstractfactory.MachineFactory;
import generating.abstractfactory.interfaces.Airplane;
import generating.abstractfactory.interfaces.Tank;
import generating.abstractfactory.machines.airplanes.enemy.Ju82;
import generating.abstractfactory.machines.tanks.enemy.Tiger;

/**
 * Created by guz_us on 15.12.2016.
 */
public class MachineFactoryEnemies implements MachineFactory {

    public Tank createTank() {
        return new Tiger();
    }

    public Airplane createAirplane() {
        return new Ju82();
    }
}
