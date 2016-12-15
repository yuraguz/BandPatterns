package generating.abstractfactory.machines.airplanes;

import generating.abstractfactory.interfaces.Airplane;

/**
 * Created by guz_us on 15.12.2016.
 */
public abstract class AbstractAirplane implements Airplane {
    private String name;
    private AirplaneTypes type;
    private int cntBomb;

    public AbstractAirplane(String name, AirplaneTypes type, int cntBomb) {
        this.setName(name);
        this.setType(type);
        this.setCntBomb(cntBomb);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AirplaneTypes getType() {
        return type;
    }

    public void setType(AirplaneTypes type) {
        this.type = type;
    }

    public int getCntBomb() {
        return cntBomb;
    }

    public void setCntBomb(int cntBomb) {
        this.cntBomb = cntBomb;
    }

    public String description() {
        return "Type: " + type + " BombCnt: " + cntBomb;
    }

}
