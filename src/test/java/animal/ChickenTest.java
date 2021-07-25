package animal;

import crop.Tomato;
import org.junit.Assert;
import org.junit.Test;
import person.Botanist;
import person.Farmer;
import person.Person;

public class ChickenTest {

    @Test
    public void nameTest(){
        //Given
        Chicken chicken = new Chicken("KFC");
        String expected = "KFC";

        //When
        String actual = chicken.getName();

        //Then
        Assert.assertEquals(expected, actual);


    }

    @Test
    public void eatTest(){
        //Given
        Chicken chicken = new Chicken("KFC");

        Tomato tomato = new Tomato();
        Integer expected = 1;


        //when
        chicken.eat(tomato);
        chicken.getStomach();
        Integer actual = chicken.getStomach().size();

        //Then
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void makeNoiseTest(){
        //Given
        Chicken chicken = new Chicken("KFC");
        String expected = "cluck, cluck, cluck";

        //When
        String actual = chicken.makeNoise();

        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void fertilizedTest(){
        //Given
        Chicken chicken = new Chicken("KFC");

        //When
        chicken.hasBeenFertilized();
        chicken.yield();

        //Then
        Assert.assertTrue(chicken.hasBeenFertilized());
    }


}
