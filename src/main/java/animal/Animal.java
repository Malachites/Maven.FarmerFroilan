package animal;

import Interface.Eater;
import Interface.Edible;
import Interface.NoiseMaker;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal implements NoiseMaker, Eater<Edible> {
    String name;
    ArrayList<Edible> stomach;

    public Animal(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(){
        this.name = name;
    }


}
