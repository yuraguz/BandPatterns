package generating.abstractfactory.machines.tanks;

/**
 * Created by guz_us on 15.12.2016.
 */
public abstract class AbstractTank {

    private String name;
    private int power;
    private int health;

    public AbstractTank(String name, int power, int health) {
        this.setName(name);
        this.setPower(power);
        this.setHealth(health);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
