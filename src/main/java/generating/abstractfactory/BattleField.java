package generating.abstractfactory;

import generating.abstractfactory.factories.MachineFactoryAllias;
import generating.abstractfactory.factories.MachineFactoryEnemies;
import generating.abstractfactory.interfaces.Airplane;
import generating.abstractfactory.interfaces.Tank;

/**
 * Created by guz_us on 15.12.2016.
 */
public class BattleField {

    public static void main(String[] args) {
        new BattleField();
    }

    public BattleField() {

        System.out.println("------------Allias side------------");
        createArmy(new MachineFactoryAllias());
        System.out.println();

        System.out.println("------------Enemy side-------------");
        createArmy(new MachineFactoryEnemies());

    }

    public void createArmy(MachineFactory factory) {
        Tank tank = factory.createTank();
        System.out.println(tank.description());
        System.out.println(tank.shoot());

        Airplane airplane = factory.createAirplane();
        System.out.println(airplane.description());

    }
}
