package animal;

import Interface.Edible;
import Interface.NoiseMaker;
import Interface.Produce;
import crop.Egg;

import java.util.ArrayList;
import java.util.List;

public class Chicken extends Animal implements Produce, NoiseMaker {
    private ArrayList<Edible> stomach ;
    public Chicken(String name) {
        super(name);
        this.stomach = new ArrayList<Edible>();
    }

    public boolean eat(Edible edible) {
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
        return stomach;
    }

    @Override
    public Edible yield() {
        return new Egg();
    }

    @Override
    public boolean hasBeenFertilized() {
        return false;
    }
}
