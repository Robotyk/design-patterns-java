package decorator;

/**
 * Created by Robotyk on 2018-06-06.
 */

public class DoubleBurger extends Burger {

    public DoubleBurger() {
        description = "Double burger";
    }

    @Override
    public double cost() {
        return 6.50;
    }
}
