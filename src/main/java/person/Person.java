package person;

import Interface.*;
import animal.Animal;

import java.util.ArrayList;

public abstract class Person extends Animal implements NoiseMaker, Eater<Edible> {
    String name;
    ArrayList<Edible> amountEaten;


    public Person(String name) {
        super(name);
        this.name = name;
        amountEaten = new ArrayList<Edible>();

    }

    public String getName() {
        return name;
    }


    public String makeNoise() {

        return null;
    }

    public void eatAmount(Edible food){
        amountEaten.add(food);
    }

}
