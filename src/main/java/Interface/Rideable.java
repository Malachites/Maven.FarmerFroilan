package Interface;

import java.util.ArrayList;
import java.util.List;

public interface Rideable<SomeTypeOfRider extends Rider> {

    void mount(SomeTypeOfRider rider);

    void dismount(SomeTypeOfRider rider);

    List<SomeTypeOfRider> getPassengers();
}
