package person;

import Interface.*;
import crop.Egg;

import java.util.ArrayList;
import java.util.List;

public class Farmer extends Person implements NoiseMaker, Rider, Eater<Edible> {


    public Farmer(String name) {
        super(name);
    }

    public String makeNoise(){

        return "Hi, Darn tootin'!";
    }

    @Override
    public List<Edible> getStomach() {

        return amountEaten;
    }

    @Override
    public void mount(Rideable rideable) {

    }

    @Override
    public void disMount() {

    }
}
