package vehicle;

import Interface.Rider;
import org.junit.Assert;
import org.junit.Test;
import person.Farmer;
import person.Pilot;

import java.util.Arrays;
import java.util.List;

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
        Vehicle plower = new Plower();
        Rider<Plower> plowerRider1 = new Farmer(null);
        Rider<Plower> plowerRider2 = new Farmer(null);

        plower.mount(plowerRider1);
        plower.mount(plowerRider2);

        //when
        plower.dismount(plowerRider1);
        Integer expected = 1;
        Integer actual = plower.getPassengers().size();

        //then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void getPassengersTest(){
        //given
        Vehicle plower = new Plower();
        Rider<Plower> plowerRider1 = new Farmer(null);
        Rider<Plower> plowerRider2 = new Farmer(null);
        Rider<Plower> plowerRider3 = new Farmer(null);

        //when
       plower.riders.add(plowerRider1);
       plower.riders.add(plowerRider2);
       plower.riders.add(plowerRider3);

       List<Plower> actual = plower.getPassengers();
       List<Rider> expected = Arrays.asList(new Rider[]{plowerRider1, plowerRider2, plowerRider3});


        //then
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void makeNoiseTest(){
        //given
        Tractor tractor = new Tractor();

        //when
        String actual = tractor.makeNoise();
        String expected = "BEEP BEEP!";

        //then
        Assert.assertEquals(expected,actual);
    }
}
