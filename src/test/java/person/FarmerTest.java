package person;

import Interface.Edible;
import Interface.Produce;
import crop.Egg;
import crop.Tomato;
import org.junit.Assert;
import org.junit.Test;
import person.Farmer;

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


}
