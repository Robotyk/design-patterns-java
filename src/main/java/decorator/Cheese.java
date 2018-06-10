package decorator;

/**
 * Created by Robotyk on 2018-06-06.
 */

public class Cheese extends BurgerDecorator {

    protected Burger burger;

    public Cheese(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", cheese";
    }

    @Override
    public double cost() {
        return 0.40 + burger.cost();
    }
}
