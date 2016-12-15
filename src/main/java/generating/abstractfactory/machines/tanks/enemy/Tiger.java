package generating.abstractfactory.machines.tanks.enemy;

import generating.abstractfactory.interfaces.Tank;
import generating.abstractfactory.machines.tanks.AbstractTank;

/**
 * Created by guz_us on 15.12.2016.
 */
public class Tiger extends AbstractTank implements Tank {

    private static final String DESCRIPTION_TEXT = "This is heavy tank Tiger";

    public Tiger() {
        super("Tiger", 24, 250);
    }

    public String description() {
        return DESCRIPTION_TEXT;
    }

    public String shoot() {
        return "Tiger tank is firing with power " + getPower() ;
    }


}
