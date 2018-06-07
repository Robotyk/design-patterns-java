package strategy;

/**
 * Created by Robotyk on 2018-06-06.
 */
public class Eagle extends Animal {

    public Eagle(String name) {
        super(name, new CanFly());
    }
}
