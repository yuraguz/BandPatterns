package generating.abstractfactory.machines.airplanes.allies;

import generating.abstractfactory.interfaces.Airplane;
import generating.abstractfactory.machines.airplanes.AbstractAirplane;
import generating.abstractfactory.machines.airplanes.AirplaneTypes;

/**
 * Created by guz_us on 15.12.2016.
 */
public class Pe2 extends AbstractAirplane implements Airplane {

    public static final String DESCRIPTION_TEXT = "This is Pe2 airplane";

    public Pe2() {
        super("Pe2", AirplaneTypes.ATTACK_PLANE, 12);
    }

    @Override
    public String description() {
        return DESCRIPTION_TEXT + " " + super.description();
    }

}
