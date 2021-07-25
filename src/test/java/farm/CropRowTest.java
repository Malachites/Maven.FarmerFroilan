package farm;

import static org.junit.Assert.*;



import crop.CornStalk;
import crop.Crop;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CropRowTest {



    @Before
    public void createTestData(){
        CropRow rows = new CropRow();
        Crop c = new CornStalk();


    }

    @Test
    public void getSize(){
        CropRow ko = new CropRow();
        Integer actual = ko.getSize();
        Integer expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addCropRowTest(){
        //GIVEN
        CropRow cropR = new CropRow();
        Crop c = new CornStalk();
        cropR.addCropRow(c);
        //WHEN

        Integer actual = cropR.getSize();
        Integer expected = 1;
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void removeCropRowTest(){
        //GIVEN
        CropRow cropR = new CropRow();
        Crop c = new CornStalk();
        cropR.addCropRow(c);
        cropR.removeCrop(c);
        //WHEN

        Integer actual = cropR.getSize();
        Integer expected = 0;
        //THEN
        assertEquals(expected, actual);
    }


    @Test
    public void removeAllCropsTest(){
        CropRow cropy = new CropRow();
        cropy.removeAllCrops();

        Assert.assertTrue(cropy.crops.isEmpty());
    }


}
