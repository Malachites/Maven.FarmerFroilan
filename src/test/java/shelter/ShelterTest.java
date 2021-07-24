package shelter;

import animal.Chicken;
import animal.Horse;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import person.Farmer;
import person.Person;

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

    @Test
    public void testContains() {
        //given
        boolean expectedValue=true;
        //when
        Horse horse=new Horse("JerseyHorses");
        Stable newStable=new Stable();
        newStable.add(horse);
        boolean actualValue=newStable.contains(horse);
        //then
        Assert.assertEquals(expectedValue,actualValue);

    }

    @Test
    public void testRemove() {
        //given
        String expectedValue=null;
        //when
        Person froilanda=new Farmer("Froilanda");
        FarmHouse newFarmHouse=new FarmHouse();
        newFarmHouse.add(froilanda);
        newFarmHouse.remove(froilanda);
        //then
        Assert.assertNull(expectedValue);
    }

    public void testIterator() {
    }
}
