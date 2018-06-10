package decorator;

/**
 * Created by Robotyk on 2018-06-06.
 */
public class ClassicBurger extends Burger {

    public ClassicBurger() {
        description = "Classic burger";
    }

    @Override
    public double cost() {
        return 3.50;
    }
}
