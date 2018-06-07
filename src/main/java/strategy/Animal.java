package strategy;

/**
 * Created by Robotyk on 2018-06-06.
 */

public abstract class Animal {

    private String name;
    private AnimalMovement animalMovement;

    public Animal(String name, AnimalMovement animalMovement) {
        this.name = name;
        this.animalMovement = animalMovement;
    }

    public void move() {
        System.out.print(name);
        animalMovement.move();
    }
}
