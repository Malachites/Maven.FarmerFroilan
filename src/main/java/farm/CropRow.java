package farm;

import crop.Crop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CropRow< SomeTypeOfCrop extends Crop> { /// THIS

    List<SomeTypeOfCrop> crops;

    public CropRow(SomeTypeOfCrop... crops){
        this(Arrays.asList(crops));
    }
    public CropRow(List<SomeTypeOfCrop> crops){
        this.crops = crops;
    }

    public CropRow() {

        this(new ArrayList<>());
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
    public List<SomeTypeOfCrop> getCropRow() {

        return crops;
    }




    }

