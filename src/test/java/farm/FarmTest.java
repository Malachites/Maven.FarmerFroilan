package farm;

import org.junit.Assert;
import org.junit.Test;
import shelter.ChickenCoop;

public class FarmTest {
    @Test
    public void addChickenCoopTest() {
        Farm farmie = new Farm();
        ChickenCoop someCoop = new ChickenCoop();
        farmie.addChickenCoop(someCoop);

        Assert.assertEquals(1, farmie.getChickenCoops().size());

    }
}