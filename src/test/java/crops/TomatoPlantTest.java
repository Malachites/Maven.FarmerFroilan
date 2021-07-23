package crops;


import crop.TomatoPlant;
import org.junit.Assert;
import org.junit.Test;


//import static org.junit.Assert.assertEquals;

//tractor is a farm vehicle that can harvest a crop
    /*
    hasBeenFertilized and hasBeenHarvested determine if a crop is edible and if it has been picked
    So our test code should follow AAA (Arrange Act Assert) pattern. I guess similar to Given When Then

     */
public class TomatoPlantTest {

//    @Test
//    public void yieldTest2(){
//        //Given
//        TomatoPlant tomatoPlant = new TomatoPlant();
//        Assertions.assertTrue(tomatoPlant.hasBeenFertilized());
//
//        //When
//        Tomato tomato = tomatoPlant.yield();
//
//        //Then
//        Assertions.assertNotNull(tomato); //don't fully understand what assert not null is doing, rewrote a similar test below

   // }

    @Test
    public void hasBeenFertilizedTest() {
        //Given
        TomatoPlant tomato = new TomatoPlant();
        Assert.assertFalse(tomato.hasBeenFertilized());

        //When
        tomato.fertilizeCrop();
        tomato.hasBeenFertilized();

        //Then
        Assert.assertTrue(tomato.hasBeenFertilized());
    }

    @Test
    public void hasBeenHarvestedTest() {
        //Given
        TomatoPlant tomato = new TomatoPlant();

        //When
        tomato.harvestCrop();
        tomato.yield();

        //Then
        Assert.assertTrue(tomato.hasBeenHarvested());
    }
}

