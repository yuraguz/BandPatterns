package generating.factorymethod.USSRTanks;

import generating.factorymethod.interfaces.Tank;

/**
 * Created by guz_us on 28.12.2016.
 */
public class T34_Tank implements Tank {

    public static final String NAME = "T34";
    public static final String COUNTRY = "USSR";

    public String getDescription() {
        return NAME + " : " + COUNTRY;
    }

}
