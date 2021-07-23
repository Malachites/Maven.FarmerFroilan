package farm;

import crop.CornStalk;
import crop.Crop;
import crop.TomatoPlant;
import org.junit.Assert;
import org.junit.Test;

public class FieldTest {




    @Test
    public void addCropRowTest() {
        Field newO = new Field();
        CropRow currentCropRow = new CropRow();
        newO.addCropRow(currentCropRow);

        Integer expected = 1;
        Integer actual = newO.field.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getFieldSizeTest() {
       Field currentF = new Field();
        Integer actual = currentF.getFieldSize();
        Integer expected = 0;
        Assert.assertEquals(expected, actual);
    }
}

  //  }
//
//    @Test
//    public void fieldConstructorTest() {
//        currentCropRow.addCropRow(Crop);
//        currentField.addCropRow(currentCropRow);
//
//        Integer expectedFieldSize = 1;
//        Integer actualFieldRowSize = currentField.field.size();
//
//        Assert.assertEquals(expectedFieldSize, actualFieldRowSize);
//    }

