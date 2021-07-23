package person;

import crop.*;
import farm.CropRow;
import org.junit.Assert;
import org.junit.Test;

public class BotanistTest {
    @Test
    public void makeNoiseTest(){
        //Given
        Botanist botanist = new Botanist("Froilan");
        String expected = "Hi, Plant!";

        //When
        String actual = botanist.makeNoise();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void constructorTest(){
        //Given
        String expected = "Froilan";
        Botanist botanist = new Botanist(expected);

        //When
        String actual = botanist.getName();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void eatTest(){
        //Given
        Person froilan = new Botanist("Froilan");
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
        Person froilan = new Botanist("Froilan");
        Tomato tomato = new Tomato();
        Integer expected = 1;


        //when
        froilan.eat(tomato);
        froilan.getStomach();
        Integer actual = froilan.getStomach().size();

        //Then
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void eatTest3(){
        //Given
        Person froilan = new Botanist("Froilan");
        Potato potato = new Potato();
        Integer expected = 1;


        //when
        froilan.eat(potato);
        froilan.getStomach();
        Integer actual = froilan.getStomach().size();

        //Then
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void plantTest(){
        //Given
        Botanist botanist = new Botanist("Froilan");
        CornStalk cornStalk = new CornStalk();
        CropRow cropRow = new CropRow();
        Integer expected = 1;

        //When
        botanist.plantCrop(cornStalk, cropRow);
        Integer actual = cropRow.getSize();

        //Then
        Assert.assertEquals(expected, actual);






    }


}
