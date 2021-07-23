package crops;


import crop.PotatoTuber;
import org.junit.Assert;
import org.junit.Test;


public class PotatoTuberTest {
    @Test
    public void hasBeenFertilizedTest() {
        //Given
        PotatoTuber potato = new PotatoTuber();
        Assert.assertFalse(potato.hasBeenFertilized());

        //When
        potato.fertilizeCrop();
        potato.hasBeenFertilized();

        //Then
        Assert.assertTrue(potato.hasBeenFertilized());
    }

    @Test
    public void hasBeenHarvestedTest() {
        //Given
        PotatoTuber potato = new PotatoTuber();

        //When
        potato.harvestCrop();
        potato.yield();

        //Then
        Assert.assertTrue(potato.hasBeenHarvested());
    }
}
