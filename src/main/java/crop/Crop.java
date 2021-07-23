package crop;

import Interface.Produce;

public abstract class Crop implements Produce {
        //do I need to also implement edible?
    private boolean hasBeenHarvested = false;
    private boolean hasBeenFertilized = false;

    //public Crop(){

    //}
    public void harvestCrop() {
        hasBeenHarvested = true;
    }

    public void fertilizeCrop() {
        hasBeenFertilized= true;
    }

    public boolean hasBeenHarvested() {
        return hasBeenHarvested;
    }

    public boolean hasBeenFertilized() {
        return hasBeenFertilized;
    }


/*
So I want a TomatoPlant that if it hasBeenHarvested will return true and become an edible tomato
I want the same thing for the CornStalk, if it hasBeenHarvested then I want it to return turn and become an edible corn

 */


}
