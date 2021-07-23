package farm;

import shelter.ChickenCoop;
import shelter.FarmHouse;
import shelter.Stable;

import java.util.ArrayList;

public class Farm {

    ArrayList<Stable> stables;
    ArrayList<ChickenCoop> chickensC;
    ArrayList<Field> fields;
    FarmHouse farmHouse;
    String farmName;

    public Farm(String farmName) {
        this.farmName = farmName;
        stables = new ArrayList<Stable>();
        chickensC = new ArrayList<ChickenCoop>();
        fields = new ArrayList<Field>();
    }

    public Farm(String farmName, ArrayList<Stable> stables, ArrayList<ChickenCoop> chickenCoops, ArrayList<Field> fields, FarmHouse farmHouse) {
        this.farmName = farmName;
        this.stables = stables;
        this.chickensC = chickenCoops;
        this.fields = fields;
        this.farmHouse = farmHouse;
    }
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
        return chickensC;
    }

    public void setChickenCoops(ArrayList<ChickenCoop> chickenCoops) {
        this.chickensC = chickenCoops;
    }


    public void addChickenCoop(ChickenCoop someCoop) {
        chickensC.add(someCoop);
    }

  public void addStable(Stable someStable){
        stables.add(someStable);
    }

    public FarmHouse getFarmHouse() {
        return farmHouse;
    }

    public void setFarmHouse(FarmHouse farmHouse) {
        this.farmHouse = farmHouse;
    }



}
