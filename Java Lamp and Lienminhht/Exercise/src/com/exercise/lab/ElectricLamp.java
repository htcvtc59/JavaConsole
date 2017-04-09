package com.exercise.lab;

/**
 * Created by Monkey.TNT on 10/19/2016.
 */
public class ElectricLamp {
    private boolean status;
    public void turnOff(){
        this.status=false;
        System.out.println(status);
    }
    public void turnOn(){
        this.status=true;
        System.out.println(status);
    }

    public static void main(String[] args) {
        SwitchButton btn = new SwitchButton();
        ElectricLamp lamp= new ElectricLamp();
        btn.connectToLamp(lamp);
        btn.switchOn();
        btn.switchOff();

    }
}
