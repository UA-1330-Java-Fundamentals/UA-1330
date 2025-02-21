package Appliance;

abstract class Appliance {
    String brand;
    String model;

    public Appliance(String brand, String model) {
        this.brand = brand;
        this.model = model;

    }
    abstract void displayInfo();

    /*public static void main (String[] args) {
        WashingMachine washingMachine = new WashingMachine("TWINWash", "LG", 15 );
        Refrigerator refrigerator = new Refrigerator("Family Hub", "Samsung", 600);
        washingMachine.displayInfo();
        refrigerator.displayInfo();
    }*/
}





