package person;

import Interface.*;

import java.util.ArrayList;
import java.util.List;

public class Pilot extends Person implements NoiseMaker, Eater<Edible>, Rider {



//    private ArrayList<Edible> stomach ;
//    List<Rideable> pilotRider;

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

//    @Override
//    public boolean eat(Edible edible) {
//        int beforeMeal = this.stomach.size();
//        this.stomach.add(edible);
//        int afterMeal = this.stomach.size();
//        if (beforeMeal < afterMeal) {
//            return true;
//        }
//        return false;
//
//    }


    @Override
    public void mount(Rideable rideable) {


    }

    @Override
    public void disMount() {
    }
}
