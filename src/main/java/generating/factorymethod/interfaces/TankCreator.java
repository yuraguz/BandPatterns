package generating.factorymethod.interfaces;

/**
 * Created by guz_us on 28.12.2016.
 */
public interface TankCreator {


    // fabric methods
    Tank getTank(String name);
    Tank createT34();
    Tank createKV1();

    // make army
    public void makeArmy();

}
