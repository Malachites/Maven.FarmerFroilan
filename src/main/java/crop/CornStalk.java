package crop;

//import Interface.Edible;

import Interface.Edible;

public class CornStalk extends Crop {
    public Edible yield() {
        if (hasBeenFertilized() && hasBeenHarvested()) {
            return new Corn();
        }
        else {
            return null;
        }
    }

    @Override
    public boolean hasBeenFertilized() {
        return true;
    }

//    @Override
//    public Edible yield() {
//        return null;
//    }
}
