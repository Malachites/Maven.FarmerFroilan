package animal;

import Interface.Edible;
import Interface.NoiseMaker;
import Interface.Rideable;
import Interface.Rider;

import java.util.ArrayList;
import java.util.List;

public class Horse extends Animal implements Rideable, NoiseMaker {
    private ArrayList<Edible> stomach ;
    List<Rider> horseRider;
    public Horse(String name) {
        super(name);
        this.stomach = new ArrayList<Edible>();
    }

    @Override
    public List<Edible> getStomach() {
        return stomach;
    }

    @Override
    public boolean eat(Edible edible) {
        int beforeMeal = this.stomach.size();
        this.stomach.add(edible);
        int afterMeal = this.stomach.size();
        if (beforeMeal < afterMeal) {
            return true;
        }
        return false;
    }


    @Override
    public void mount(Rider rider) {
    horseRider.add(rider);
    }

    @Override
    public void dismount(Rider rider) {
        horseRider.remove(rider);
        }

    @Override
    public List getPassengers() {
        return horseRider;
    }

    @Override
    public String makeNoise() {
        return "Neigh-Neigh";
    }
}
