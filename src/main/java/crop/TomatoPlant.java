package crop;

import Interface.Edible;

public class TomatoPlant extends Crop {

    public Edible yield() {
        if (hasBeenFertilized() && hasBeenHarvested()) {
            return new Tomato();
        }
        else {
            return null;
        }
    }

    @Override
    public boolean hasBeenFertilized() {
        return true;
    }
}
