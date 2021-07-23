package vehicle;

import Interface.Rider;
import org.junit.Test;
import person.Pilot;

public class VehicleTest {
    @Test
    public void mountTest(){
        //given
        Vehicle cropDuster = new CropDuster();
        Rider<CropDuster> pilot = (Rider<CropDuster>) new Pilot(null);

        //when
        cropDuster.mount(pilot);

        //then


    }
    @Test
    public void dismountTest(){
        //given
        //when
        //then
    }
    @Test
    public void getNumberOfPassengersTest(){
        //given
        //when
        //then
    }
    @Test
    public void makeNoiseTest(){
        //given
        //when
        //then
    }
}
