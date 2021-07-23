package farm;

import animal.Animal;
import shelter.Shelter;

import java.util.ArrayList;
import java.util.HashMap;

public class Field {

    ArrayList<CropRow> field;

    //HashMap<String, Integer> storesCropRows = new HashMap<>();

    public Field(){
        this.field = new ArrayList<>();
    }


    public void addCropRow (CropRow cropRow){
        field.add(cropRow);
    }


    public Integer getFieldSize() {
        return field.size();
    }
}
