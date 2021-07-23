package vehicle;

import Interface.Rider;
import org.junit.Assert;
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
        Integer expected = 1;
        Integer actual = cropDuster.getPassengers().size();

        //then
        Assert.assertEquals(expected,actual);


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
