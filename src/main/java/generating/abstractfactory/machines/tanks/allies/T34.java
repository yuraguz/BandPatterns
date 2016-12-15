package generating.abstractfactory.machines.tanks.allies;

import generating.abstractfactory.interfaces.Tank;
import generating.abstractfactory.machines.tanks.AbstractTank;

/**
 * Created by guz_us on 15.12.2016.
 */
public class T34 extends AbstractTank implements Tank {

    private static final String DESCRIPTION_TEXT = "This is allies Tank T34";

    public T34() {
        super("T34", 15, 120);
    }

    public String description() {
        return DESCRIPTION_TEXT;
    }

    public String shoot() {
        return "T34 tank is firing with power " + getPower();
    }
}
