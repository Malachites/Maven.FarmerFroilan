package person;

import Interface.Eater;
import Interface.Edible;
import Interface.NoiseMaker;
import crop.Crop;
import farm.CropRow;

import java.util.List;

public class Botanist extends Person implements NoiseMaker, Eater<Edible> {

    public Botanist(String name){
        super(name);
    }

    public String makeNoise(){

        return "Hi, Plant!";
    }

    public void plantCrop(Crop crop, CropRow cropRow){
        cropRow.addCropRow(crop);
    }

    @Override
    public List<Edible> getStomach() {

        return amountEaten;
    }



}
