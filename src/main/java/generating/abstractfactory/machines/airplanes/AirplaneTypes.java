package generating.abstractfactory.machines.airplanes;

/**
 * Created by guz_us on 15.12.2016.
 */
public enum AirplaneTypes {
    ATTACK_PLANE("attack_plane"),
    BOMBER("bomber");

    private String name;

    public String getName() { return name; }

    private AirplaneTypes(String name) { this.name = name; }

}
