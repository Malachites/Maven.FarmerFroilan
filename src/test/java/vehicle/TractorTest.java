package vehicle;

import com.zipcodewilmington.froilansfarm.FarmRoutine;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import person.Farmer;

public class TractorTest extends TestCase {
    @Test
    public void startTest(){
        //given
        Farmer froilan=new Farmer("froilan");
        FarmRoutine farmRoutine=new FarmRoutine();
        Tractor tractor=new Tractor();
        tractor.mount(froilan);
        boolean beforeStarting=tractor.isOperatingOnFarm();
        //when
        tractor.start(farmRoutine);
        boolean afterStarting=tractor.isOperatingOnFarm();
        //then
        Assert.assertFalse(beforeStarting);
        Assert.assertTrue(afterStarting);
    }

}