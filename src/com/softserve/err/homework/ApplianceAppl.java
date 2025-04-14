package com.softserve.err.homework;

public class ApplianceAppl {
    public static void main(String[] args) {
        WashingMachine washingMashine = new WashingMachine("LG" ,"TWINWash", 15);
        Refrigerator fridge = new Refrigerator("Samsung", "Family Hub", 600);
        washingMashine.displayInfo();
        fridge.displayInfo();

    }
}
