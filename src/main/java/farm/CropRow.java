package farm;

import crop.Crop;

import java.util.ArrayList;

public class CropRow< SomeTypeOfCrop extends Crop> { /// THIS

    ArrayList<SomeTypeOfCrop> crops;

    public CropRow() {
        crops = new ArrayList<SomeTypeOfCrop>();
    }

    public Integer getSize() {
        return crops.size();
    }

    public void addCropRow(SomeTypeOfCrop crop) {
        crops.add(crop);
    }

    public void removeCrop(SomeTypeOfCrop crop) {
        crops.remove(crop);
    }

    public void removeAllCrops() {
        crops.clear();

    }
    public ArrayList<SomeTypeOfCrop> getCropRow() {
        return crops;
    }




    }

