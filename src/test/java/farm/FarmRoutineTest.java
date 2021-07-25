package farm;

import com.zipcodewilmington.froilansfarm.FarmRoutine;
import org.junit.Assert;
import org.junit.Test;

public class FarmRoutineTest {
    @Test
    public void test1(){
        //given
        FarmRoutine routine = new FarmRoutine();
        Assert.assertTrue(routine.getNumberOfHorses() == 0);

        // when
        routine.populateStables();

        //then
        Assert.assertEquals(routine.getNumberOfHorses(), 10);
    }

    @Test
    public void test2(){
        //given
        FarmRoutine routine = new FarmRoutine();
        Assert.assertTrue(routine.getNumberOfChickens() == 0);

        //when
        routine.populateChickenCoops();

        //then
        Assert.assertEquals(routine.getNumberOfChickens(), 15);
    }
}
