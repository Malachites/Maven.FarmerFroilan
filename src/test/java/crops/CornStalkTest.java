package crops;


import crop.CornStalk;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CornStalkTest {
    @Test
    public void hasBeenFertilizedTest() {
        //Given
        CornStalk corn = new CornStalk();
        Assert.assertFalse(corn.hasBeenFertilized());

        //When
        corn.fertilizeCrop();
        corn.hasBeenFertilized();

        //Then
        Assertions.assertTrue(corn.hasBeenFertilized());
    }

    @Test
    public void hasBeenHarvestedTest() {
        //Given
        CornStalk corn = new CornStalk();

        //When
        corn.harvestCrop();
        corn.yield();

        //Then
        Assertions.assertTrue(corn.hasBeenHarvested());
    }
}
