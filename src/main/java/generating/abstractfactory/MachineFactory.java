package generating.abstractfactory;

import generating.abstractfactory.interfaces.Airplane;
import generating.abstractfactory.interfaces.Tank;

/**
 * Created by guz_us on 15.12.2016.
 */
public interface MachineFactory {
    Tank createTank();
    Airplane createAirplane();
}
