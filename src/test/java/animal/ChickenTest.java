package animal;

import org.junit.Assert;
import org.junit.Test;

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

}
