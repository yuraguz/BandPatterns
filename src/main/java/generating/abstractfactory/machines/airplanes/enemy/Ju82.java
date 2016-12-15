package generating.abstractfactory.machines.airplanes.enemy;

import generating.abstractfactory.interfaces.Airplane;
import generating.abstractfactory.machines.airplanes.AbstractAirplane;
import generating.abstractfactory.machines.airplanes.AirplaneTypes;

/**
 * Created by guz_us on 15.12.2016.
 */
public class Ju82 extends AbstractAirplane implements Airplane {

    private static final String DESCRIPTION_TEXT = "This is Ju82 airplane";

    public Ju82() {
        super("Ju82", AirplaneTypes.BOMBER, 18);
    }

    public String description() {
        return DESCRIPTION_TEXT + " " + super.description();
    }
}
