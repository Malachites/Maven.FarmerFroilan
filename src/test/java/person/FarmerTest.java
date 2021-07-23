package person;

import Interface.Edible;
import Interface.Produce;
import Interface.Rideable;
import Interface.Rider;
import animal.Horse;
import crop.Egg;
import crop.Potato;
import crop.Tomato;
import org.junit.Assert;
import org.junit.Test;
import person.Farmer;
import vehicle.CropDuster;
import vehicle.Plower;
import vehicle.Tractor;
import vehicle.Vehicle;

public class FarmerTest {


    @Test
    public void makeNoiseTest(){
        //Given
        Farmer farmer = new Farmer("Froilan");
        String expected = "Hi, Darn tootin'!";

        //When
        String actual = farmer.makeNoise();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void constructorTest(){
        //Given
        String expected = "Froilan";
        Farmer farmer = new Farmer(expected);

        //When
        String actual = farmer.getName();

        //Then
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void eatTest(){
        //Given
        Person froilan = new Farmer("Froilan");
        Egg egg = new Egg();
        Integer expected = 1;


        //when
        froilan.eat(egg);
        froilan.getStomach();
        Integer actual = froilan.getStomach().size();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void eatTest2(){
        //Given
        Person froilan = new Farmer("Froilan");
        Tomato tomato = new Tomato();
        Integer expected = 1;

        //When
        froilan.eat(tomato);
        froilan.getStomach();
        Integer actual = froilan.getStomach().size();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTest3(){
        //Given
        Person froilan = new Farmer("Froilan");
        Potato potato = new Potato();
        Integer expected = 1;

        //When
        froilan.eat(potato);
        froilan.getStomach();
        Integer actual = froilan.getStomach().size();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void mountTest(){
        //Given
        Vehicle tractor = new Tractor();
        Rider<Tractor> farmer = (Rider<Tractor>) new Farmer(null);

        //When
        tractor.mount(farmer);
        Integer expected = 1;
        Integer actual = tractor.getPassengers().size();

        //Then
        Assert.assertEquals(expected,actual);


    }

    @Test
    public void dismountTest() {
        //given
        Vehicle tractor = new Tractor();
        Rider<Tractor> farmer = new Farmer("Froilan");


        tractor.mount(farmer);


        //when
        tractor.dismount(farmer);
        Integer expected = 0;
        Integer actual = tractor.getPassengers().size();

        //then
        Assert.assertEquals(expected, actual);

    }



}
