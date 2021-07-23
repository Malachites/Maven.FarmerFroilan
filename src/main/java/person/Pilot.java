package person;

import Interface.*;

import java.util.List;

public class Pilot extends Person implements NoiseMaker, Eater<Edible>, Rider {

    public Pilot(String name) {
        super(name);
    }

    public String makeNoise(){

        return "Hi, Plane go brrr!";
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
