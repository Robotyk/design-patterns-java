package decorator;

/**
 * Created by Robotyk on 2018-06-06.
 */

public abstract class Burger {

    protected String description = "Unknown burger";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
