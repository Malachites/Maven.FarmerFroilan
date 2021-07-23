package farm;

import shelter.ChickenCoop;
import shelter.FarmHouse;
import shelter.Stable;

import java.util.ArrayList;

public class Farm {

    ArrayList<ChickenCoop> chickenCoops;
    ArrayList<Field> fields;
    FarmHouse farmHouse;
    String farmName;

    ArrayList<Stable> stables;

    public String getFarmName() {
        return farmName;
    }

    public void setFarmName(String farmName) {
        this.farmName = farmName;
    }

    public ArrayList<Stable> getStables() {
        return stables;
    }

    public void setStables(ArrayList<Stable> stables) {
        this.stables = stables;
    }

    public ArrayList<ChickenCoop> getChickenCoops() {
        return chickenCoops;
    }

    public void setChickenCoops(ArrayList<ChickenCoop> chickenCoops) {
        this.chickenCoops = chickenCoops;
    }


    public void addChickenCoop(ChickenCoop someCoop) {
        chickenCoops.add(someCoop);
    }
}
