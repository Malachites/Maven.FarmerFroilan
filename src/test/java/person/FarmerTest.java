package person;

import Interface.Edible;
import Interface.Produce;
import crop.Egg;
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

}
