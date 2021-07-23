package farm;

import shelter.ChickenCoop;
import shelter.FarmHouse;
import shelter.Stable;

import java.util.ArrayList;
import java.util.List;


public class Farm {


    List<Stable> stables;
    List<ChickenCoop> chickenCoops;
    List<Field> fields;
    FarmHouse farmHouse;
    String farmName;

    public Farm(){
        stables = new ArrayList<>();
        chickenCoops = new ArrayList<>();
        fields = new ArrayList<>();


    }


    public String getFarmName() {
        return farmName;
    }

    public void setFarmName(String farmName) {
        this.farmName = farmName;
    }

    public List<Stable> getStables() {
        return stables;
    }

    public void setStables(ArrayList<Stable> stables) {
        this.stables = stables;
    }

    public List<ChickenCoop> getChickenCoops() {
        return chickenCoops;
    }

    public void setChickenCoops(ArrayList<ChickenCoop> chickenCoops) {
        this.chickenCoops = chickenCoops;
    }


    public void addChickenCoop(ChickenCoop someCoop) {
        chickenCoops.add(someCoop);
    }

  public void addStable(Stable moreHorses){
        stables.add(moreHorses);
    }

    public FarmHouse getFarmHouse() {
        return farmHouse;
    }

    public void setFarmHouse(FarmHouse farmHouse) {
        this.farmHouse = farmHouse;
    }



}
