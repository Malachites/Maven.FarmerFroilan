package person;

import org.junit.Assert;
import org.junit.Test;

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
}
