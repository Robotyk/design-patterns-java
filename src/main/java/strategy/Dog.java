package strategy;

/**
 * Created by Robotyk on 2018-06-06.
 */
public class Dog extends Animal {

    public Dog(String name) {
        super(name, new CanRun());
    }
}
