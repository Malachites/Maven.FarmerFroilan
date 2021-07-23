package farm;

import crop.CornStalk;
import crop.Crop;
import org.junit.Assert;
import org.junit.Test;

public class CropRowTest {
    private Crop CornStalk;

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
        cropR.addCropRow(CornStalk);

    //WHEN
        Integer actual = cropR.getSize();
        Integer expected = 1;
    //THEN
        Assert.assertFalse(expected.equals(actual));
    }


    @Test
    public void removeAllCropsTest(){
        CropRow cropy = new CropRow();
        cropy.removeAllCrops();

        Assert.assertTrue(cropy.crops.isEmpty());
    }


}
