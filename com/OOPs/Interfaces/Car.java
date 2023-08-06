package com.OOPs.Interfaces;

public  class Car implements CarInterface{
    public String getCarName(){
        String name="Tata";
        return name;
    }
    public int noOfTyres(){
        return 4;
    }

    @Override
    public void printVehicle() {

    }
}
