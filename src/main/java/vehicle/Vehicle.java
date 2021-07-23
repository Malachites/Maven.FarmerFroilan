package vehicle;

import Interface.NoiseMaker;
import Interface.Rideable;
import Interface.Rider;

import java.util.List;

public abstract class Vehicle<SomeTypeOfRider extends Rider> implements NoiseMaker, Rideable {
    List<SomeTypeOfRider> riders;

    public void mount(SomeTypeOfRider rider){
        riders.add(rider);
    }

    public void dismount(SomeTypeOfRider rider){
        riders.remove(rider);
    }

    public void getNumberOfPassengers(){
        riders.size();
    }
    @Override
    public String makeNoise() {
        return "BEEP BEEP!";
    }
}
