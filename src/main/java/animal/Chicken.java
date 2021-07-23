package animal;

import Interface.Edible;
import Interface.NoiseMaker;
import Interface.Produce;

import java.util.ArrayList;
import java.util.List;

public class Chicken extends Animal implements Produce, NoiseMaker {
    private ArrayList<Edible> stomach ;
    public Chicken(String name) {
        super(name);
        this.stomach = new ArrayList<Edible>();
    }

    public Integer getStomachSize() {
        return stomach.size();
    }

    public boolean eatFood(Edible edible) {
        int beforeMeal = this.stomach.size();
        this.stomach.add(edible);
        int afterMeal = this.stomach.size();
        if (beforeMeal < afterMeal) {
            return true;
        }
        return false;
    }
    public String makeNoise() {
        String noise = "cluck, cluck, cluck";
        return noise;
    }

    public List<Edible> getStomach() {
        return null;
    }

    public Boolean hasBeenFertilized() {
        return hasBeenFertilized();
    }
}
