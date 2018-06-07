package strategy;

/**
 * Created by Robotyk on 2018-06-06.
 */

public class Whale extends Animal {

    public Whale(String name) {
        super(name, new CanSwim());
    }
}
