package animal;

import Interface.Eater;
import Interface.Edible;
import Interface.NoiseMaker;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal implements NoiseMaker, Eater<Edible> {
    String name;
    ArrayList<Edible> amountEaten;

    public Animal(String name){
        amountEaten = new ArrayList<Edible>();
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(){
        this.name = name;
    }


    @Override
    public List<Edible> getStomach() {

        return amountEaten;
    }

}
