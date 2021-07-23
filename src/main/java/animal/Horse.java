package animal;

import Interface.Edible;
import Interface.NoiseMaker;
import Interface.Rideable;
import Interface.Rider;

import java.util.List;

public class Horse extends Animal implements Rideable, NoiseMaker {

    public Horse(String name) {
        super(name);
    }

    @Override
    public List<Edible> getStomach() {
        return null;
    }

    @Override
    public void eat(Edible edible) {

    }

    @Override
    public String makeNoise() {

        return null;
    }

    @Override
    public void mount(Rider rider) {

    }

    @Override
    public void dismount(Rider rider) {

    }

    @Override
    public List getPassengers() {
        return null;
    }
}
