package animal;

import Interface.Rider;
import crop.Tomato;
import org.junit.Assert;
import org.junit.Test;
import person.Farmer;


public class HorseTest {
    @Test
    public void nameTest(){
        //Given
        Horse horse = new Horse("Horse");
        String expected = "Horse";

        //When
        String actual = horse.getName();

        //Then
        Assert.assertEquals(expected, actual);


    }

    @Test
    public void eatTest(){
        //Given
        Horse horse = new Horse("Horse");

        Tomato tomato = new Tomato();
        Integer expected = 1;


        //when
        horse.eat(tomato);
        horse.getStomach();
        Integer actual = horse.getStomach().size();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void makeNoiseTest(){
        //Given
        Horse horse = new Horse("Horse");
        String expected = "Neigh-Neigh";

        //When
        String actual = horse.makeNoise();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void mountTest(){
        //Given
        Horse horse = new Horse("Horse");
        Rider<Horse> farmer = (Rider<Horse>) new Farmer("Froilan");

        //When
        horse.mount(farmer);
        Integer expected = 1;
        Integer actual = horse.getPassengers().size();

        //Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void dismountTest() {
        //given
        Horse horse = new Horse("Horse");
        Rider<Horse> farmer = new Farmer("Froilan");


        horse.mount(farmer);


        //when
        horse.dismount(farmer);
        Integer expected = 0;
        Integer actual = horse.getPassengers().size();

        //then
        Assert.assertEquals(expected, actual);

    }

}
