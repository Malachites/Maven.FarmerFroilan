package crop;

import Interface.Edible;

public class PotatoTuber extends Crop{

    public Edible yield() {
        if (hasBeenFertilized() && hasBeenHarvested()) {
            return new Potato();
        }
        else {
            return null;
        }
    }

    @Override
    public boolean hasBeenFertilized() {
        return false;
    }
}
