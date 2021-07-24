package com.zipcodewilmington.froilansfarm;

import Interface.Edible;
import Interface.Rideable;
import Interface.Rider;
import animal.Animal;
import animal.Chicken;
import animal.Horse;
import crop.*;
import farm.CropRow;
import farm.Farm;
import farm.Field;
import person.Farmer;
import person.Person;
import person.Pilot;
import shelter.ChickenCoop;
import shelter.Shelter;
import shelter.Stable;
import vehicle.CropDuster;
import vehicle.Plower;
import vehicle.Tractor;
import vehicle.Vehicle;

public class FarmRoutine {
    public Field field;
    public Farmer froilan;
    public Pilot froilanda;
    public ChickenCoop coop1;
    public ChickenCoop coop2;
    public ChickenCoop coop3;
    public ChickenCoop coop4;
    public Stable stable1;
    public Stable stable2;
    public Stable stable3;
    public Corn corn;
    public Tomato tomato;
    public Egg egg;
    public Potato potato;
    public Tractor tractor;
    public CropDuster cropDuster;

    public FarmRoutine() {
        field = new Field();
        tractor=new Tractor();
        cropDuster=new CropDuster();
        coop1=new ChickenCoop();
        coop2=new ChickenCoop();
        coop3=new ChickenCoop();
        coop4=new ChickenCoop();
        stable1=new Stable();
        stable2=new Stable();
        stable3=new Stable();
        corn=new Corn();
        tomato=new Tomato();
        egg=new Egg();
        potato=new Potato();
        froilan=new Farmer("Froilan");
        froilanda=new Pilot("Froilanda");
        tractor.mount(froilan);
        cropDuster.mount(froilanda);


    }

    public Field getField(){
        return field;
    }

public void populateChickenCoop(){
    for (int i = 0; i < 5; i++) {
        coop1.add(new Chicken());
        
    }
}
//    Edible corn = new Corn();
//    Edible egg = new Egg();
//    Edible potato = new Potato();
//    Edible tomato = new Tomato();
//
//    Animal horse1 = new Horse("Nelly"); //was read until I passed
//    Animal horse2 = new Horse("Luda");
//    Animal horse3 = new Horse("Biggie");
//    Animal horse4 = new Horse("Tupac");
//    Animal horse5 = new Horse("Eminem");
//    Animal horse6 = new Horse("JayZ");
//    Animal horse7 = new Horse("Nas");
//    Animal horse8 = new Horse("Andre");
//    Animal horse9 = new Horse("Kanye");
//    Animal horse10 = new Horse("Missy");
//
//    Shelter<Horse> stable1 = new Stable();
//    Shelter<Horse> stable2 = new Stable();
//    Shelter<Horse> stable3 = new Stable();
//
//
//    Animal chicken1 = new Chicken("Clucky");//was red until I passed
//    Animal chicken2 = new Chicken("Cluckrina");
//    Animal chicken3 = new Chicken("Bagack");
//    Animal chicken4 = new Chicken("Rooster");
//    Animal chicken5 = new Chicken("Annie");
//    Animal chicken6 = new Chicken("Molly");
//    Animal chicken7 = new Chicken("Ms.Hannigan");
//    Animal chicken8 = new Chicken("Daddy Warbucks");
//    Animal chicken9 = new Chicken("Pepper");
//    Animal chicken10 = new Chicken("Sophie");
//    Animal chicken11 = new Chicken("Sandy");
//    Animal chicken12 = new Chicken("Mrs.Greer");
//    Animal chicken13 = new Chicken("Burt");
//    Animal chicken14 = new Chicken("Roosevelt");
//    Animal chicken15 = new Chicken("Mrs. Pugh");
//
//    Shelter<Chicken> chickenCoop1 = new ChickenCoop();
//    Shelter<Chicken> chickenCoop2 = new ChickenCoop();
//    Shelter<Chicken> chickenCoop3 = new ChickenCoop();
//    Shelter<Chicken> chickenCoop4 = new ChickenCoop();
//
//
//    Person froilanda = new Pilot("Froilanda");
//    Person froilan = new Farmer("Friolan");
//
//    Vehicle<Pilot> cropDuster = new CropDuster();
//    Vehicle<Farmer> tractor = new Tractor();
//    Vehicle<Farmer> plower = new Plower();
//
//    CropRow<CornStalk> croprow1 = new CropRow<CornStalk>();
//    CropRow<TomatoPlant> croprow2 = new CropRow<TomatoPlant>();
//    CropRow<PotatoTuber> croprow3 = new CropRow<PotatoTuber>();
//    CropRow<PotatoTuber> croprow4 = new CropRow<PotatoTuber>();
//    CropRow<PotatoTuber> croprow5 = new CropRow<PotatoTuber>();
//
//    Field field = new Field();
//    Farm farm = new Farm();
//
//    Rider rider = new Rider() {
//        @Override
//        public void mount(Rideable rideable) {
//
//        }
//
//        @Override
//        public void disMount() {
//
//        }
//    };




//    public void routineFarm(){
//        for (Stable horse : farm.getStables()) {
//            horse1.eat(corn);
//        }
//    }

}//final brace

