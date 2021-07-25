package com.zipcodewilmington.froilansfarm;


import animal.Chicken;
import animal.Horse;
import crop.CornStalk;
import crop.PotatoTuber;
import crop.TomatoPlant;
import farm.CropRow;
import farm.Field;
import person.Farmer;
import person.Pilot;
import shelter.ChickenCoop;
import shelter.Stable;
import vehicle.CropDuster;
import vehicle.Tractor;

import java.util.Arrays;
import java.util.List;


public class FarmRoutine {
    public Field field;
    public Farmer froilan;
    public Pilot froilanda;

    private List<ChickenCoop> chickenCoopList;
    private List<Stable> stableList;
    public Tractor tractor;
    public CropDuster cropDuster;

    public FarmRoutine(){
        this.field = new Field(Arrays.asList(
                new CropRow<>(new TomatoPlant()),
                new CropRow<>(new CornStalk()),
                new CropRow<>(new PotatoTuber())));

        this.chickenCoopList = Arrays.asList(
                new ChickenCoop(),
                new ChickenCoop(),
                new ChickenCoop(),
                new ChickenCoop());

        this.stableList = Arrays.asList(
                new Stable(),
                new Stable(),
                new Stable());

        this.tractor = new Tractor();
        this.cropDuster = new CropDuster();
        this.froilan = new Farmer("Froilan");
        this.froilanda = new Pilot("Froilanda");
        tractor.mount(froilan);
        cropDuster.mount(froilanda);
    }

    public void populateStables(){
        for(Stable stable : stableList.subList(0, stableList.size() - 1)){
            stable.add(new Horse(null));
            stable.add(new Horse(null));
            stable.add(new Horse(null));
            stable.add(new Horse(null));
            stable.add(new Horse(null));
        }
    }

    public void populateChickenCoops(){
        for(ChickenCoop chickenCoop : chickenCoopList.subList(0, chickenCoopList.size() - 1)){
            chickenCoop.add(new Chicken(null));
            chickenCoop.add(new Chicken(null));
            chickenCoop.add(new Chicken(null));
            chickenCoop.add(new Chicken(null));
            chickenCoop.add(new Chicken(null));
        }
    }

    public int getNumberOfHorses(){
        int numberOfHorses = 0;
        for(Stable stable : getStables()) {
            numberOfHorses += stable.size();
        }
        return numberOfHorses;
    }

    public List<Stable> getStables(){
        return stableList;
    }

    public int getNumberOfChickens(){
        int numberOfChickens = 0;
        for(ChickenCoop chickenCoop : getChickenCoop()) {
            numberOfChickens += chickenCoop.size();
        }
        return numberOfChickens;
    }

   public List<ChickenCoop> getChickenCoop(){
        return chickenCoopList;
   }
}




