package decorator;

/**
 * Created by Robotyk on 2018-06-06.
 */
public class Ketchup extends BurgerDecorator {

    protected Burger burger;

    public Ketchup(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", ketchup";
    }

    @Override
    public double cost() {
        return .10 + burger.cost();
    }
}
