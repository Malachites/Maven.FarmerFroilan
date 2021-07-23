package crops;


import crop.PotatoTuber;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
        Assertions.assertTrue(potato.hasBeenFertilized());
    }

    @Test
    public void hasBeenHarvestedTest() {
        //Given
        PotatoTuber potato = new PotatoTuber();

        //When
        potato.harvestCrop();
        potato.yield();

        //Then
        Assertions.assertTrue(potato.hasBeenHarvested());
    }
}
