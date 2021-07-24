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

    public FarmRoutine(Edible corn, Edible egg, Edible potato, Edible tomato, Animal horse1, Animal horse2,
                       Animal horse3, Animal horse4, Animal horse5, Animal horse6, Animal horse7, Animal horse8,
                       Animal horse9, Animal horse10, Shelter<Horse> stable1, Shelter<Horse> stable2, Shelter<Horse> stable3,
                       Animal chicken1, Animal chicken2, Animal chicken3, Animal chicken4, Animal chicken5, Animal chicken6,
                       Animal chicken7, Animal chicken8, Animal chicken9, Animal chicken10, Animal chicken11, Animal chicken12,
                       Animal chicken13, Animal chicken14, Animal chicken15, Shelter<Chicken> chickenCoop1, Shelter<Chicken> chickenCoop2,
                       Shelter<Chicken> chickenCoop3, Shelter<Chicken> chickenCoop4, Person froilanda, Person froilan,
                       Vehicle<Pilot> cropDuster, Vehicle<Farmer> tractor, Vehicle<Farmer> plower, CropRow<CornStalk> croprow1,
                       CropRow<TomatoPlant> croprow2, CropRow<PotatoTuber> croprow3, CropRow<PotatoTuber> croprow4,
                       CropRow<PotatoTuber> croprow5, Field field, Farm farm, Rider rider) {
        this.corn = corn;
        this.egg = egg;
        this.potato = potato;
        this.tomato = tomato;
        this.horse1 = horse1;
        this.horse2 = horse2;
        this.horse3 = horse3;
        this.horse4 = horse4;
        this.horse5 = horse5;
        this.horse6 = horse6;
        this.horse7 = horse7;
        this.horse8 = horse8;
        this.horse9 = horse9;
        this.horse10 = horse10;
        this.stable1 = stable1;
        this.stable2 = stable2;
        this.stable3 = stable3;
        this.chicken1 = chicken1;
        this.chicken2 = chicken2;
        this.chicken3 = chicken3;
        this.chicken4 = chicken4;
        this.chicken5 = chicken5;
        this.chicken6 = chicken6;
        this.chicken7 = chicken7;
        this.chicken8 = chicken8;
        this.chicken9 = chicken9;
        this.chicken10 = chicken10;
        this.chicken11 = chicken11;
        this.chicken12 = chicken12;
        this.chicken13 = chicken13;
        this.chicken14 = chicken14;
        this.chicken15 = chicken15;
        this.chickenCoop1 = chickenCoop1;
        this.chickenCoop2 = chickenCoop2;
        this.chickenCoop3 = chickenCoop3;
        this.chickenCoop4 = chickenCoop4;
        this.froilanda = froilanda;
        this.froilan = froilan;
        this.cropDuster = cropDuster;
        this.tractor = tractor;
        this.plower = plower;
        this.croprow1 = croprow1;
        this.croprow2 = croprow2;
        this.croprow3 = croprow3;
        this.croprow4 = croprow4;
        this.croprow5 = croprow5;
        this.field = field;
        this.farm = farm;
        this.rider = rider;
    }

    Edible corn = new Corn();
    Edible egg = new Egg();
    Edible potato = new Potato();
    Edible tomato = new Tomato();

    Animal horse1 = new Horse("Nelly"); //was read until I passed
    Animal horse2 = new Horse("Luda");
    Animal horse3 = new Horse("Biggie");
    Animal horse4 = new Horse("Tupac");
    Animal horse5 = new Horse("Eminem");
    Animal horse6 = new Horse("JayZ");
    Animal horse7 = new Horse("Nas");
    Animal horse8 = new Horse("Andre");
    Animal horse9 = new Horse("Kanye");
    Animal horse10 = new Horse("Missy");

    Shelter<Horse> stable1 = new Stable();
    Shelter<Horse> stable2 = new Stable();
    Shelter<Horse> stable3 = new Stable();


    Animal chicken1 = new Chicken("Clucky");//was red until I passed
    Animal chicken2 = new Chicken("Cluckrina");
    Animal chicken3 = new Chicken("Bagack");
    Animal chicken4 = new Chicken("Rooster");
    Animal chicken5 = new Chicken("Annie");
    Animal chicken6 = new Chicken("Molly");
    Animal chicken7 = new Chicken("Ms.Hannigan");
    Animal chicken8 = new Chicken("Daddy Warbucks");
    Animal chicken9 = new Chicken("Pepper");
    Animal chicken10 = new Chicken("Sophie");
    Animal chicken11 = new Chicken("Sandy");
    Animal chicken12 = new Chicken("Mrs.Greer");
    Animal chicken13 = new Chicken("Burt");
    Animal chicken14 = new Chicken("Roosevelt");
    Animal chicken15 = new Chicken("Mrs. Pugh");

    Shelter<Chicken> chickenCoop1 = new ChickenCoop();
    Shelter<Chicken> chickenCoop2 = new ChickenCoop();
    Shelter<Chicken> chickenCoop3 = new ChickenCoop();
    Shelter<Chicken> chickenCoop4 = new ChickenCoop();


    Person froilanda = new Pilot("Froilanda");
    Person froilan = new Farmer("Friolan");

    Vehicle<Pilot> cropDuster = new CropDuster();
    Vehicle<Farmer> tractor = new Tractor();
    Vehicle<Farmer> plower = new Plower();

    CropRow<CornStalk> croprow1 = new CropRow<CornStalk>();
    CropRow<TomatoPlant> croprow2 = new CropRow<TomatoPlant>();
    CropRow<PotatoTuber> croprow3 = new CropRow<PotatoTuber>();
    CropRow<PotatoTuber> croprow4 = new CropRow<PotatoTuber>();
    CropRow<PotatoTuber> croprow5 = new CropRow<PotatoTuber>();

    Field field = new Field();
    Farm farm = new Farm();

    Rider rider = new Rider() {
        @Override
        public void mount(Rideable rideable) {

        }

        @Override
        public void disMount() {

        }
    };




    public void routineFarm(){
        for (Stable horse : farm.getStables()) {
            horse1.eat(corn);
        }
    }

}//final brace

