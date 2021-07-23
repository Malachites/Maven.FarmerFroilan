package vehicle;

import Interface.NoiseMaker;
import Interface.Rideable;
import Interface.Rider;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle<SomeTypeOfRider extends Rider> implements NoiseMaker, Rideable<SomeTypeOfRider> {
    List<SomeTypeOfRider> riders = new ArrayList<>();


    @Override
    public String makeNoise() {
        return "BEEP BEEP!";
    }

    @Override
    public void mount(SomeTypeOfRider rider) {
        riders.add(rider);
    }

    @Override
    public void dismount(Rider rider) {
        riders.remove(rider);
    }

    @Override
    public List<SomeTypeOfRider> getPassengers() {
        return riders;
    }
}
