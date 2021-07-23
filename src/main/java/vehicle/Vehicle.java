package vehicle;

import Interface.NoiseMaker;
import Interface.Rideable;
import Interface.Rider;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle<SomeTypeOfRider extends Rider> implements NoiseMaker, Rideable {
    List<SomeTypeOfRider> riders = new ArrayList<>();


    @Override
    public String makeNoise() {
        return "BEEP BEEP!";
    }

    @Override
    public void mount(Rider rider) {
        riders.add((SomeTypeOfRider) rider);
    }

    @Override
    public void dismount(Rider rider) {
        riders.remove(rider);
    }

    @Override
    public List<Rider> getPassengers() {
        return null;
    }
}
