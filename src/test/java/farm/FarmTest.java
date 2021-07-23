package farm;

import org.junit.Assert;
import org.junit.Test;
import shelter.ChickenCoop;
import shelter.FarmHouse;
import shelter.Stable;

import java.util.ArrayList;

public class FarmTest {
    @Test
    public void addChickenCoopTest() {
        Farm farmie = new Farm("MSO Farm");
        ChickenCoop coop = new ChickenCoop();
        farmie.addChickenCoop(coop);


        Assert.assertEquals(1, farmie.getChickenCoops().size());

    }
    @Test
    public void addStabelTest(){
        Farm fr = new Farm("horse farm");
        Stable st1 = new Stable();
        fr.addStable(st1);


   @Test
    public void addStable() {
       Farm littleFarm = new Farm();
       Stable moreHorses = new Stable();
       littleFarm.addStable(moreHorses);

       Assert.assertEquals(1, littleFarm.getStables().size());
   }
   @Test
   public void setChickenCoopTest(){
        Farm farm = new Farm();
        ArrayList<ChickenCoop> chickenCoops = new ArrayList<>();
        chickenCoops.add(new ChickenCoop());

        farm.setChickenCoops(chickenCoops);

        Assert.assertEquals(chickenCoops, farm.getChickenCoops());
   }


       @Test
       public void setStableTest(){
           Farm farm = new Farm();
           ArrayList<Stable> stables = new ArrayList<>();
           stables.add(new Stable());
           stables.add(new Stable());
           stables.add(new Stable());

           farm.setStables(stables);
//           Assert.assertArrayEquals( stables.toArray() , farm.getStables().toArray() );
//           Assert.assertEquals( stables.size(), farm.getStables().size());
           Assert.assertEquals(stables, farm.getStables());
       }


        Assert.assertEquals(1, fr.getStables().size());
    }


//   @Test
//    public void addStable(){
//        Farm littleFarm = new Farm();
//        Stable moreHorses = new Stable();
//        littleFarm.addStable(moreHorses);
//
//        Assert.assertEquals(1, littleFarm.getStables().size());
//
//
//    }

    @Test
    public void setName(){
        //given
        Farm far = new Farm("thr farm");
        String expected = "Malachite Farm";

        far.setFarmName(expected);
        String actual = far.getFarmName();

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void setFarmHouseTest() {
        Farm farm = new Farm("farm");
        FarmHouse farmHouse = new FarmHouse();
        farm.setFarmHouse(farmHouse);
        Assert.assertEquals(farmHouse, farm.getFarmHouse());

    }


}