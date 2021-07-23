package person;

import Interface.Rider;
import crop.Crop;
import crop.Egg;
import crop.Potato;
import crop.Tomato;
import org.junit.Assert;
import org.junit.Test;
import vehicle.CropDuster;
import vehicle.Tractor;
import vehicle.Vehicle;

public class PilotTest {
    @Test
    public void makeNoiseTest() {
        //Given
        Pilot pilot = new Pilot("Froilanda");
        String expected = "Hi, Plane go brrr!";

        //When
        String actual = pilot.makeNoise();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void constructorTest(){
        //Given
        String expected = "Froilanda";
        Pilot pilot = new Pilot(expected);

        //When
        String actual = pilot.getName();

        //Then
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void eatTest(){
        //Given
        Person froilanda = new Pilot("Froilanda");
        Egg egg = new Egg();
        Integer expected = 1;


        //when
        froilanda.eat(egg);
        froilanda.getStomach();
        Integer actual = froilanda.getStomach().size();

        //Then
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void eatTest2(){
        //Given
        Person froilanda = new Farmer("Froilanda");
        Tomato tomato = new Tomato();
        Integer expected = 1;


        //when
        froilanda.eat(tomato);
        froilanda.getStomach();
        Integer actual = froilanda.getStomach().size();

        //Then
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void eatTest3(){
        //Given
        Person froilanda= new Farmer("Froilanda");
        Potato potato = new Potato();
        Integer expected = 1;


        //when
        froilanda.eat(potato);
        froilanda.getStomach();
        Integer actual = froilanda.getStomach().size();

        //Then
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void mountTest(){
        //Given
        Vehicle cropDuster = new CropDuster();
        Rider<CropDuster> pilot = (Rider<CropDuster>) new Pilot(null);

        //When
        cropDuster.mount(pilot);
        Integer expected = 1;
        Integer actual = cropDuster.getPassengers().size();

        //Then
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void dismountTest() {
        //given
        Vehicle cropDuster = new CropDuster();
        Rider<CropDuster> pilot = new Pilot("Froilanda");


        cropDuster.mount(pilot);


        //when
        cropDuster.dismount(pilot);
        Integer expected = 0;
        Integer actual = cropDuster.getPassengers().size();

        //then
        Assert.assertEquals(expected, actual);

    }

}
