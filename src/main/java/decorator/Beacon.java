package decorator;

/**
 * Created by Robotyk on 2018-06-06.
 */
public class Beacon extends BurgerDecorator {

    protected Burger burger;

    public Beacon(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", beacon";
    }

    @Override
    public double cost() {
        return 0.6 + burger.cost();
    }
}
