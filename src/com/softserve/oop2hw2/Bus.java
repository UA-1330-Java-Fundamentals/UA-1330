package com.softserve.oop2hw2;

public class Bus extends GroundVehicle{
   private String route;

   public Bus(){
       this.route = "";
   }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }
    @Override
    public void drive(){
        System.out.println("Bus is driving");
    }

    @Override
    public String toString() {
        return "Bus, " +
                " route:" + route;
    }
}
