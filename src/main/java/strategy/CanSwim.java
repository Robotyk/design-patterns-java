package strategy;

/**
 * Created by Robotyk on 2018-06-06.
 */

public class CanSwim implements AnimalMovement {

    @Override
    public void move() {
        System.out.println(" is swimming.");
    }
}
