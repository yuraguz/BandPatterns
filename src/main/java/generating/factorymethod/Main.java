package generating.factorymethod;

import generating.factorymethod.USSR.USSRTankCreator;
import generating.factorymethod.interfaces.Tank;
import generating.factorymethod.interfaces.TankCreator;


/**
 * Created by guz_us on 28.12.2016.
 */
public class Main {
    public static void main(String[] args) {

        TankCreator tankCreator = new USSRTankCreator();

        Tank tank = tankCreator.createT34();
        System.out.println(tank.getDescription());

        tank = tankCreator.createKV1();
        System.out.println(tank.getDescription());
        System.out.println();
        
        new Main();
    }

    public Main() {
        makeArmy( new USSRTankCreator() );
    }

    public void makeArmy(TankCreator creator) {
        creator.makeArmy();
    }

}
