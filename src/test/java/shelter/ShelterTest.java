package shelter;

import animal.Chicken;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class ShelterTest extends TestCase {
    @Test
    public void testAddChickens() {
        //given
        int expectedValue=1;
        Chicken chicken=new Chicken("BooBooChickens");
        ChickenCoop newChickenCoop=new ChickenCoop();
        //when
        newChickenCoop.add(chicken);
        int actualValue=newChickenCoop.size();
        //then
        Assert.assertEquals(expectedValue,actualValue);
    }

    public void testAdd() {
    }

    public void testContains() {
    }

    public void testRemove() {
    }

    public void testGet() {
    }

    public void testIterator() {
    }
}