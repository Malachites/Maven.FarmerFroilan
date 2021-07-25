package farm;

import animal.Animal;
import shelter.Shelter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Field {

    List<CropRow> field;

    //HashMap<String, Integer> storesCropRows = new HashMap<>();

    public Field(List<CropRow> field){
        this.field = field;
    }

    public Field(){

        this(new ArrayList<>());
    }


    public void addCropRow (CropRow cropRow){
        field.add(cropRow);
    }


    public Integer getFieldSize() {
        return field.size();
    }
}
