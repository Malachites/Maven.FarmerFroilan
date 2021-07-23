package com.zipcodewilmington.froilansfarm;

import animal.Chicken;
import animal.Horse;
import crop.Corn;
import crop.Egg;
import crop.Potato;
import crop.Tomato;
import person.Farmer;
import person.Pilot;
import shelter.ChickenCoop;
import shelter.Stable;

/**
 * Created by leon on 2/26/18.
 */
//like our exam
public class MainApplication {
//    public static void main(String[] args) {
//        DaysOfTheWeek simulation = new DaysOfTheWeek();
//        simulation.monday();
//        simulation.tuesday();
//        simulation.wednesday();
//        simulation.thursday();
//        simulation.friday();
//        simulation.saturday();
//        simulation.sunday();
//    }

    Corn corn = new Corn();
    Egg egg = new Egg();
    Potato potato = new Potato();
    Tomato tomato = new Tomato();

    Horse horse1 = new Horse("Nelly"); //was read until I passed
    Horse horse2 = new Horse("Luda");
    Horse horse3 = new Horse("Biggie");
    Horse horse4 = new Horse("Tupac");
    Horse horse5 = new Horse("Eminem");
    Horse horse6 = new Horse("JayZ");
    Horse horse7 = new Horse("Nas");
    Horse horse8 = new Horse("Andre");
    Horse horse9 = new Horse("Kanye");
    Horse horse10 = new Horse("Missy");

    Stable stable1 = new Stable();
    Stable stable2 = new Stable();
    Stable stable3 = new Stable();


    Chicken chicken1 = new Chicken("Clucky");//was red until I passed
    Chicken chicken2 = new Chicken("Cluckrina");
    Chicken chicken3 = new Chicken("Bagack");
    Chicken chicken4 = new Chicken("Rooster");
    Chicken chicken5 = new Chicken("Annie");
    Chicken chicken6 = new Chicken("Molly");
    Chicken chicken7 = new Chicken("Ms.Hannigan");
    Chicken chicken8 = new Chicken("Daddy Warbucks");
    Chicken chicken9 = new Chicken("Pepper");
    Chicken chicken10 = new Chicken("Sophie");
    Chicken chicken11 = new Chicken("Sandy");
    Chicken chicken12 = new Chicken("Mrs.Greer");
    Chicken chicken13 = new Chicken("Burt");
    Chicken chicken14 = new Chicken("Roosevelt");
    Chicken chicken15 = new Chicken("Mrs. Pugh");

    ChickenCoop chickenCoop1 = new ChickenCoop();
    ChickenCoop chickenCoop2 = new ChickenCoop();
    ChickenCoop chickenCoop3 = new ChickenCoop();
    ChickenCoop chickenCoop4 = new ChickenCoop();


    Pilot pilot = new Pilot("Froilanda");
    Farmer farmer = new Farmer("Friolan");


}


//    Froilan, a Farmer has a Farm consisting of
//
//            1 Field of 5 CropRow.
//            Row 1 has Corn
//            Row 2 has Tomato
//            Row 3 and beyond grows arbitrary vegetation.
//
//            15 Chicken across 4 ChickenCoop
//
//            10 animal.Horse across 3 Stable.
//
//            2 FarmVehicle
//
//            1 Aircraft
//
//            His sister, Froilanda, is a Pilot who uses a CropDuster.



//    Create a separate Test class for each day in the following scenario.
//
//        As a farmer, Froilan must stick to a rigorous agricultural routine.
//
//        Every morning, Froilan and Froilanda begin their morning by
//        Riding each animal.Horse in each Stable.
//        Feeding each animal.Horse 3 ear of Corn.
//        For breakfast,
//        Froilan eats 1 EarCorn, 2 Tomoato, and 5 Egg.
//        Froilanda eats 2 EarCorn, 1 Tomoato, and 2 Egg.
//
//        Sunday, Froilan plants 3 different type of Crop in his first, second, and third CropRow.
//
//        On Monday, his sister, Froilanda uses the CropDuster to fly over the Field and fertilize each of the CropRow
//
//        On Tuesday, Froilan uses his Tractor to harvest each Crop in each CropRow.
//


